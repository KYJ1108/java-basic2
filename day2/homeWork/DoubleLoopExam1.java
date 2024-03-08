package day2.homeWork;

public class DoubleLoopExam1 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기

        int dan2 = 2;
        for (int j =0; j < 8; j++){
            for (int i = 1; i <= 9; i++){
                if (i % 2 ==  0){
                    System.out.println(dan2 + " X " + i +" = "+ (dan2*i));
                }

            }
            dan2++;
        }
    }
}
