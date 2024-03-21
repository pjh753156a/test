package lv00;

/*
 * 정수 n이 주어질 때, n을 문자열로 변환하여 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution76
{
	public static String solution(int n) 
	{
	        String answer = "";
	        answer = Integer.toString(n);
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		int n = 123;
		String result = solution(n);
		System.out.println(result.toString());
	}
}
