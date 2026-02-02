public class Auto implements Comparable<Auto> {

    Integer potenza;

    Auto(Integer potenza){
        this.potenza = potenza;
    }

    public Integer getPotenza(){
        return potenza;
    }

    public int compareTo(Auto b){
        int min;
        if( this.potenza.compareTo(b.potenza) <= 0 ){
            min = -1;
        }
        else{
            min = 1;
        }
        return min;
    }

    public String toString(){
        return "Potenza: " + potenza;
    }

}