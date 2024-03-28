package programmers2;

import java.util.Arrays;

/*
 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 
 * 문자열 배열 quiz가 매개변수로 주어집니다. 
 * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 
 * return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution112 
{
	public static String[] solution(String[] quiz) 
	{
		String[] answer = {};
		answer = new String[quiz.length];
		String[] FiveNumber = new String[5];
		int num1;
		int num2;
		int num3;
		
		for(int i=0;i<quiz.length;i++)
		{
			FiveNumber=quiz[i].split(" ");
			System.out.println(Arrays.toString(FiveNumber));
			num1 = Integer.parseInt(FiveNumber[0]);
			num2 = Integer.parseInt(FiveNumber[2]);
			num3 = Integer.parseInt(FiveNumber[4]);
			
			switch(FiveNumber[1])
			{
				case "-":
					answer[i] = num1-num2==num3 ? "O":"X";
					break;
				case "+":
					answer[i] = num1+num2==num3 ? "O":"X";
					break;
			}
				
		}
		return answer;
	}
	
	public static void main(String[] args) 
	{
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] result = solution(quiz);
		System.out.println(Arrays.toString(result));
 	}
}
