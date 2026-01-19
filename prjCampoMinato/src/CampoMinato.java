import java.util.Random;

public class CampoMinato {

    //Servono due matrici: il campo e una per capire se la mossa è stata fatta
    private boolean[][] campo; //true=fiori, false=bombe
    private boolean[][] celleVisibili; //true=mossa fatta, false=mossa non fatta
    private int maxMine;
    private int nFiori;
    private int nMine;
    private int mineTrovate;
    private int fioriTrovati;
    private float livello;


    CampoMinato(int nR, int nC, float l, int maxM){
        campo = new boolean[nR][nC];
        celleVisibili = new boolean[nR][nC];
        maxMine = maxM;
        mineTrovate = 0;
        fioriTrovati = 0;

        for(int r=0; r<nR; r++){
            for(int c=0; c<nC; c++){
                campo[r][c] = true;
            }
        }
        for(int r=0; r<nR; r++){
            for(int c=0; c<nC; c++){
                celleVisibili[r][c] = false;
            }
        }

        caricaCampo(l, nR, nC);
    }

    private void caricaCampo(float l, int nR, int nC){
        int contMine = 0;
        int x = 0;
        int y =  0;

        livello = l;
        nMine = (int) ( nR * nC * livello );
        nFiori = nR*nC - nMine;
        Random random = new Random();
        do{
            x = random.nextInt(0, nR);
            y = random.nextInt(0, nC);
            if( campo[x][y] ){
                campo[x][y] = false;
                contMine++;
            }
        }while( contMine < nMine);
    }

    public void reset(float l, int maxM){
        maxMine = maxM;
        livello = l;
        caricaCampo(l, campo.length, campo[0].length);
    }

    public String mossa(int x, int y){
        String str = "Mossa già effettuata";
        if( !celleVisibili[x][y] ){
            celleVisibili[x][y] = true; //Ora la cella non è più tenuta nascosta
            str = toString(); //Alla stringa di ritono viene aggiunta la rappresentazione della tabella effettuata dal metodo toString()
            if( campo[x][y] ){ //Se nella cella c'è un fiore
                fioriTrovati++;
                if( fioriTrovati==nFiori ){ //Se il numero di fiori trovati è uguale a quello dei fiori presenti nel campo
                    str += "\n\nHAI VINTO!!!!!";
                }
            }
            else{ //Se nella cella c'è una mina
                mineTrovate++;
                if( mineTrovate==maxMine ){ //Se il numero di mine trovate è uguale a quello delle mine presenti nel campo
                    str += "\n\nHAI PERSO!!!";
                }
            }
        }
        return str;
    }

    public int getNfiori(){
        return nFiori;
    }
    public int getNmine(){
        return nMine;
    }

    public String toString(){
        String str = "";
        for(int r=0; r<campo.length; r++){
            str += "\n";
            for(int c=0; c<campo[0].length; c++){
                if( celleVisibili[r][c] ){
                    if( campo[r][c] ){
                        str += "  🌼 ";
                    }
                    else if( !campo[r][c] ){
                        str += "  💣 ";
                    }
                }
                else{
                    str += "  -  ";
                }
            }
        }
        return str;
    }

    public String toStringAll(){
        String str = "";
        for(int r=0; r<campo.length; r++){
            str += "\n";
            for(int c=0; c<campo[0].length; c++){
                    if( campo[r][c] ){
                        str += " 🌼 ";
                    }
                    else if( !campo[r][c] ){
                        str += "  💣 ";
                    }
            }
        }
        return str;
    }

}