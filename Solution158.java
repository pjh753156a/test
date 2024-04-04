package programmers3;

/*
 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
 * 자연수 n이 매개변수로 주어질 때 n 이하의 합성수의 개수를 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution158 
{
	public static int solution(int n) 
	{
		int answer = 0;
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count>=3)
			{
				answer++;
			}
			count=0;
		}
		return answer;
	}
	
	public static void main(String[] args) 
	{
		int n = 15;
		int result = solution(n);
		System.out.println(result);
	}

}
