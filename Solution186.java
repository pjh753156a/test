package Iv0000;

import java.util.Arrays;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때, 
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 
 * return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution186 
{ 
    public static int[] solution(int[] num_list) 
    {
        int[] answer = {};
        answer = new int[2];
        int oddcount=0;
        int evencount=0;

        for(int i=0; i<num_list.length;i++)
        {
            if(num_list[i]%2==0)
            {
                evencount++;
            }
            else if(num_list[i]%2==1)
            {
                oddcount++;
            }
        }

        answer[0]=evencount;
        answer[1]=oddcount;

        return answer;
    }

    public static void main(String[] args) 
    {
        int[] num_list = {1, 3, 5, 7};
        int[] result = solution(num_list);
        System.out.println(Arrays.toString(result));
    }
}
