package day2;

import java.util.Arrays;
import java.util.List;

public class ArrayExam3 {
    public static void main(String[] args) {
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] num = {10, 20, 30, 40, 50};
        int[] rnum = new int[5];

        for (int i= num.length-1, j=0; i>= 0; i--, j++){
            rnum[j] = num[i];
        }
        System.out.println(Arrays.toString(rnum));
    }
}
