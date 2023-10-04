class Fraction extends Number implements Comparable<Fraction> {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Fraction)) {
            return false;
        } 
        Fraction f = (Fraction)o;
        if (this.doubleValue() == f.doubleValue()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int compareTo(Fraction o){
        double ici = this.doubleValue();
        double autre = o.doubleValue();
        if (ici > autre) {
            return 1;
        } else if (ici < autre) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int intValue() {
        return this.numerateur/this.denominateur;
    }

    @Override
    public float floatValue() {
        float f1 = this.numerateur;
        float f2 = this.denominateur;
        return f1/f2;
    }

    @Override
    public long longValue() {
        long l1 = this.numerateur;
        long l2 = this.denominateur;
        return l1/l2;
    }

    public Fraction add(Fraction f) {
        if (this.denominateur == f.denominateur) {
            int num = this.numerateur + f.numerateur;
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
    public static void main(String[] args) {

        final Fraction ZERO = new Fraction();
        final Fraction UN = new Fraction(1);

        Fraction x = new Fraction(5,8);
        assert x.doubleValue() == 0.625;
        Fraction y = new Fraction(10,16);
        assert x.doubleValue() == y.doubleValue();
        

        }
}

