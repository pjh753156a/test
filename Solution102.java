package Iv000;

/*
 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 
 * 마지막 원소 다음으로 올 숫자를 return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution102 
{
	public static int solution(int[] common) 
	{
		int answer = 0;
	        
		if((common[common.length-1]-common[common.length-2])-(common[common.length-2]-common[common.length-3])==0)
	    {
			answer = common[common.length-1]+common[common.length-1]-common[common.length-2];
	    }
		else
		{
			answer = common[common.length-1]*(common[common.length-1]-common[common.length-2])/(common[common.length-2]-common[common.length-3]);
		}
	        
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] common = {2, 4, 8};
		int result = solution(common);
		System.out.println(result);
	}
}
