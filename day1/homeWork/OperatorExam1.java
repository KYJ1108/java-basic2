package day1.homeWork;

public class OperatorExam1 {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("true1");
        }

        if ( false ) {
            System.out.println("false1");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("true2");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("false2");
        }

        if ( a > 10 ) {
            System.out.println("false3");
        }

        if ( a >= 10 ) {
            System.out.println("true3");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("true4");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println("false4");
        }

        if ( c == false ) {
            System.out.println("true5");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("true6");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("false5");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("true7");
        }
    }
}
