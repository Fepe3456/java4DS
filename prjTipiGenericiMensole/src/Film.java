public class Film extends Oggetto {

    Film(String nome){
        super(nome);
    }

    public String toString(){
        return ("Il libro si intitola '" + getTitolo() + "'");
    }

}
