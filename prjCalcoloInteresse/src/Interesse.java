import java.math.*;

public class Interesse {
    public double semplice(double capitale, int anni, double tassoInteresse){
        double sommaSemplice;
        sommaSemplice = (capitale + anni*(capitale *(tassoInteresse/100)));
        return sommaSemplice;
    }

    public double composto(double capitale, int anni, double tassoInteresse){
        double sommaComposto;
        sommaComposto = capitale * (Math.pow((1 + (tassoInteresse / 100)), anni ));
        return sommaComposto;
    }
}
