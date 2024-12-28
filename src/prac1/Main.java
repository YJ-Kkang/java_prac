public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("유진", 1);
        p1.introduce();
        int sum1 = p1.sum(10, 20);
        System.out.println(sum1);
        // getter
        String getName1 = p1.getName();
        System.out.println(getName1);
        int getAge1 = p1.getAge();
        System.out.println(getAge1);
        // setter
        p1.setName("진진");
        String newName1 = p1.getName();
        System.out.println(newName1);
        p1.setAge(3);
        int newAge1 = p1.getAge();
        System.out.println(newAge1);
    }
}
