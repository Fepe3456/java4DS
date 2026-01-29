public class ComparableOperations {

    public static <T extends Comparable<T>> T findMin(T a, T b){
        T ris = a;
        if( a.compareTo(b) == 2 ){
            ris = b;
        }
        return ris;
    }

    public static <T extends Comparable<T>> String toString(T object){
        return object.toString();
    }

}
