package programmers2;

/*
 * 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 
 * 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
 * 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, 
 * A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 
 * return 하고 밀어서 B가 될 수 없으면 -1을 
 * return 하도록 solution 함수를 완성해보세요.
 */

public class Solution105
{
	public static int solution(String A, String B) 
	{
        int answer = 0;
        int i;
        	
        for(i=0;i<A.length()+1;i++)
        {
        	if((A.substring(A.length()-i)+A.substring(0,A.length()-i)).equals(B)) 
        	{
        		break;
        	}	
        	
        	answer++;
        }
        
        if(i==A.length()+1)
        {
        	answer=-1;
        }
        	
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String A = "abc";
		String B = "abc";
		int result = solution(A, B);
		System.out.println(result);
	}
}
