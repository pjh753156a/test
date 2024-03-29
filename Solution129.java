package Iv000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string에서 중복된 문자를 제거하고 
 * 하나의 문자만 남긴 문자열을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution129 
{
    public static String solution(String my_string) 
    {
        String answer = "";
        List<String> list = new ArrayList<String>();
        

        String[] str = my_string.split("");

        for(int i=0;i<my_string.length();i++)
        {
            list.add(str[i]);
        }

        Set<String> set = new LinkedHashSet<String>(list);
        
    
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) 
        {
            answer = answer + iterator.next();
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        String my_string = "We are the world";
        String result = solution(my_string);
        System.out.println(result.toString());
    }
}
