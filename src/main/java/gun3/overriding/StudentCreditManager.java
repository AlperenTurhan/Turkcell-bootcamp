package gun3.overriding;

public class StudentCreditManager extends BaseCreditManager{
    public double calculate(double cost){
        return cost*1.10;
    }
}
