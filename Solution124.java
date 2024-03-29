package programmers2;

/*
 * 문자열 my_string이 매개변수로 주어질 때, 
 * 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution124 
{
	public static String solution(String my_string) 
	{
        String answer = "";
        for(int i=0;i<my_string.length();i++)
        {
        	if(my_string.charAt(i)>=65 && my_string.charAt(i)<=90)
        	{
        		answer=answer+Character.toLowerCase(my_string.charAt(i));
        	}
        	else if(my_string.charAt(i)>=97 && my_string.charAt(i)<=122)
        	{
        		answer=answer+Character.toUpperCase(my_string.charAt(i));
        	}
        }
        return answer;
    }

	public static void main(String[] args) 
	{
		String my_string = "abCdEfghIJ";
		String result = solution(my_string);
		System.out.println(result.toString());
	}

}
