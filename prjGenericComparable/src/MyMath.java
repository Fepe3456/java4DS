public class MyMath {
    public static <T extends Comparable<T>> T findMin(T a, T b){
        T min;
        if( a.compareTo(b) <= 0 ){
            min = a;
        }
        else{
            min = b;
        }
        return min;
    }
}
