package lv0;

/*
 * 알파벳으로 이루어진 문자열 myString이 주어집니다. 
 * 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
 */

public class Solution44 
{
	public static String solution(String myString)
	{
        String answer = "";
        answer=myString.toUpperCase();
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String myString = "aBcDeFg";
		String result = solution(myString);
		System.out.println(result.toString());
	}
}
