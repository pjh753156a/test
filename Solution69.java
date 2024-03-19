package lv00;

import java.util.Arrays;

/*
 * 정수로 이루어진 리스트 num_list가 주어집니다. 
 * num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution69 
{
	public static int[] solution(int[] num_list) 
	{
	        int[] answer = {};
	        answer = new int[num_list.length-5];
	        
	        Arrays.sort(num_list);
	        
	        for(int i=0;i<answer.length;i++)
	        {
	        	answer[i]=num_list[i+5];
	        }
	        
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] result = solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}
