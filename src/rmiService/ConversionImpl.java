package rmiService;
public class ConversionImpl implements IConversion {
    public ConversionImpl() {
        // Constructeur par défaut nécessaire pour UnicastRemoteObject
        super();
    }

    @Override
    public double convertirMontant(double mt) {
        // Implémentez la logique de conversion ici
        // Pour l'exemple, retournez le montant tel quel
        return mt;
    }
}