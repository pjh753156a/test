package lv0;

/*
 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. 
 * queries의 원소는 [s, e] 형태로, 
 * my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. 
 * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 
 * return 하는 solution 함수를 작성해 주세요.
 */

class Solution9 
{
    public static String solution(String my_string, int[][] queries) 
    {
       String answer = "";
       StringBuilder sb = new StringBuilder(my_string);
       for(int i=0;i<queries.length;i++)
       {
          StringBuilder temp = new StringBuilder(sb.substring(queries[i][0], queries[i][1]+1));
          temp=temp.reverse();
          sb.replace(queries[i][0], queries[i][1]+1,temp.toString());
       }
       answer=sb.toString();
        return answer;
    }
    
    public static void main(String[] args) 
    {
      String my_string = "rermgorpsam";
      String answer;
      int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
      answer = solution(my_string,queries);
      System.out.println(answer.toString());
   }
}

