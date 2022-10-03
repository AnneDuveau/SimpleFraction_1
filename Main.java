public class Main {

    public static void main (String[] args)
    {
        
        Fraction x = new Fraction(3,4);
        assert "3/4".equals(x.toString()): "assertion fausse";
        Fraction y = new Fraction(1,4);
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(3,9);

        //System.out.println(f1.calcul_pgcd(f1.getNumerateur(),f1.getDenominateur()));



        Fraction z = new Fraction();
        z = x.add(y);

        // System.out.println(z.getNumerateur());
        // System.out.println(z.getDenominateur());

        assert z.getNumerateur() == 1: "la somme n'a pas fonctionée";
        assert z.getDenominateur() == 1: "la somme n'a pas fonctionée";
        
        String s2 = z.toString();
        System.out.println(s2);
        assert s2.equals("1/1"):"la somme n'a pas fonctionné";

        assert f1.toString().equals("1/3"):"c'est pas bon:";
        f2 = f2.reduction(f2);
        assert f2.toString().equals("1/3"): "c'est pas bon 1";
        /*assert f1.calcul_pgcd(f1.getNumerateur(),f1.getDenominateur()) == (f2.calcul_pgcd(f2.getNumerateur(), f2.getDenominateur())): "les 2 fractions ne sont pas égales";*/
        
        //System.out.println(x.toString().compareTo(z.toString()));
        //System.out.println(z.toString().compareTo(z.toString()));

        System.out.println(f1.compareTo(f2));
        assert f1.compareTo(f2) == 0 : "les 2 fractions ne sont pas égales";

        System.out.println(f1.reduction(f1));
        System.out.println(f2.reduction(f2));
        assert f1.reduction(f1).toString().equals(f2.reduction(f2).toString()): "les 2 fractions ne sont pas égales";

        //String s = x.toString();
        //System.out.println(s);


    }   
}
