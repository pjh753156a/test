package programmers;

/*
 * 정수가 있을 때, 짝수라면 반으로 나누고, 
 * 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 
 * 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
 * 10 / 2 = 
 * (5 - 1) / 2 = 
 * 2 / 2 = 
 * 위와 같이 3번의 나누기 연산으로 1이 되었습니다.
 * 정수들이 담긴 리스트 num_list가 주어질 때, 
 * num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 
 * return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution41 
{
	public static int solution(int[] num_list) 
	{
	        int answer = 0;
	        for(int i=0;i<num_list.length;i++)
	        {
	        	answer = div(num_list[i],answer);
	        }
	        return answer;
	}
	
	public static int div(int num_list,int answer) 
	{
	        while(true)
	        {
	        	if(num_list==1)
	        	{
	        		break;
	        	}
	        	else if(num_list%2==0)
	        	{
	        		num_list=num_list/2;
	        		answer++;
	        	}
	        	else if(num_list%2==1)
	        	{
	        		num_list=(num_list-1)/2;
	        		answer++;
	        	}
	        	
	        }
	        return answer;
	}

	public static void main(String[] args) 
	{
		int[] num_list = {12, 4, 15, 1, 14};
		int result = solution(num_list);
		System.out.println(result);
	}
}
