package Iv0000;

/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string을 거꾸로 뒤집은 문자열을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution184 
{
    public static String solution(String my_string) 
    {
        String answer = "";
        for(int j=my_string.length()-1; j>=0;j--)
        {
            answer=answer+my_string.charAt(j);
        }
        return answer;
    }
    public static void main(String[] args) 
    {
        String my_String = "jaron";
        String result = solution(my_String);
        System.out.println(result.toString());
    }
}
