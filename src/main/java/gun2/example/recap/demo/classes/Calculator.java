package gun2.example.recap.demo.classes;

public class Calculator {
    public int addition(int number1, int number2){
        return number1+number2;
    }
    //Overloading
    public int addition(int number1, int number2, int number3){
        return number1+number2+number3;
    }
    public int substraction(int number1, int number2){
        return number1-number2;
    }
    public int multiplication(int number1, int number2){
        return number1*number2;
    }
    public int division(int number1, int number2){
        return number1/number2;
    }
}
