package week06_15_10_2022;

public class T6_HiddenSentence {

    public static void main(String[] args) {

        String sentence = "I*78*8* l770987987o869869=v????23425235e 54898)!'^y^^&%+%^^o%&+%&+%&%+u/%&/ =???s?23425235o2048 /[]{/,/2/,m%+u%709c7982038992h.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";

        String resultSentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch =sentence.charAt(i);
            if(ch =='.')
                break;
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == ' ')
                resultSentence += ch;
        }

        System.out.println(resultSentence);





    }
}
/*
Task 6: Given a sentence which is ended with "." included lettters, numbers, special charecters and then find hidden sentence.
input:
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
output:
You are the best guys

 */