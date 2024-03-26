package programmers;

/*
 * 정수 num1과 num2가 주어질 때, 
 * num1과 num2의 합을 return 하도록 
 * soltuion 함수를 완성해주세요.
 */

public class Solution94 
{
	public static int solution(int num1, int num2) 
	{
	        int answer = num1+num2;
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		int num1=2;
		int num2=3;
		int result = solution(num1, num2);
		System.out.println(result);
	}
}
