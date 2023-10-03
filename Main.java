public class Main {
    public static void main(String[] args){
        String jesui = Fraction.quisuije();
        System.out.println(jesui);

        final Fraction ZERO = new Fraction();
        final Fraction UN = new Fraction(1);

        Fraction x = new Fraction(5,8);
        System.out.println(x.doubleValue());
        Fraction y = new Fraction(10,16);

        assert x == y;  

        }
}
