package day2.homeWork;

public class DoubleLoopExam2 {
    public static void main(String[] args) {
        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        int dan2 = 4;
        for (int j =0; j < 17; j++){
            if (j % 2 != 0){
                for (int i = 1; i <= 10; i++){
                    if (i % 2 ==  0){
                        System.out.println(dan2 + " X " + i +" = "+ (dan2*i));
                    }

                }
            }
            dan2++;
        }
    }
}
