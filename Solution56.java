package lv00;

/*
 * 문자열 binomial이 매개변수로 주어집니다. 
 * binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, 
 * op는 '+', '-', '*' 중 하나입니다. 
 * 주어진 식을 계산한 정수를 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution56 
{
	public static int solution(String binomial) 
	{
			int answer = 0;
			String[] str;
			for(int i=0; i<binomial.length();i++)
			{
				if(binomial.charAt(i)=='+')
				{
					str=binomial.split("\\+");
					answer = Integer.parseInt(str[0].trim())+Integer.parseInt(str[1].trim());
				}
				else if(binomial.charAt(i)=='-')
				{
					str=binomial.split("\\-");
					answer = Integer.parseInt(str[0].trim())-Integer.parseInt(str[1].trim());
				}
				else if(binomial.charAt(i)=='*')
				{
					str=binomial.split("\\*");
					answer = Integer.parseInt(str[0].trim())*Integer.parseInt(str[1].trim());
				}
			}
	    	return answer;
	}
	
	public static void main(String[] args) 
	{
		String binomial = "40000 * 40000";
		int result = solution(binomial);
		System.out.println(result);
	}
}
