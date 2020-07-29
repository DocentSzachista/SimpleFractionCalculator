package operations;


import operations.OperationsMother;

public class Substract extends OperationsMother  {
    public Substract(float first, float second)
    {
        super(first, second);
        operate(first, second);
    }
    private void operate(float first, float second) {
        this.score= first-second;
    }
}
