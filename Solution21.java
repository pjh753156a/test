package lv0;

import java.util.Arrays;

/*
 * 문자열 my_string과 정수 배열 indices가 주어질 때, 
 * my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 
 * 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

public class Solution21 
{
	public static String solution(String my_string, int[] indices) 
	{
        String answer = "";
        
        StringBuilder stringBuilder = new StringBuilder(my_string);
        
        Arrays.sort(indices);
          
        for(int i=0;i<indices.length;i++)
        {
        	stringBuilder.deleteCharAt(indices[i]-i);
        }
        
        answer = stringBuilder.toString();
        return answer;
    }
	
	public static void main(String[] args)
	{
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		String result = solution(my_string,indices);
		System.out.println(result.toString());
		
	}
}
