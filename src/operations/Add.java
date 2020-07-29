package operations;

public class Add extends OperationsMother
{

    public Add(float first, float second)
    {
        super(first, second);
        operate(first, second);
    }


    private void operate(float first, float second)
    {
        System.out.println("Stara");
         super.score=first+second;
    }

}
