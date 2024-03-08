package day4.homework;

public class CompositionExam {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이();
        a사람.a왼팔 = new 팔();
        a사람.길이();

        //System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람 {
    팔 a왼팔 = new 팔();
    public void 나이(){
        System.out.println(20);
    }
    public void 길이(){
        a왼팔.길이();
    }
}
class 팔{
    public void 길이(){
        System.out.println(100);
    }
}