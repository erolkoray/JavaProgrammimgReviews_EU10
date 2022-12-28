package week13_03_12_2022.inheritance;

class Discord extends MobileApp {

    public Discord(double version) {

        super("Discord", version);
    }

    public void chat(String name) {
        System.out.println("User is chatting using " + name+".");
    }
}
