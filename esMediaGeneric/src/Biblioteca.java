public class Biblioteca {
    private int dl, numCataloghi;
    private Catalogo[] cataloghi;

    Biblioteca(int numero_cataloghi){
        dl = 0;
        this.numCataloghi = numero_cataloghi;
        cataloghi = new Catalogo[ numero_cataloghi ];
    }

    public void addCatalogo(Catalogo catalogo){
        cataloghi[dl] = catalogo;
    }
}
