public class Person {

    // 속성
    String name;
    int age;
    double cm;

    // 생성자
    public Person(String name, int age, double cm) {
        this.name = name;
        this.age = age;
        this.cm = cm;
    }

    // 기능 method
    public void introduce() {
        System.out.println("my name is " + this.name
                + " and I'm " + this.age + " years old. Also I taller than "
                + this.cm + "cm.");
    }

    public int avr(int num1, int num2) {
        int result = (num1 + num2) / 2;
        return result;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getCm() {
        return this.cm;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }


}
