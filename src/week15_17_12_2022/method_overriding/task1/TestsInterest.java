package week15_17_12_2022.method_overriding.task1;

public class TestsInterest {

    public static void main(String[] args) {

       Bank bank = new Bank();
       bank.calculateTheInterest();

        System.out.println("---------------------------");

       Akbank akbank = new Akbank();
       akbank.calculateTheInterest();
        System.out.println("---------------------------");
       GarantiBank garantiBank = new GarantiBank();
       garantiBank.calculateTheInterest();
        System.out.println("---------------------------");
       INGbank INGbank = new INGbank();
       INGbank.calculateTheInterest();

    }
}
