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

    public static String quisuije(){
        return "Je suis une fraction";
    }
}
