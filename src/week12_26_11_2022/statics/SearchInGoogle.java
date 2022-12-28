package week12_26_11_2022.statics;

import static week12_26_11_2022.statics.BrowserUtils.*;

public class SearchInGoogle {

    public static void main(String[] args) {

        navigateUrl("Google");
        search("Koray");


        System.out.println(staticVariable);


    }
}
