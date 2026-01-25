public class Brano extends Oggetto {

    Brano(String nome){
        super(nome);
    }

    public String toString(){
        return ("Il libro si intitola '" + getTitolo() + "'");
    }

}
