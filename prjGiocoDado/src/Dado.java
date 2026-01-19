import java.util.Random;

public class Dado {

    private int nFacce;

    Dado(int nFacce){
        this.nFacce = nFacce;
    }

    public int lancio(){
        Random random = new Random();
        return (random.nextInt() * nFacce);
    }

    public int getNfacce(){
        return nFacce;
    }

    public String toString(){
        String str = "Il dado è composto da " + nFacce + " facce";
        return str;
    }

}
