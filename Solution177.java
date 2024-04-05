package programmers3;

import java.util.Arrays;

/*
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution177 
{
	public static int[] solution(int[] num_list) 
	{
        int[] answer = {};
        answer = new int[num_list.length];
        
        for(int i=0, j=num_list.length-1; i<answer.length && j>-1;i++,j--)
        {
        	answer[i]=num_list[j];
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] num_list = {1,2,3,4,5};
		int[] result = solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}
