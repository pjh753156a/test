package programmers2;

/*
 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 
 * 7이 총 몇 개 있는지 return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution107 
{
	public static int solution(int[] array) 
	{
		int answer = 0;
		for(int i=0; i<array.length;i++)
		{
			while(true)
			{
				if(array[i]%10==7)
				{
					answer++;
				}
				
				array[i]=array[i]/10;
				
				if(array[i]==0)
				{
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args)
	{
		int[] array = {10, 29};
		int result = solution(array);
		System.out.println(result);
	}
}
