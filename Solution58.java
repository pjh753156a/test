package programmers;

/*
 * 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 
 * 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution58
{
	public static String solution(String rny_string) 
	{
        String answer = "";
        for(int i=0; i<rny_string.length();i++)
        {
        	if(rny_string.charAt(i)=='m')
        	{
        		answer=answer+"rn";
        	}
        	else
        	{
        		answer=answer+rny_string.charAt(i);
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String rny_string = "masterpiece";
		String result = solution(rny_string);
		System.out.println(result);
	}
}
