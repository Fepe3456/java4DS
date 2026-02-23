public abstract class OggettoDepositabile {

    protected int id;
    protected float peso;

    OggettoDepositabile(int identificativo, float peso){
        this.id = identificativo;
        this.peso = peso;
    }

    public int getId(){
        return id;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }

    public abstract String toString();

}
