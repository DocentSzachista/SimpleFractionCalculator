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
        int numerator, denumerator;
        boolean negative= isNegative(numeratorStr, denominatorStr);
        if(negative)
        {
            if(numeratorStr.contains("-"))
            {
                numeratorStr= numeratorStr.substring(1);
            }
            else
            {
                denominatorStr=denominatorStr.substring(1);
            }
             numerator = Integer.parseInt(numeratorStr)*(-1);
            denumerator=Integer.parseInt(denominatorStr);
        }
        else
        {
            if(numeratorStr.contains("-") && denominatorStr.contains("-"))
            {
                numeratorStr = numeratorStr.substring(1);
                denominatorStr = denominatorStr.substring(1);
            }
             numerator = Integer.parseInt(numeratorStr);
             denumerator = Integer.parseInt(denominatorStr);
        }
        return new Fractions(numerator, denumerator);
    }
    private static boolean isNegative(String numeratorStr, String denominatorStr)
    {
        if(numeratorStr.contains("-") && denominatorStr.contains("-") || numeratorStr.indexOf("-")==-1 && denominatorStr.indexOf("-")==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }



}
