public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("dog", 100, 7.2);
        // method
        dog.introduce();

        int ret = dog.mir(10, 5);
        System.out.println(ret);

        // getter
        String getName = dog.getName();
        System.out.println(getName);

        int getNum = dog.getNum();
        System.out.println(getNum);

        double getKg = dog.getKg();
        System.out.println(getKg);

        // setter
        dog.setName("cat");
        String newName = dog.getName();
        System.out.println(newName);

        dog.setNum(10);
        int newNum = dog.getNum();
        System.out.println(newNum);

        dog.setKg(2.3);
        double newKg = dog.getKg();
        System.out.println(newKg);

        // test
        dog.introduce();

    }
}
