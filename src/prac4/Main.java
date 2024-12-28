public class Main {
    public static void main(String[] args) {
        Trip t1 = new Trip("Australia", 365);

        // method
        t1.introduce();

        int sum = t1.sum(300, 700);
        System.out.println(sum);

        // getter
        String getCountry = t1.getCountry();
        int getDay = t1.getDay();
        System.out.println(getCountry + " " + getDay);

        // setter
        t1.setCountry("America");
        t1.setDay(777);
        String setCountry = t1.getCountry();
        int setDay = t1.getDay();
        System.out.println(setCountry + " " + setDay);

        // test
        t1.introduce();

    }
}
