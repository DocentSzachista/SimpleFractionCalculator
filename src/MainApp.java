import fractions.*;
import  java.util.Scanner;
public class MainApp {


    public static void main(String[] arg)
    {
        FracOperations equations;
        Scanner input= new Scanner(System.in);
        equations=new FracOperations(GetFractionFromString.separate(inputNumbers(input)), GetFractionFromString.separate(inputNumbers(input)));
        print();
        int wybor= input.nextInt();
        menu(wybor, equations);

    }
    private static void print()
    {
        System.out.println( "Jaka operacje chcesz wykonac?" );
        System.out.println( "1. Dodawanie" );
        System.out.println( "2. Odejmowanie" );
        System.out.println( "3. Mnożenie" );
        System.out.println( "4. Dzielenie" );
        System.out.println( "5. Wyjdź." );
    }
    private static String inputNumbers(Scanner input)
    {
        String fraction;
        System.out.println( "Podaj ułamek a/b oddzielając licznik od mianownika znakiem '/'" );
        fraction=input.nextLine();
        return fraction;
    }
    private static void menu(int choice, FracOperations equations)
    {
        switch (choice)
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
            default:
            {
                System.out.println("Błędny numer operacji został podany.");
                break;
            }

        }
    }
}
