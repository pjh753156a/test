package programmers;

import java.util.Arrays;

/*
 * 정수 리스트 num_list가 주어집니다. 
 * 가장 첫 번째 원소를 1번 원소라고 할 때, 
 * 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 
 * return 하도록 solution 함수를 완성해주세요. 
 * 두 값이 같을 경우 그 값을 return 합니다.
 */

public class Solution34 
{
	public static int solution(int[] num_list) 
	{
	        int answer = 0;
	        int oddsum=0;
	        int evensum=0;
	        for(int i=1;i<=num_list.length;i++)
	        {
	        	if(i%2==0)
	        	{
	        		oddsum=oddsum+num_list[i-1];
	        	}
	        	else if(i%2==1)
	        	{
	        		evensum=evensum+num_list[i-1];
	        	}
	        }
	        
	        if(oddsum>=evensum)
	        {
	        	answer=oddsum;
	        }
	        else
	        {
	        	answer=evensum;
	        }
	        return answer;
	}

	public static void main(String[] args) 
	{
		int[] num_list= {-1, 2, 5, 6, 3};
		int result = solution(num_list);
		System.out.println(result);
	}
}
