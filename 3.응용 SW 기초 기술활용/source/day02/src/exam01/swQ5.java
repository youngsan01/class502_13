package exam01;

import java.util.Arrays;

public class swQ5 {
    public static void main(String[] args) {
        int[]nums = {21,22,30,11,99,31};

        int[] answer=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            answer[i]=nums[(nums.length)-i-1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
