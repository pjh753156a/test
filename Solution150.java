package programmers2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 
 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 
 * 그다음 사람에게만 던질 수 있습니다. 
 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, 
 * k번째로 공을 던지는 사람의 번호는 무엇인지 
 * return 하도록 solution 함수를 완성해보세요.
 */

public class Solution150 
{
	public static int solution(int[] numbers, int k) 
	{
		int answer = 0;
		int count=0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<numbers.length;i++)
		{
			list1.add(numbers[i]);
		}
		
		for(int i=0; i<k;i++)
		{
			list2.addAll(list1);
		}
		
		for(int i=1; i<=k;i++)
		{
			answer=list2.get(count);
			count=count+2;
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] numbers = {1, 2, 3};
		int k = 3;
		int result = solution(numbers, k);
		System.out.println(result);
	}

}
