//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fraction f = new Fraction(4,6);
        Fraction f2 = new Fraction(5,8);
        System.out.println( f.toString() );
        f.semplify();
        System.out.println( "     f.semplify() " + f.toString() );
        f.addition(f2);
        System.out.println( "     f.addition(5/8) " + f.toString() );
        f.subtraction(f2);
        System.out.println( "     f.substraction(5/8) " + f.toString() );
        f.multiplication(f2);
        System.out.println( "     f.multiplication(5/8) " + f.toString() );
        f.division(f2);
        System.out.println( "     f.division(5/8) " + f.toString() );

    }
}

/*
4     5     31
-  +  -  =  -
6     8     24

4     5     1
-  -  -  =  -
6     8     24

4     5     5
-  *  -  =  -
6     8     12

4     5     16
-  /  -  =  -
6     8     15
* */