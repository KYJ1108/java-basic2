package day3.homWork;

public class LocalVarExam2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.km = 200;

        Car c2 = new Car();
        c2.km = 250;

        c1.max();
        c2.max();
    }
}
