package week12_26_11_2022.statics;

public class StaticWorkStyle {

    static {
        System.out.println("first static");  // 1
    }

    static {
        System.out.println("second static"); // 2
    }

    public static void main(String[] args) { // 4
        System.out.println("main method");

    }

    public static void methodStatic(){ // static method needs to be called manually for it to run

    }

    static { // static block is automatically called by the compiler, so it runs automatically
        System.out.println("third static"); // 3
    }
}
