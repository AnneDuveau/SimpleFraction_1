public class Fraction {

    // Attributs
    private int numerateur;
    private int denominateur;

    // Constructeurs
    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    @Override
    public String toString()
    {
        return numerateur + "/" + denominateur;
    }

    /*public Fraction(int denominateur)
    {
        this.numerateur = 1;
        this.denominateur = denominateur;
    }

    public Fraction()
    {
        this.numerateur = 0;
        this.denominateur = 1;
    }*/

    // Méthodes
    // getters
    /*public int getNumerateur()
    {
        return numerateur;
    }

    public int getDenominateur()
    {
        return denominateur;
    }*/

   


}