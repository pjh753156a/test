package programmers;

/*
 * 정수로 이루어진 문자열 n_str이 주어질 때,
 * n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution74 
{
	public static String solution(String n_str) 
	{
	        String answer = "";
	        int i=0;
	        
	        while(true)
	        {
	        	if(n_str.charAt(i)!='0')
	        	{
	        		break;
	        	}
	        	
	        	i++;
	        }
	        
	        answer=n_str.substring(i);
	        
	        return answer;
	}
	
	public static void main(String[] args)
	{
		String n_str = "854020";
		String result = solution(n_str);
		System.out.println(result);
	}
}
