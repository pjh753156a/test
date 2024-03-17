package lv00;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * 문자열 배열 strArr이 주어집니다. 
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 
 * 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 */

public class Solution66
{
	public static int solution(String[] strArr) 
	{

	    int max = 0;

	    HashMap<Integer, Integer> strMap = new HashMap<>();

	    for(String str : strArr)
	    {
	        if (strMap.get(str.length())==null) 
	        {
	            strMap.put(str.length(),1);
	        }
	        else
	        {
	            strMap.put(str.length(), strMap.get(str.length())+1);
	        }
	    }

	    for(Integer key :  strMap.keySet())
	    {

	        if(strMap.get(key)>=max)
	        {
	            max = strMap.get(key);
	        }

	    }


	    return max;
	}
	
	public static void main(String[] args) 
	{
		String[] strArr = {"a","bc","d","efg","hi"};
		int result = solution(strArr);
		System.out.println(result);
	}
}
