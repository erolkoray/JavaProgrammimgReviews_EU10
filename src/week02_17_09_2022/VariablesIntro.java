package week02_17_09_2022;

public class VariablesIntro {


    public static void main(String[] args) {


        /*
        Variable Types:
        1- Primitive
            - Numerical Primitives:
            Double>float>long>int>short>byte
            - boolean
            - char define char 'A'


        2- Non-Primitives (in future we will study this further)
        String define String in "Adam"

        How to declare variables :
        'data type' 'variable name' = 'data'; ====> 'data' will be assigned to the 'variable name'


      Variable Naming Rules:

      1. Must be unique (inside the same main method (block-method))
      2. Lower camelCase
      3. Cannot start with a digit/number
      4. Only _ and $ can be added to the name of a variable
      5. We CAN NOT use space in your variable name
      6. We CAN NOT use Java Reserved words
      7. Make it readable, understandable and meaningful



         */

        int age = 29;

        System.out.println("----------------------------------------------------------------");

        // addition is 6+6=12
        // concatination is 12+koray = 12koray

        int Adam;
        System.out.println(12+23+"Adam");
        System.out.println("Adam1" + 12 + 23);
        
    }
}
