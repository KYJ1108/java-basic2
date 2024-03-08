package day5.Douk1;

import org.w3c.dom.ls.LSOutput;

// 오리 시뮬레이션 구성 방식 개선 전
public class Douk {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        System.out.println("청둥오리");
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        System.out.println();

        흰오리 a흰오리 = new 흰오리();
        System.out.println("흰오리");
        a흰오리.날다();
        a흰오리.헤엄치다();
        System.out.println();

        고무오리 a고무오리 = new 고무오리();
        System.out.println("고무오리");
        a고무오리.날다();
        a고무오리.헤엄치다();
        System.out.println();

        고무2오리 a고무2오리 = new 고무2오리();
        System.out.println("고무2오리");
        a고무2오리.날다();
        a고무2오리.헤엄치다();
        System.out.println();

        아수라오리 a아수라오리 = new 아수라오리();
        System.out.println("아수라오리");
        a아수라오리.날다();
        a아수라오리.헤엄치다();
    }
}
class 날개 {
    void 사용() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class 고무날개{
    void 사용(){
        System.out.println("저는 날 수 없어요...");
    }
}

class 발 {
    void 사용(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 고무발{
    void 사용(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

class 오리{
    날개 a날개 = new 날개();
    발 a발 = new 발();

    public void 날다(){
        a날개.사용();
    }
    public void 헤엄치다(){
        a발.사용();
    }
}

class 청둥오리 extends 오리{

}
class 흰오리 extends 오리{

}
class 고무오리 extends 오리{
    고무날개 a날개 = new 고무날개();
    고무발 a발 = new 고무발();

    public void 날다(){
        a날개.사용();
    }
    public void 헤엄치다(){
        a발.사용();
    }
}
class 고무2오리 extends 고무오리{

}
class 아수라오리 extends 오리{
    날개 a날개 = new 날개();
    고무발 a발 = new 고무발();

    public void 날다(){
        a날개.사용();
    }
    public void 헤엄치다(){
        a발.사용();
    }
}