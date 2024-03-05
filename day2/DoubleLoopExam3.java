package day2;

public class DoubleLoopExam3 {
    public static void main(String[] args) {
        // 삼각형 만들기 3, 5, 7
        // 3
        for (int i=1; i<4; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //5
        for (int i=1; i<6; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 7
        for (int i=1; i<8; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
