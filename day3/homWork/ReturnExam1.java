package day3.homWork;

public class ReturnExam1 {
    public static int a1(int func1){
        return func1;
    }
    public static int a2(int func2){
        return func2;
    }
    public static int func3(int sc){
        return sc;
    }
    public static int func4(int sc, int rd){
        return sc + rd;
    }

    public static void main(String[] args) {
        // 출력 : 10
        int a = a1(10);
        System.out.println(a);

        // 출력 : 10
        int b = a1(10);
        System.out.println(b);

        // 출력 : 22
        int c = a2(22);
        System.out.println(c);

        // 출력 : 55
        int d = a2(55);
        System.out.println(d);

        int e = func3(100);
        System.out.println(e);
        // 출력 : 100

        int f = func3(25);
        System.out.println(f);
        // 출력 : 25

        int g = func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = func4(20, 50);
        System.out.println(h);
        // 출력 : 70
    }
}
