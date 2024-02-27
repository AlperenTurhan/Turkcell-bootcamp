package gun3.polymorphism.demo;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Log to email : "+ message);
    }
}
