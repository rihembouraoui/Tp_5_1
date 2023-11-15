package rmiServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ConversionServer {
    public static void main(String[] args) {
        try {
            // Créer un objet ConversionImpl
            rmiService.IConversion conversionObj = new rmiService.ConversionImpl();

            // Créer un registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrer l'objet ConversionImpl dans le registre RMI
            registry.rebind("ConversionService", conversionObj);

            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}