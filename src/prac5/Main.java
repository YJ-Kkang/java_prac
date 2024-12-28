public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(2, "strawberry cake");

        // method
        p1.movement();
        double sum1 = p1.sum(100.9, 47.3);
        System.out.println(sum1);

        // getter
        int getEyes = p1.getEyes();
        System.out.println(getEyes);

        String getMouth = p1.getMouth();
        System.out.println(getMouth);

        // setter
        p1.setEyes(10);
        p1.setMouth("Apple pie");

        int newEyes = p1.getEyes();
        String newMouth = p1.getMouth();
        System.out.println(newEyes + ", " + newMouth);

        // test
        p1.movement();
    }
}
