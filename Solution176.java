package programmers3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution176 
{
	public static int solution(int[] numbers) 
	{
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length;i++)
        {
        	list.add(numbers[i]);
        }
        
        Collections.sort(list);
        
        answer=list.get(list.size()-1)*list.get(list.size()-2);
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] numbers = {0, 31, 24, 10, 1, 9};
		int result = solution(numbers);
		System.out.println(result);
	}
}
