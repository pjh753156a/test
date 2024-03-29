package programmers2;

/*
 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 
 * 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 
 * return 하도록 solution 함수를 완성해 주세요.
 */

public class Solution123
{
	public static long solution(String numbers) 
	{
        long answer = 0;
        numbers=numbers.replaceAll("zero","0");
        numbers=numbers.replaceAll("one","1");
        numbers=numbers.replaceAll("two","2");
        numbers=numbers.replaceAll("three","3");
        numbers=numbers.replaceAll("four","4");
        numbers=numbers.replaceAll("five","5");
        numbers=numbers.replaceAll("six","6");
        numbers=numbers.replaceAll("seven","7");
        numbers=numbers.replaceAll("eight","8");
        numbers=numbers.replaceAll("nine","9");
        answer = Long.parseLong(numbers);
        return answer;
    }
	
	public static void main(String[] args)
	{
		String numbers = "onefourzerosixseven";
		long result = solution(numbers);
		System.out.println(result);
	}
}
