package day4;

public class Account {
    int remainder = 0; // 밖에 있어야 여러 함수가 사용 가능 (누적 - 현제 계좌에 최종 남아있는 잔액)

    // 예금
    public void deposit(int mon) {
        remainder += mon;
        System.out.println(mon + "원을 예금했습니다.");
        System.out.println("잔액 : " + remainder);
    }

    //출금
    public int withdraw(int mon){
        remainder -= mon; //  잔액에서 제외
        System.out.println(mon + "원을 출금하셨습니다.");
        System.out.println("잔액 : " + remainder);
        return mon;
    }

    // 잔액
    public int getRemainder(){
        System.out.println(remainder+"원 남았습니다.");
        return remainder;
    }
}
