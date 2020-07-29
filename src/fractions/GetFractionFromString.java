package fractions;

public abstract class GetFractionFromString
{

    public static Fractions separate(String fraction)
    {
        int fractionBarLoc=fraction.indexOf('/');
        if(fractionBarLoc==-1)
            throw new IllegalArgumentException("ciąg znaków nie jest ułamkiem");
        else
        {
            String numerator=fraction.substring(0, fractionBarLoc);
            String denumerator=fraction.substring(fractionBarLoc+1);
            if(denumerator.indexOf('0')!=-1)
            {
               throw new IllegalArgumentException("mianownik nie może być zerem");
            }
            else
            {
                return convert(numerator, denumerator);
            }
        }
    }
    private  static Fractions convert(String numeratorStr, String denominatorStr)
    {
        int numerator = Integer.parseInt(numeratorStr);
        int denumerator=Integer.parseInt(denominatorStr);
        return new Fractions(numerator, denumerator);
    }
    private static boolean isNegative(String numeratorStr, String denominatorStr)
    {
        return true;
    }



}
