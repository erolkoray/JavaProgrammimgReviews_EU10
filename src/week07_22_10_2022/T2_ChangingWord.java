package week07_22_10_2022;

public class T2_ChangingWord {

    public static void main(String[] args) {

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String searched = "cat";
        String changed = "dog";

        String result2 = message.replace(searched, changed); // THIS IS THE EASIEST WAY TO DO THIS TASK
        System.out.println(result2);
        System.out.println("---------------------------------------------------------");

        String result = "";
        int indexOfFirstCat = message.indexOf(searched);
        int endOfWord = indexOfFirstCat+searched.length();

        System.out.println("indexOfFirstCat = " + indexOfFirstCat);
        System.out.println("endOfWord = " + endOfWord);

        message = message.substring(0, indexOfFirstCat)+changed+message.substring(endOfWord); // this only changes the first cat to dog
        System.out.println("message = " + message);


        System.out.println("---------------------------------------------------------");

        while(message.contains(searched)){ // this will change every cat to dog until all cat's have changed to dog

            indexOfFirstCat = message.indexOf(searched);
            endOfWord = indexOfFirstCat+searched.length();
            message = message.substring(0, indexOfFirstCat)+changed+message.substring(endOfWord); // This basically ignores 'cat' and adds 'dog' instead.       'I love ' (index's of cat has been ignored) dog         's!

            // this works because once this has changed the first 'cat' to 'dog', it will search the sentence again. Because the first cat has changed to dog already, next time there is a 'cat' in the sentence, the while loop will ignore the index numbers of 'cat' and add 'dog' in there instead

            /*
        We can skip or delete  string or char by using substring
        String str="mM";
        String word="AdamMBary";
        int indexOfM = word.indexOf(str);
        //Adam
        word= word.substring(0,indexOfM) +word.substring(indexOfM+str.length());
         */


        }
        System.out.println("message = " + message);

   /*     for (int i = 0; i < ; i++) {

            if(message.contains(word)){
                message = word.replace(newWord);
            }
        }

    */



    }
}
/*
-- Task 2:  Write a programt that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
 */