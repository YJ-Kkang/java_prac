public class Person {

    // 속성
    String name;
    int age;

    // 생성자
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method
    public void introduce() {
        System.out.println("내 이름은 " + this.name);
    }

    public int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // Getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    // Setter
    public void setName(String name){
        this.name = name;
        // 궁금한 점. this.name = name;과 name = this.name은 다른 건가?
    }

    public void setAge(int age){
        this.age = age;
    }

}
