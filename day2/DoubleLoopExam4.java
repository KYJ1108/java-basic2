package day2;

public class DoubleLoopExam4 {
    public static void main(String[] args) {
        // 별 삼각형 역순
        // 3
        for (int i=1; i<4; i++){
            for (int j=3; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //5
        for (int i=1; i<6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 7
        for (int i=1; i<8; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
