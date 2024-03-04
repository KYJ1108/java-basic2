package day1;

public class Print {
    public static void main(String[] args){
        System.out.println(100);
        System.out.println(200);
        System.out.println("김예지");
        System.out.println("홍길동");

        System.out.println("안녕안녕 안녕하세요.");
        System.out.println("방가방가 반갑습니다.");
        System.out.println("안녕하세요.\n반갑습니다."); // \n은 줄바꿈

        //문자 합치기
        System.out.println("안녕하세요."+" 김예지입니다.");

        //숫자 더하기
        System.out.println(100+200);
        System.out.println(2000+3000);

        //숫자와 문자는 정확히 구별해서 사용
        System.out.println("100"); // 문자에요 더하기 안되어요.
        System.out.println(100); // 숫자 100

        // 문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100"+200);

        // 출력문을 이용해 더하기 식 표현하기
        // +연산자가 여러분 나오면 왼쪽부터 순차적으로 연산
        System.out.println("100 + 200 = " + 100+200);
        System.out.println("100 + 200 = "+ (100+200));

        /*int sum = 100+200;
                System.out.println("100 + 200 = " +sum);
        */
        // 구구단 2단을 출력핫게요. 단, 출력문은 한 번만 사용.
        for (int i=1; i<10; i++){
            System.out.println("2 * "+i+" = " + (2*i));
        }
        System.out.println("2*1 = " +(2*1) + "\n2*2 = "+(2*2));
    }
}
