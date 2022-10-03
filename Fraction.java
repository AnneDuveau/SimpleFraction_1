public class Fraction{

    // Attributs
    private int numerateur;
    private int denominateur;

    public static final Fraction ONE = new Fraction(1);
    public static final Fraction ZERO = new Fraction();

    // Constructeurs
    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur)
    {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction()
    {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    // Méthodes

    // getters
    public int getNumerateur()
    {
        return numerateur;
    }

    public int getDenominateur()
    {
        return denominateur;
    }

    // autres méthodes
    public double doubleValue()
    {
        return (double)this.numerateur/(double)this.denominateur;
    }

    public Fraction add(Fraction f2)
    {
        Fraction f = new Fraction();
        if (f2.denominateur != this.denominateur)
        {
            f.numerateur = this.numerateur * f2.denominateur + f2.numerateur * this.denominateur;
            f.denominateur = this.denominateur * f2.denominateur;
        }
        else 
        {
            f.numerateur = this.numerateur + f2.numerateur;
            f.denominateur = this.denominateur;
        }     

        //calculer le pgcd
        f = reduction(f);
        /*int pgcd = calcul_pgcd(f.numerateur, f.denominateur);

        f.numerateur = f.numerateur/pgcd;
        f.denominateur = f.denominateur/pgcd;*/

        return f;
    }
    
    public int calcul_pgcd(int n1, int n2)
    {
        if (n2 == 0)
        {
            return n1;
        }
        else
        {
            return(calcul_pgcd(n2, n1%n2));
        }  
    }

    public Fraction reduction(Fraction f)
    {
        Fraction f1 = new Fraction();
        int pgcd = calcul_pgcd(f.numerateur, f.denominateur);

        f1.numerateur = f.numerateur/pgcd;
        f1.denominateur = f.denominateur/pgcd;

        return f1;
    }
    

    @Override
    public String toString()
    {
        return numerateur + "/" + denominateur;
    }

    public int compareTo(Fraction f1)
    {
        int res = 2;
        if (f1.doubleValue() > this.doubleValue())
        {
            res = 1;
        }
        else if (f1.doubleValue() < this.doubleValue())
        {
            res = -1;
        }
        else if (f1.doubleValue() == this.doubleValue())
        {
            res = 0;
        }

        return res;
    }

    /*Number aNumber = java.math.BigDecimal.ONE;
    Number anotherNumber = new Fraction(0, 2);
    assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    */
}