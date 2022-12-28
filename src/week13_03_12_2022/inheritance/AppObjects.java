package week13_03_12_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {


        Instagram instagram1 = new Instagram(3.5);

        System.out.println(instagram1);
        instagram1.useTheApp(50);

        System.out.println("-------------------------------------------------------");

        Discord discord1 = new Discord(5.8);

        System.out.println(discord1);
        discord1.useTheApp(148);

    }
}
