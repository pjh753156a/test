package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 배열 arr와 query가 주어집니다.
 * query를 순회하면서 다음 작업을 반복합니다.
 * 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 
 * 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
 * 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 
 * 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
 * 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution28 
{
	 public static int[] solution(int[] arr, int[] query) 
	 {
	        boolean flag = true;
	        for (int i:query)
	        {
	            if (flag)
	            {
	                arr = Arrays.copyOfRange(arr, 0, i+1);
	                flag = false;
	            }
	            else
	            {
	                arr = Arrays.copyOfRange(arr, i, arr.length);
	                flag= true;
	            }
	        }

	        return arr;
	    }
	
	public static void main(String[] args) 
	{
		int[] arr = {0, 1, 2, 3, 4, 5};
		
		int[] query = {4, 1, 2};
		
		int[] result = solution(arr,query);
		
		System.out.println(Arrays.toString(result));
	}
}
