package fractions;

public class FracOperations
{
    private Fractions fraction1, fraction2;
    public FracOperations(Fractions fraction1, Fractions fraction2)
    {
        this.fraction1=fraction1;
        this.fraction2=fraction2;
    }
    public Fractions add()
    {
        int score;
        Fractions fraction;
        if (fraction1.getDenumerator() == fraction2.getDenumerator()) {
            score = fraction1.getNumerator() + fraction2.getNumerator();
            fraction = new Fractions(score, fraction2.getDenumerator());

        } else {
            score = fraction1.getDenumerator() * fraction2.getNumerator() + fraction1.getNumerator() * fraction2.getDenumerator();
            fraction = new Fractions(score, fraction2.getDenumerator() * fraction1.getDenumerator());
        }
        return fraction;
    }
    public Fractions sub()
    {
        int score;
        Fractions fraction;
        if (fraction1.getDenumerator() == fraction2.getDenumerator()) {
            score = fraction1.getNumerator() - fraction2.getNumerator();
            fraction = new Fractions(score,  fraction1.getDenumerator());
        }
        else
        {
            score = fraction2.getDenumerator() * fraction1.getNumerator() - fraction2.getNumerator() * fraction1.getDenumerator();
            fraction = new Fractions(score, fraction2.getDenumerator() * fraction1.getDenumerator());
        }

        return fraction;
    }
    public Fractions multiply()
    {
        Fractions fraction= new Fractions(fraction1.getNumerator()*fraction2.getNumerator(), fraction1.getDenumerator()*fraction2.getDenumerator());
        return fraction;
    }
    public Fractions divide()
    {
        Fractions fraction;
        if(fraction2.getNumerator()!=0)
        {
            fraction=new Fractions(fraction1.getNumerator()*fraction2.getDenumerator(), fraction1.getDenumerator()*fraction2.getNumerator());
        }
        else
            throw new IllegalArgumentException("Numerator =0");
        return  fraction;
    }
}
