package gun3.polymorphism.demo;

public class ConsoleLogger extends  BaseLogger{
    public void log(String message){
        System.out.println("Log to console : "+ message);
    }
}
