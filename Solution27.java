package print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 정수 배열 arr가 주어집니다. 
 * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 
 * return 하는 solution 함수를 완성해 주세요.
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 */

public class Solution27
{
	public static int[] solution(int[] arr) 
	{
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
        	list.add(arr[i]);
        }
       
        
        while(list.size()>0)
        {
        	if(list.get(0)!=2)
        	{
        		list.remove(0);
        	}
        	else
        	{
        		break;
        	}
        }
        	
        
        
        while(list.size()>0)
        {
        	if(list.get(list.size()-1)!=2)
        	{
        		list.remove(list.size() - 1);
        	}
        	else
        	{
        		break;
        	}
        }
        
        if(list.size()==0)
        {
        	answer = new int[1];
        	answer[0]=-1;
        	return answer;
        }
        
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
        {
        	answer[i]=list.get(i);
        }
        
        return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,1,1,2};
		int[] result = solution(arr);
		System.out.println(Arrays.toString(result));
		
	}
}
