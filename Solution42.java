package programmers;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때, 
 * 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 
 * 10 이하이면 모든 원소의 곱을 return
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution42 
{
	public static int solution(int[] num_list) 
	{
	        int answer = 0;
	        if(num_list.length>=11)
	        {
	        	for(int i=0;i<num_list.length;i++)
	        	{
	        		answer=answer+num_list[i];
	        	}
	        }
	        else if(num_list.length<=10)
	        {
	        	answer=1;
	        	for(int i=0;i<num_list.length;i++)
	        	{       
	        		answer=answer*num_list[i];
	        	}
	        }
	        return answer;
	}

	public static void main(String[] args) 
	{
		int[] num_list = {2, 3, 4, 5};
		int result = solution(num_list);
		System.out.println(result);
	}

}
