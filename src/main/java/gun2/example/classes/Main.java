package gun2.example.classes;

import gun2.example.classes.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}