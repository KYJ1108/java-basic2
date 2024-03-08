package day3;

public class Reference {
    public static void main(String[] args) {
        // 참조
        // 스택        힙          생성
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        Person p2 = new Person();


        System.out.println(p1);
        System.out.println(p2);

        // 사람 등록
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        // 사람 복사
        Person p3 = p1; // 홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍길동은 2명이 된걸까? X

        p3.name = "이순신";
        System.out.println(p3.name);
        System.out.println(p1.name);

        // 손흥민을 2명 만들어주세요 (단, 코드의 중복은 없어야 합니다.)
        // 객체를 따로 만들어야함.
        Person p4 = new Person();
        Person p5 = new Person();

        p4.name = p5.name;
        p4.age = p5.age;
        p4.home = p5.home;

        p5.name = "손흥민";
        p5.age = 31;
        p5.home = "런던";

        p4.name = "손흥만";

        System.out.println(p4.name);
        System.out.println(p5.name);
        // 객체 복사
        // 참조값의 복사 -> 얕은 복사
        // 객체값의 복사 -> 깊은 복사
        
        

    }
}

