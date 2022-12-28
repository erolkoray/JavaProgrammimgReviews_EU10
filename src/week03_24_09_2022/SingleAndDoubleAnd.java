package week03_24_09_2022;

public class SingleAndDoubleAnd {

    public static void main(String[] args) {

        boolean result=false;
        int a=10;
        //false  it will look at this statement and increment the value
        if (result & a++<12) { /* first it will read the 'result' (which is false)
                                 and because of single &, it will continue to read the rest
                                  of the equation */

        }

        System.out.println("a = " + a); //11

        int b=10;
        //  false  it will look at this statement and increment the value
        if (result && b++<12) { /* first it will read the 'result' (which is false)
                         and because of double & (&&), it will NOT continue to read the rest
                               of the equation */

        }

        System.out.println("b = " + b);

    }
}
