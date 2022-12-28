package week16_24_12_2022.final_keyword.final_with_variable;

public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person("10-10-1992", "Koray");

     //   person.birthDay = "12-1-1999"; - the variable birthday was set with using the FINAL keyword so it cannot be changed in subclasses.


        // YOU USE FINAL KEYWORD IF THERE ARE VARIABLES THAT SHOULDN'T CHANGE WHEN REUSING

        // FINAL KEYWORD ALSO WON'T ALLOW YOU TO USE A SETTER, BECAUSE SETTERS ARE USED FOR CHANGING THE INFORMATION OF THE VARIABLE
        // for that reason, you can't get a setter for methods with final keywords.





    }


}
