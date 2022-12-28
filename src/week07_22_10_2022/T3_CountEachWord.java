package week07_22_10_2022;

public class T3_CountEachWord {

    public static void main(String[] args) {

        String names = "Adam Adam Barry Aysun Aysun";
        String temp = "";
        String result = "";

        for (int i = 0; i < names.length(); i++) {

            char ch = names.charAt(i);

            if(ch != ' '){
                temp+=ch;
                continue; // we need to find the word in order to continue to next statement
            }

            String search = temp;

            int counter = 0;
            String dummy = names;

            while(dummy.contains(search)){
                counter++;
                dummy =dummy.replaceFirst(search,"");
            }
            if(!result.contains(search)) {
                result += search + "-" + counter + " ";
            }
            temp = "";
        }
        System.out.println(result);


    }
}
/*
--  Task 3: Count each name in sentence.

    input :

  String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2
 */