public class Animal {

    // 속성
    String name;
    int num;
    double kg;

    // 생성자
    public Animal(String name, int num, double kg) {
        this.name = name;
        this.num = num;
        this.kg = kg;
    }

    // method
    public void introduce() {
        System.out.println("Oh, look at that. There are " + this.num
                + " " + this.name + "s. They weigh an average of "
                + this.kg + " kg.");
    }

    public int mir(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public double getKg() {
        return this.kg;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }


}
