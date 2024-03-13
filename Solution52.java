package lv0;

import java.util.Arrays;

/*
 * 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution52 
{
    public static String[] solution(String my_string) 
    {
        String[] answer = {};
        answer = my_string.split("\\s+");
        return answer;
    }
	
	public static void main(String[] args)
	{
		String my_string = "i love you";
		String[] result = solution(my_string);
		System.out.println(Arrays.toString(result));
	}
}
