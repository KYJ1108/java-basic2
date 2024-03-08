package day3.homWork;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.

public class LovalVarExam4 {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }

    private static void printValue(String str) {
        System.out.println(str);

    }
}
