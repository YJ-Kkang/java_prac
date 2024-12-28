public class Person {
    // 속성
    int eyes;
    String mouth;

    // 생성자
    public Person(int eyes, String mouth) {
        this.eyes = eyes;
        this.mouth = mouth;
    }

    // method
    public void movement() {
        System.out.println("I have " + this.eyes + " eyes. "
                + "I ate " + this.mouth + ".");
    }

    public double sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    // getter
    public int getEyes() {
        return this.eyes;
    }

    public String getMouth() {
        return this.mouth;
    }


    // setter
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

}
