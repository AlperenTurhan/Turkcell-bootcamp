package gun3.interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Added to mysql");
    }
}
