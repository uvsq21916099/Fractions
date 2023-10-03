class Fraction {
    int numerateur;
    int denominateur;

    Fraction(int numerateur,int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }
    Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public int getNumerateur() {
        return this.numerateur;
    }

    public int getDenominateur() {
        return this.denominateur;
    }

    public double doubleValue() {
        double d = this.numerateur;
        double d2 = this.denominateur;
        return d/d2;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Fraction)) {
            System.out.println("o n'est pas une fraction");
            return false;
        }
        Fraction f = (Fraction) o;
        if (this.doubleValue()==f.doubleValue()){
            return true;
        } else {
            System.out.println("o != f");
            return false;
        }
    }

    public Fraction add(Fraction f) {
        if (this.denominateur == f.denominateur) {
            int num = this.numerateur + f.denominateur;
            Fraction x = new Fraction(num,this.denominateur);
            return x;
        } else {
            int num = this.numerateur*f.denominateur+f.numerateur*this.denominateur;
            int den = this.denominateur*f.denominateur;
            Fraction p = new Fraction(num,den);
            return p;
        }
    } 

    public static String quisuije(){
        return "Je suis une fraction";
    }
}

public class Main {
    public static void main(String[] args){
        String jesui = Fraction.quisuije();
        System.out.println(jesui);

        final Fraction ZERO = new Fraction();
        final Fraction UN = new Fraction(1);

        Fraction x = new Fraction(5,8);
        assert x.doubleValue() == 0.625;
        Fraction y = new Fraction(10,16);

        assert x.equals(y) : "Les 2 fractions ne sont pas égales";  

        }
}

