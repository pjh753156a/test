package lv00;

/*
 * 실수 flo가 매개 변수로 주어질 때, 
 * flo의 정수 부분을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution71 
{
	public static int solution(double flo) 
	{
	        int answer = 0;
	        answer=(int)flo;
	        return answer;
	}
	 
	public static void main(String[] args)
	{
		double flo = 1.42;
		int result = solution(flo);
		System.out.println(result);
	}
}
