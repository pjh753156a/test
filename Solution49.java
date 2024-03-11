package lv0;

/*
 * 문자열 myString과 pat가 주어집니다. 
 * myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution49 
{
   public static String solution(String myString, String pat) 
   {
      String answer = "";
      int lastIndex = myString.lastIndexOf(pat);
      for(int i=0;i<lastIndex+pat.length();i++)
      {
    	  answer=answer+myString.charAt(i);
      }
      return answer;
   }
   

   public static void main(String[] args) 
   {
      String myString = "AAAAaaaa";
      String pat = "aa";
      String result = solution(myString, pat);      
      System.out.println(result);
   }
}
