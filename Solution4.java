package lv0;

import java.util.Scanner;

// 프로그래머스 문제4
// boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 
// 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.

public class Solution4 
{
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4)
	{
        boolean answer = true;
        answer = (x1||x2) && (x3||x4);
        return answer;
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("x1를 입력하세요");
		boolean x1 = sc.nextBoolean();
		
		System.out.print("x2를 입력하세요");
		boolean x2 = sc.nextBoolean();
		
		System.out.print("x3를 입력하세요");
		boolean x3 = sc.nextBoolean();
		
		System.out.print("x4를 입력하세요");
		boolean x4 = sc.nextBoolean();
		
		boolean result = solution(x1,x2,x3,x4);
		System.out.println(result);
	}

}
