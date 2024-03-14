package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 문자열 myString이 주어집니다. 
 * "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 
 * solution 함수를 완성해 주세요.
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 */

public class Solution55 
{
	public static String[] solution(String myString) 
	{
        String[] answer = {};
        String[] str=myString.split("x");
        List<String> list = new ArrayList<String>();
        Arrays.sort(str);
        
        for(int i=0; i<str.length;i++)
        {
        	if(str[i].isEmpty() || str[i].isBlank())
        	{
        		continue;
        	}
        	list.add(str[i]);
        }
        
        answer=new String[list.size()];
        
        for(int i=0;i<answer.length;i++)
        {
        	answer[i]=list.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String myString = "axbxcx    xdx";
		String[] result = solution(myString);
		System.out.println(Arrays.toString(result));
	}
}
