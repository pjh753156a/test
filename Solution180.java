package Iv0000;

/*
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
 * 문자열 my_string이 매개변수로 주어질 때 
 * 모음을 제거한 문자열을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution180 
{
    public static String solution(String my_string) 
    {
        String answer = "";
        my_string=my_string.replaceAll("a", "");
        my_string=my_string.replaceAll("e", "");
        my_string=my_string.replaceAll("i", "");
        my_string=my_string.replaceAll("o", "");
        my_string=my_string.replaceAll("u", "");
        answer=my_string;
        return answer;
    }

    public static void main(String[] args) 
    {
        String my_string = "nice to meet you";
        String result = solution(my_string);
        System.out.println(result.toString());
    }
}
