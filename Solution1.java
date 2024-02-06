package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 프로그래머스 문제
 * 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 
 * k의 배수를 오름차순으로 저장한 배열을 
 * return 하는 solution 함수를 완성해 주세요.
 */

class Solution1 
{
    public static int[] solution(int n, int k) 
    {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
        	if(i%k==0)
        	{
        		arr.add(i);
        	}
        }
        Collections.sort(arr);
        
        answer = new int[arr.size()];
        
        for(int i=0;i<arr.size();i++)
        {
        	answer[i]=arr.get(i);
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in); 
		System.out.println("두개의 정수를 입력하세요");
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] answer = solution(n,k);
		System.out.println(Arrays.toString(answer));
	}
}