package week15_17_12_2022.method_overriding.task1;

public class Bank {

    private int capital = 10000;

    public int getCapital(){
        return capital;
    }

    // how we can get the class name;
    // the answer is getClass().getSimpleName() - this will give us the class name;


    public void calculateTheInterest(){
        System.out.println("Interest rate of " + getClass().getSimpleName());
    }

    private String name;
    private double interestRate;

}
