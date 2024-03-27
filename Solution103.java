package programmers2;

import java.util.Arrays;

/*
 * 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 
 * 두 정수 num과 total이 주어집니다. 
 * 연속된 수 num 개를 더한 값이 total이 될 때, 
 * 정수 배열을 오름차순으로 담아 return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution103 
{
	public static int[] solution(int num, int total) 
	{
		int[] answer = {};
		answer = new int[num];
		int zgh;
		
		if(num%2==1)
		{
			zgh = total/num-num/2;
			
			for(int i=0;i<num;i++)
			{
				answer[i]=zgh;
				zgh++;
			}
		}
		else 
		{
			zgh = total/num-num/2+1;
			
			for(int i=0;i<num;i++)
			{
				answer[i]=zgh;
				zgh++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		int num=4;
		int total=14;
		int[] result = solution(num, total);
		System.out.println(Arrays.toString(result));
 	}
}
