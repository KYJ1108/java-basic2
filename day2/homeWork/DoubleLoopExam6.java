package day2.homeWork;

public class DoubleLoopExam6 {
    public static void main(String[] args) {
        // 출력
        /*


         *
         **
         *


         */
        for(int i =1; i <=2; i++){
            for(int j=0; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<2; i++){ //  아래로 갈 수록 줄어드는 별 구현
            for(int j = 1; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 출력
        /*


         *
         **
         ***
         **
         *


         */
        for(int i =1; i <=3; i++){
            for(int j=0; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<3; i++){ //  아래로 갈 수록 줄어드는 별 구현
            for(int j = 2; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 출력
        /*


         *
         **
         ***
         ***
         **
         *


         */
        for(int i =1; i <=3; i++){
            for(int j=0; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<3; i++){ //  아래로 갈 수록 줄어드는 별 구현
            for(int j = 3; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
