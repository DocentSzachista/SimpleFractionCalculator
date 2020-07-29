package operations;

public class OperationsMother
{
    protected float first, second, score=0;
    public OperationsMother(float first, float second)
    {
        this.first=first;
        this.second=second;
    }

    @Override
    public String toString() {
        return "Wynik "+ score;
    }
}
