package programmers;

/*
 * 정수 num1과 num2가 매개변수로 주어집니다. 
 * 두 수가 같으면 1 다르면 -1을 retrun
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution99 
{
	public static int solution(int num1, int num2) 
	{
	        int answer = 0;
	        
	        if(num1==num2)
	        {
	        	answer=1;
	        }
	        else 
	        {
	        	answer=-1;
	        }
	        
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		int num1=0;
		int num2=0;
		int result = solution(num1, num2);
		System.out.println(result);
	}

}
