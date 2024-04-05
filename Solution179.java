package Iv0000;





/*
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
 * my_string에서 letter를 제거한 문자열을 return 하도록 
 * solution 함수를 완성해주세요.
 */


public class Solution179 
{   
    public static String solution(String my_string, String letter) 
    {
        String answer = "";
        answer=my_string.replaceAll(letter, "");
        return answer;
    }
    public static void main(String[] args) 
    {
        String my_string = "abcdef";
        String letter = "f";
        String result = solution(my_string, letter);
        System.out.println(result.toString());

    }
}
