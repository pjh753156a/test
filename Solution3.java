package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  프로그래머스 문제3
	정수 배열 arr가 주어집니다. 
	arr를 이용해 새로운 배열 stk를 만드려고 합니다.
	변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
	만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
 	stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 
 	arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
	stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 
	stk의 마지막 원소를 stk에서 제거합니다.
	위 작업을 마친 후 만들어진 stk를 return 하는 
	solution 함수를 완성해 주세요.
 */

public class Solution3 
{
	public static int[] solution(int[] arr) 
	{
	        int[] stk = {};
	        List<Integer> cstk = new ArrayList<Integer>();
	        for(int i=0;i<arr.length;)
	        {
	        	if(cstk.size()==0)
	        	{
	        		cstk.add(arr[i]);
	        		i++;
	        	}
	        	else if(cstk.get(cstk.size()-1)<arr[i])
	        	{
	        		cstk.add(arr[i]);
	        		i++;
	        	}
	        	else if(cstk.get(cstk.size()-1)>=arr[i])
	        	{
	        		cstk.remove(cstk.size()-1);
	        	}
	        }
	        stk = new int[cstk.size()];
	        for(int i=0;i<stk.length;i++)
	        {
	        	stk[i]=cstk.get(i);
	        }
	        return stk;
	}
	

	public static void main(String[] args) 
	{
		int[] arr = {1, 4, 2, 5, 3};
		int[] result = solution(arr);
		System.out.println(Arrays.toString(result));
	}
}
