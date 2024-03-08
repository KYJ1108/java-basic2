package day4;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();
        a홍길동.파이썬();
        System.out.println();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.파이썬();
        System.out.println();

        이순신주식회사 a이순신주식회사 = new 이순신주식회사();
        a이순신주식회사.파이썬();
        a이순신주식회사.자바();
    }
}
class 이순신주식회사 {
    홍길동 a홍길동 = new 홍길동();
    홍길순 a홍길순 = new 홍길순();

    public void 자바(){
        a홍길동.자바();
    }
    public void 파이썬(){
        a홍길순.파이썬();
    }
}
class 홍길동 {

    홍길순 a홍길순 = new 홍길순(); // 변수(연락처 느낌)
    
    public void 자바(){
        System.out.println("자바 17번 프로그래밍");
    }
    public void 파이썬(){
        a홍길순.파이썬();
    }
}
class 홍길순{
    public void 파이썬(){
        System.out.println("파이썬 3.12 프로그래밍");
    }
}