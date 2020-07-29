package operations;

public class Divide extends OperationsMother  {
    public Divide(float first, float second)
    {
        super(first, second);
        operate(first, second);
    }

    private void operate(float first, float second) {
        if(second!=0)
            this.score = first / second;
       else throw new IllegalArgumentException("Nie dzielimy przez zero");
    }
}
