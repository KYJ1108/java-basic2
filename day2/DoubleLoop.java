package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        // 이중반복문, 중첩반복문
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 3; i++){
            for (int j = 1; j <= 5; j++){
                System.out.println(j);
            }
        }

        // 구구단 2 ~ 9단 출력
        // 2단
        int dan = 2;
        for (int j =0; j < 8; j++){
            for (int i = 1; i <= 9; i++){
                System.out.println(dan + " X " + i +" = "+ (dan*i));
            }
        }

        System.out.println();
        System.out.println();
        // 3단
        dan = 3;
        for (int i = 1; i <= 9; i++){
            System.out.println(dan + " X " + i +" = "+ (dan*i));
        }

        System.out.println();
        System.out.println();

        // 2-9 구구단
        int dan2 = 2;
        for (int j =0; j < 8; j++){
            for (int i = 1; i <= 9; i++){
                System.out.println(dan2 + " X " + i +" = "+ (dan2*i));
            }
            dan2++;
        }

    }
}
