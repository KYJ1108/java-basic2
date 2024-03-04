package day1;

public class Variable {
    public static void main(String[] args){
        // 변수
        // 변수는 데이터를 저장하는 공간(그릇)

        // 변수 선언
        // 변수타입 변수명;

        int number; // 숫자형 변수 선언(정수)
        number = 40; // 변수에 값 저장

        String str; // 문자열 변수 선언
        str =  "김예지";
        
        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용
        System.out.println(number);
        System.out.println(number);
        System.out.println(str);
        System.out.println(str);

        /*int number2;
        number2 = "김예지"; // 숫자 변수에 문자를 저장하려고 하면 안됨.
         */


        // 자기소개 10번 출력
        int age;
        age = 24;
        String name;
        name = "서예지";
        System.out.println("안녕하세요. " +age+"세 "+ name+"입니다.");

        /*
        변수 주의사항
        변수명은 중복되지 않도록 지어야한다.
        변수명은 숫자로 시작하면 안된다.
        변수는 재활용 가능하다.
         */

        // 변수 재활용
        int a;
        a = 10;
        System.out.println(a);

        a = 20;
        System.out.println(a);

    }
}
