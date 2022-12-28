package week08_29_10_2022;

public class T3_NumberOfNames {

    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int count = 0;
        for (String eachName : names) { // eachName is representing each Element in the 'String[] names' eg. "Anna, "Mike"... etc.
            // we need to get first char
           String firstChar = eachName.charAt(0)+""; // here we can also use name.substring(0,1) - it will bring us the character for the first index number
           String lastChar = eachName.charAt(eachName.length()-1)+"";

           if(firstChar.equalsIgnoreCase(lastChar)){
               System.out.println("Qualified name: "+eachName);
               count++;
           }
        }
        System.out.println(count);




    }
}

/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4

 */