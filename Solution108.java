package Iv000;

import java.util.Arrays;

/*
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
 * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution108 
{
	public static String solution(String my_string) 
	{
	        String answer = "";
	        my_string=my_string.toLowerCase();
	        String[] strArray = my_string.split("");        
	        Arrays.sort(strArray);
	        answer=String.join("",strArray);
	        return answer;
	}
	
	
	public static void main(String[] args)
	{
		String my_string = "Python";
		String result = solution(my_string);
		System.out.println(result.toString());
	}
}
