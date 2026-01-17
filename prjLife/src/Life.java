import java.util.Random;

public class Life {

    private boolean[][] colonia;


    //Costruttore con parametri
    Life( int r, int c ){
        colonia = new boolean[r][c];
        resetColonia();
    }

    //Costruttore senza parametri
    Life(){
        int max=19;
        colonia = new boolean[(int)(Math.random()*max+2)][(int)(Math.random()*max+2)];
        resetColonia();
    }

    public void resetColonia(){
        Random random = new Random();
        for(int i=0; i<colonia.length; i++){
            for(int j=0; j<colonia[0].length; j++){
                //Generazione random tra i numeri 0 e 1, se il numero è 0 viene inserito true nella griglia colonia, altrimenti viene inserito false
                colonia[i][j] = Math.random()*1 < 0.5 ? true : false;
            }
        }
    }


    public void evoluzione( int n_gen, int maxVicini, int minVicini, int numNascita ){
        boolean[][] copiaColonia = copiaColonia();
        while( n_gen >= 0 ){
            for(int r=0; r<colonia.length; r++){
                for(int c=0; c<colonia[0].length; c++){
                    //Se la cella è vivente (true), se ha un numero di vicni compreso tra minVicini e maxVicini rimane viva, altrimenti muore
                    if( colonia[r][c] && (numViciniCelle(r,c)<minVicini && numViciniCelle(r,c)>maxVicini ) ){
                        copiaColonia[r][c] = false;
                    }
                    //Se la cella è vuota, solo se ha numero di vicni pari a numNascita può evolversi
                    else if( !colonia[r][c] && numViciniCelle(r,c)==numNascita ){
                        copiaColonia[r][c] = true;
                    }
                }
            }
            aggiornaColonia(copiaColonia);
            n_gen--;
        }
    }

    private int numViciniCelle(int r, int c ){ //Restituisce il numero di celle che contiene 'X'
        int cont = 0;
        for(int i=r-1; i<=r+1; i++){
            for(int j=c-1; j<=c+1; j++){
                //Controllo delle celle vicine alla cella colonia[r][c] contenenti true --> le celle che hanno indice che va fuori dalla griglia o la cella che è in posizione [r][c] non vengono controllate
                if( !(i==r && j==c) ){
                    if( i>=0 && i<colonia.length && j>=0  &&  j<colonia[0].length  && colonia[i][j] ){
                        cont++;
                    }
                }
            }
        }
        return cont;
    }

    private void aggiornaColonia( boolean[][] copiaColonia ){
        for(int i=0; i<colonia.length; i++){
            for(int j=0; j<colonia.length; j++){
                colonia[i][j] = copiaColonia[i][j];
            }
        }
    }

    private boolean[][] copiaColonia(){
        boolean[][] copiaColonia = new boolean[colonia.length][colonia[0].length];
        for(int i=0; i<colonia.length; i++){
            for(int j=0; j<colonia.length; j++){
                copiaColonia[i][j] = colonia[i][j];
            }
        }
        return copiaColonia;
    }


    public String toString(){
        String str = "";
        for(int i=0; i< colonia.length; i++){
            for(int j=0; j<colonia[0].length; j++){
                if( j==0 ){
                    str += "\n|";
                }
                if( colonia[i][j] ){
                    str += " X |";
                }
                else{
                    str += "   |";
                }
            }
        }
        return str;
    }

}
