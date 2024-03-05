package day2;

public class LoopExam4 {
    public static void main(String[] args) {
        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은는 것을 말합니다.
        // ex ) 작은 수 부터 큰수로 정렬되
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1

        int a = 12;
        int b = 5;
    
        // 오름차순
        for (int i = b; i <= a; i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();


        // 내림차순
        for (int j=a; j >=b; j--){
            System.out.println(j);
        }
    }
}
