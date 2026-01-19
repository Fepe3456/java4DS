public class Brano extends Oggetto {

    private String nome;

    Brano(String nome){
        super(nome);
    }

    public String toString(){
        return ("Il libro si intitola '" + nome + "'");
    }

}
