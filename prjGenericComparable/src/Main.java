public class Main {
    public static void main(String[] args) {

        Integer i1 = new Integer(4);
        Integer i2 = new Integer(7);
        System.out.println( MyMath.findMin(i1, i2).toString() );

        Auto a1 = new Auto(1000);
        Auto a2 = new Auto(1500);
        // MyMath.findMin(a1, a2); //'findMin(T, T)' in 'MyMath' cannot be applied to '(Auto, Auto)'
        Auto aMin = MyMath.findMin(a1, a2);
        System.out.println( aMin.toString() );


        IntegerNumber a = new IntegerNumber(5);
        IntegerNumber b = new IntegerNumber(7);
        System.out.println( ComparableOperations.toString( ComparableOperations.findMin(a, b) ) );

    }
}