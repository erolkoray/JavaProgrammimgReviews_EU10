package week13_03_12_2022.inheritance;

class Instagram extends MobileApp {

    public Instagram(double version) {

        super("Instagram", version);
    }

    public void postPhoto() {
        System.out.println("User is posting a photo to " + name + ".");
    }
}
