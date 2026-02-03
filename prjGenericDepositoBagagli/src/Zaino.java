public class Zaino extends OggettoDepositabile{

    private float capienza;

    Zaino(int identificativo, float peso, float capienza){
        super(identificativo, peso);
        this.capienza = capienza;
    }

    public float getCapienza(){
        return capienza;
    }

    public String toString() {
        return "Informazioni zaino --> Identificativo: " + id + ";  Peso: " + peso + "kg;  Capienza: " + capienza;
    }
}
