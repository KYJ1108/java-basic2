package day3.homWork;
// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.

public class LocalVarExam1 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car c1 = new Car();
        for (int i = 0; i < 3; i++){
            c1.run();
        }

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();

        c2.run();
        c3.run();
        c4.run();


        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}
