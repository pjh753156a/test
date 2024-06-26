package programmers2;

/*
 * 선분 세 개로 삼각형을 만들기 위해서는 
 * 다음과 같은 조건을 만족해야 합니다.
 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다
 * 삼각형의 두 변의 길이가 담긴 배열 
 * sides이 매개변수로 주어집니다. 
 * 나머지 한 변이 될 수 있는 정수의 개수를 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution149 
{
	public static int solution(int[] sides) 
	{
		int answer = 0;
		int Bignumb=0;
		int smallnub=0;
		int temp=0;
		int Bigestnum=0;
		
		Bignumb =  sides[0] >= sides[1] ? sides[0] : sides[1];
		smallnub =  sides[0] <= sides[1] ? sides[0] : sides[1];
		Bigestnum=Bignumb+smallnub;
		
		while(true)
		{
			if(temp+smallnub>Bignumb)
			{
				answer++;
			}
			
			temp++;
			
			if(temp>Bignumb)
			{
				break;
			}
		}
		
		while(true)
		{
			if(Bignumb+smallnub>Bigestnum)
			{
				answer++;
			}
			
			Bigestnum--;
			
			if(Bigestnum<=Bignumb)
			{
				break;
			}
		}
		
		
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] sides = {11, 7};
		int result = solution(sides);
		System.out.println(result);
	}
}
