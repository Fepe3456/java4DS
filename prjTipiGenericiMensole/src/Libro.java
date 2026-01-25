public class Libro extends Oggetto {

    Libro(String nome){
        super(nome);
    }

    public String toString(){
        return ("Il libro si intitola '" + getTitolo() + "'");
    }

}
