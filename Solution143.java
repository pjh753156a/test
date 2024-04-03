package programmers2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 
 * 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 
 * 덧셈으로 이루어진 다항식 polynomial 이 매개변수로 주어질 때, 
 * 동류항끼리 더한 결괏값을 문자열로 
 * return 하도록 solution 함수를 완성해보세요. 
 * 같은 식이라면 가장 짧은 수식을 return 합니다.
 */

public class Solution143 
{
	public static String solution(String polynomial) 
	{
		String answer = "";
		String[] strarr = polynomial.split("\\+");
		int sum = 0;
		int sum2 = 0;
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		
		for(int i=0;i<strarr.length;i++)
		{
			list.add(strarr[i]);
		}
		
//		for(String element : list)
//		{
//			System.out.print(element);
//		}
		
		System.out.println();
		System.out.println();
		
		for (String element : strarr)
		{
			element=element.trim();
			if(element.contains("x"))
			{
				if(element.length()==1)
				{
					sum = sum + 1;
				}
				else 
				{
					sum = sum + Integer.parseInt(element.replaceAll("x",""));
				}
			}
			else
			{
				sum2=sum2+Integer.parseInt(element);
			}
			//System.out.println(element);
		}
		
		if(sum2==0 && sum!=1)
		{
			answer = Integer.toString(sum)+"x";
		}
		else if(sum2==0 && sum==1)
		{
			answer = "x";
		}
		else if(sum==0)
		{
			answer = Integer.toString(sum2);
		}
		else if(sum==1)
		{
			answer = "x"+" "+"+"+" "+Integer.toString(sum2);
		}
		else 
		{
			answer = Integer.toString(sum)+"x"+" "+"+"+" "+Integer.toString(sum2);
		}
		return answer;
	}
	
	public static void main(String[] args) 
	{
		String polynomial = "x";
		String result = solution(polynomial);
		System.out.println(result.toString());
	}
}
