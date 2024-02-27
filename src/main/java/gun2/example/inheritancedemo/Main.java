package gun2.example.inheritancedemo;

public class Main {
    public static void main(String[] args) {
        LoanUI loanUI=new LoanUI();
        loanUI.CalculateLoan(new LecturerLoanManager());
    }
}