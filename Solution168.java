package programmers3;

/*
 * 문자열 my_string이 매개변수로 주어집니다. 
 * my_string안의 모든 자연수들의 합을 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution168 
{
    public static int solution(String my_string) 
    {
        int answer = 0;
        
        
        
        for(int i=0;i<my_string.length();i++)
        {
        	if(my_string.charAt(i)>=49 && my_string.charAt(i)<=57)
        	{
        		answer=answer+my_string.charAt(i)-48;
        	}
        }
        return answer;
    }

	public static void main(String[] args) 
	{
		String my_string = "aAb1B2cC34oOp";
		int result = solution(my_string);
		System.out.println(result);
	}
}
