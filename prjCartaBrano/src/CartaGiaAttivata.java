public class CartaGiaAttivata extends Exception{

    CartaGiaAttivata(String message){
        super(message);
    }

    public CartaGiaAttivata(){
        super("Carta già attivata");
    }

}
