public class Valigia extends OggettoDepositabile{

    Valigia(int identificativo, float peso){
        super(identificativo, peso);
    }

    public String toString() {
        return "Informazioni valigia --> Identificativo: " + id + ";  Peso: " + peso + "kg";
    }
}
