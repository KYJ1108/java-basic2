package day2;

public class IncEecOperator {
    public static void main(String[] args) {
        // 증감연산자
        int num = 10;
        System.out.println(num+5);
        System.out.println(num);

        // 변수의 값을 5증가시키고 싶다.
        //num = 15; // 증가x
        num = num + 5;
        //num += 5; // 위와 같은 표현

        //변수의 값을 3감소 시키고 싶다.
        num = num - 3;
       // num -= 3; //num-3과 같은 표현

        // 증감연산자
        num +=1; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num ++; // 위와 같은 표현

        num -= 1; // 감소값이 1인 경우에 한에서는 num-- 라고 쓸 수 있다.
        num --; // 위와 같은 표현

        System.out.println(num);
    }
}
