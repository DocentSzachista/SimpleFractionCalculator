import fractions.*;
import  java.util.Scanner;
public class MainApp {


    public static void main(String[] arg)
    {
        FracOperations equations;
        Scanner input= new Scanner(System.in);
        print();
        int wybor= input.nextInt();
        //equations=new FracOperations( inputNumbers(input), inputNumbers(input) );
        equations=new FracOperations(GetFractionFromString.separate("1/2"), GetFractionFromString.separate("1/2"));
        switch (wybor)
        {
            case 1:
            {
                System.out.println(equations.add().toString());
                break;
            }
            case 2:
            {
                System.out.println(equations.sub().toString());
                break;
            }
            case 3:
            {
                System.out.println(equations.multiply().toString());
                break;
            }
            case 4:
            {
                System.out.println(equations.divide().toString());
                break;
            }
            case 5:
                System.exit(0);
            default: {
                System.out.println("Błędny numer operacji został podany");
                break;
            }

        }
    }
    private static void print()
    {
        System.out.println("Jaka operacje chcesz wykonac?");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Wyjdź.");
    }
    private static Fractions inputNumbers(Scanner input)
    {
        int firstNumber, secondNumber;
        System.out.println("Podaj licznik");
        firstNumber=input.nextInt();
        System.out.println("Podaj mianownik");
        secondNumber=input.nextInt();
        return new Fractions(firstNumber, secondNumber);
    }
}
