package day2.homeWork;

public class ArrayExam4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        /*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        System.out.println(sum);
    }
}
