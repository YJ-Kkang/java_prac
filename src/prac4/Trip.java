public class Trip {

    // 속성
    String country;
    int day;

    // 생성자
    public Trip(String country, int day) {
        this.country = country;
        this.day = day;
    }

    // method
    public void introduce() {
        System.out.println("I like trip. my favorite country is "
                + this.country + " I want to travel there for "
                + this.day + " days.");
    }

    public int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // getter
    public String getCountry() {
        return this.country;
    }

    public int getDay() {
        return this.day;
    }

    // setter
    public void setCountry(String country) {
        this.country = country;
    }

    public void setDay(int day) {
        this.day = day;
    }


}
