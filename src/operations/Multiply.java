package operations;

public class Multiply extends OperationsMother  {
    public Multiply(float first, float second)
    {
        super(first, second);
        operate(first, second);
    }

    private void operate(float first, float second) {
        this.score = first*second;
    }
}
