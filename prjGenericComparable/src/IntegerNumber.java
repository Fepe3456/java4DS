public class IntegerNumber implements Comparable<IntegerNumber> {

    private Integer num;

    IntegerNumber(Integer num){
        this.num = num;
    }

    public Integer getNum(){
        return num;
    }
    public void setNum(Integer num){
        this.num = num;
    }

    public int compareTo(IntegerNumber object2){
        int ris = 0;
        if( num < object2.getNum() ){
            ris = 1;
        }
        else if( num > object2.getNum() ){
            ris = 2;
        }
        return ris;
    }

    public String toString(){
        return "The number has the value of " + num;
    }

}
