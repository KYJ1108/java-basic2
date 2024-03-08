package day2.homeWork;

public class DoubleLoopExam5 {
    public static void main(String[] args) {
        // 별 삼각형 피라미드
        int num =  1;
        // 3
        for (int i=0; i<3; i++){
            for (int j=3; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k < num; k++){
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }
        //5
        num =1;
        for (int i=0; i<5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }
        // 7
        num =1;
        for (int i=1; i<8; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();

        }
    }
}
