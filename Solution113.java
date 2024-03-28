package programmers2;

/*
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return
 * 하도록 solution 함수를 완성해주세요
 */

public class Solution113 
{
	public static int solution(int n) 
	{
		int answer = 0;
		while(true)
		{
			answer=answer+n%10;
			if(n/10==0)
			{
				break;
			}
			n=n/10;
		}
	    return answer;
	}

	public static void main(String[] args) 
	{
		int n = 1234;
		int result = solution(n);
		System.out.println(result);
	}
}
