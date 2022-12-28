package week06_15_10_2022;

public class WhileAndDoWhileIntro {

    public static void main(String[] args) {

        boolean flag = true;

        int i = 0;

        while(flag){
            System.out.print(i + " ");
            i++;
            if(i==100){
                flag = false;
            }
        }

        System.out.println("-----------------------------------------------------------------");

        do {
            if(i==100){
                flag = false;
            }
            System.out.print(i++ + " ");

        }while(flag);







    }
}
