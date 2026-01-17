public class Giro {

    private float durata;
    private int numeroGiro;

    Giro(float durata, int numeroGiro){
        setDurata(durata);
        setNumeroGiro(numeroGiro);
    }

    public void setDurata(float durata){
        this.durata = durata;
    }

    public void setNumeroGiro(int numeroGiro){
        this.numeroGiro = numeroGiro;
    }

    public float getDurata(){
        return durata;
    }

    public int getNumeroGiro(){
        return numeroGiro;
    }

}
