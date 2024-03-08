package day3.homWork;

public class ParameterExam2_2 {
    public static void introduce(int count){
        for (int i=0; i<count; i++){
            System.out.println("안녕하세요. 20살 홍길동입니다.!");
        }
    }
    public static void main(String[] args) {
        introduce(3);
        System.out.println();
        introduce(5);
        System.out.println();
        introduce(10);
    }
}
