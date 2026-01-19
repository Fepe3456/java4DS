public class Libro extends Oggetto {

    private String nome;

    Libro(String nome){
        super(nome);
    }

    public String toString(){
        return ("Il libro si intitola '" + nome + "'");
    }

}
