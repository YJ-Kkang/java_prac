public class Main {
    public static void main(String[] args){

        Person p1 = new Person("Yujin", 2, 164.2);
        p1.introduce();

        p1.avr(10, 20);

        // getter
        String getName1 = p1.getName();
        System.out.println(getName1);

        int getAge1 = p1.getAge();
        System.out.println(getAge1);

        double getCm1 = p1.getCm();
        System.out.println(getCm1);

        // setter
        p1.setName("Pinocchio");
        String newName = p1.getName();
        System.out.println(newName);

        p1.setAge(10);
        int newAge = p1.getAge();
        System.out.println(newAge);

        p1.setCm(151.9);
        double newCm = p1.getCm();
        System.out.println(newCm);

        p1.introduce();

    }
}
