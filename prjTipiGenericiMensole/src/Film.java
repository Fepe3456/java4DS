public class Film extends Oggetto {

    private String nome;

    Film(String nome){
        super(nome);
    }

    public String toString(){
        return ("Il libro si intitola '" + nome + "'");
    }

}
