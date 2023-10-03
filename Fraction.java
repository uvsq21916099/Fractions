public class Fraction {
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

    public boolean equals(Fraction f){
        if (this.doubleValue()==f.doubleValue()){
            return true;
        } else {
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
