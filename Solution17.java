package lv0;

/*
 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
 * my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 
 * 문자열을 return 하는 solution 함수를 작성해 주세요.
 */

class Solution17
{
    public static String solution(String my_string, int s, int e) 
    {
        String answer = "";
        StringBuilder reversed = new StringBuilder(my_string);
        StringBuilder temp = new StringBuilder(my_string.substring(s, e+1));
        answer = reversed.replace(s, e+1,temp.reverse().toString()).toString();
        return answer;
    }
    
    public static void main(String[] args) 
    {
    	String my_string = "Progra21Sremm3";
    	int s = 6;
    	int e = 12;
		String result = solution(my_string,s,e);
		System.out.println(result.toString());
	}
}
