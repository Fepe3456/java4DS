public class Fraction {

    private int numerator;
    private int denominator;


    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public boolean isProper(){
        boolean tf = false;
        if( numerator>denominator ){
            tf = true;
        }
        return tf;
    }
    public boolean isImproper(){
        boolean tf = false;
        if( numerator<denominator ){
            tf = true;
        }
        return tf;
    }
    public boolean isApparent(){
        boolean tf = false;
        if( (numerator/denominator)/2 == 0 ){
            tf = true;
        }
        return tf;
    }

    public void semplify(){
        numerator = numerator / mcd(numerator, denominator);
        denominator = denominator / mcd(numerator, denominator);
    }

    public int mcd(int a, int b){
        int resto;
        while( b!=0 ){
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public int mcm(int a, int b){
        return (a*b) / mcd(a, b);
    }

    public void addition(Fraction secondFraction){
        int mcm = mcm(denominator, secondFraction.getDenominator());
        numerator = numerator * ( mcm / denominator );
        numerator += secondFraction.getNumerator() * ( mcm / secondFraction.getDenominator() );
        denominator = mcm;
        semplify();
    }

    public void subtraction(Fraction secondFraction){
        int mcm = mcm(denominator, secondFraction.getDenominator());
        numerator = numerator * ( mcm / denominator );
        numerator -= secondFraction.getNumerator() * ( mcm / secondFraction.getDenominator() );
        denominator = mcm;
        semplify();
    }

    public void multiplication(Fraction secondFraction){
        numerator = numerator * secondFraction.getNumerator();
        denominator = denominator * secondFraction.getDenominator();
        semplify();
    }

    public void division(Fraction secondFraction){
        numerator = numerator * secondFraction.getDenominator();
        denominator = denominator * secondFraction.getNumerator();
        semplify();
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        String str = "" + numerator + " / " + denominator;
        return str;
    }


}
