package programmers2;

import java.util.Arrays;

/*
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
 * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 
 * return 하도록 solution 함수를 완성해보세요.
 */

public class Solution122 
{
	public static String solution(String my_string, int num1, int num2) 
	{
		String answer = "";
		String temp;
		String[] str = my_string.split("");
		temp=str[num1];
		str[num1]=str[num2];
		str[num2]=temp;	
		
		for(int i=0;i<my_string.length();i++)
		{
			answer = answer + str[i];
		}
		
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String result = solution(my_string, num1, num2);
		System.out.println(result.toString());
	}
}
