package fractions;

public class Fractions {
    private int numerator, denumerator;
    public Fractions(int numerator, int denumerator)
    {
        if (denumerator!=0)
        {
            this.numerator=numerator;
            this.denumerator=denumerator;
        }
        else
        {
            throw new IllegalArgumentException("Mianownik nie może być równy 0");
        }
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenumerator()
    {
        return denumerator;
    }

    @Override
    public String toString() {
        return  numerator + " /"  + denumerator;
    }
}
