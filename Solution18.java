package lv0;

/*
 *	문자열 my_string과 두 정수 m, c가 주어집니다. 
 *	my_string을 한 줄에 m 글자씩 가로로 적었을 때 	
 *	왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 
 *	return 하는 solution 함수를 작성해 주세요.
 */

public class Solution18
{
	public static String solution(String my_string, int m, int c)
	{
        String answer = "";
        for(int i=0;i<my_string.length();i+=m)
        {
        	answer+=my_string.substring(i, i+m).charAt(c-1);
        }
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String my_string = "programmers";
		int m = 1;
		int c = 1;
		String result = solution(my_string,m,c);
		System.out.println(result.toString());	
	}
}
