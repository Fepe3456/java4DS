public class Pacco extends OggettoDepositabile{

    private float capienza;

    Pacco(int identificativo, float peso, float capienza){
        super(identificativo, peso);
        this.capienza = capienza;
    }

    public float getCapienza(){
        return capienza;
    }

    public String toString() {
        return "Informazioni pacco --> Identificativo: " + id + ";  Peso: " + peso + "kg;  Capienza: " + capienza;
    }
}
