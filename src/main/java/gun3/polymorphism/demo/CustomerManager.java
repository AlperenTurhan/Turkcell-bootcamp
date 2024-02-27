package gun3.polymorphism.demo;

public class CustomerManager {
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }
    public void add(){
        System.out.println("Customer has been added");
        this.baseLogger.log("log message");
    }
}
