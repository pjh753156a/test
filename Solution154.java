package programmers3;

import java.util.Arrays;

/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
 * my_string안의 자연수들의 합을 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution154 
{
    public static int solution(String my_string) 
    {
        int answer = 0;
        
        String[] parts = my_string.split("[a-zA-Z]+");
        
        for(int i=0;i<parts.length;i++)
        {
        	if(!(parts[i].length()==0))
        	{
        		answer = answer+ Integer.parseInt(parts[i]);
        	}
        }
      
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String my_string = "1a2b3c4d123Z";
		int result = solution(my_string);
		System.out.println(result);
	}

}
