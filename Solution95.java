package programmers;

/*
 * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 
 * return하도록 
 * soltuion 함수를 완성해주세요.
 */

public class Solution95 
{
	public static int solution(int num1, int num2)
	{
        int answer = 0;
        answer=num1-num2;
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int num1=2;
		int num2=3;
		int answer = solution(num1, num2);
		System.out.println(answer);
	}
}
