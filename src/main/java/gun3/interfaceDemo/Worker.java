package gun3.interfaceDemo;

public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println("Work");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void pay() {
        System.out.println("Pay");
    }
}
