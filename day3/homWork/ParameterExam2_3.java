package day3.homWork;

public class     ParameterExam2_3 {
        public static void greeting1(int lan){
            switch (lan){
                case 1:
                    System.out.println("안녕하세요");
                    break;
                case 2:
                    System.out.println("하이~");
                    break;
                case 3:
                    System.out.println("봉쥬");
                    break;
                default:
                    System.out.println("un language");
            }
        }

        // 언어 코드와 횟수에 따라 반복하여 인사말
        public static void greeting2(int lan, int cou){
            for(int i=0; i<cou; i++){
                greeting1(lan);
            }
        }
        public static void main(String[] args) {
            greeting1(2);
            // ~하이

            greeting1(3);

            greeting1(1);

            greeting2(1,3);
            greeting2(2,5);
            greeting2(3,7);
    }
}
