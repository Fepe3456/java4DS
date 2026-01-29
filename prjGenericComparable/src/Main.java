public class Main {
    public static void main(String[] args) {


        IntegerNumber a = new IntegerNumber(5);
        IntegerNumber b = new IntegerNumber(7);
        System.out.println( ComparableOperations.toString( ComparableOperations.findMin(a, b) ) );

    }
}