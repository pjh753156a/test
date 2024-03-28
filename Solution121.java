package Iv000;

import java.util.Arrays;

/*
 * 문자열 s가 매개변수로 주어집니다. 
 * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 
 * return 하도록 solution 함수를 완성해보세요. 
 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */

public class Solution121 
{
    public static String solution(String s)
    {
        String answer = "";
        char[] chars = s.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(chars);

        // 정렬된 문자 배열을 다시 문자열로 변환
        s = new String(chars);
        String[] result = s.split("(?<=(.))(?!\\1)");

        for(int i=0;i<result.length;i++)
        {
            if(result[i].length()==1)
            {
                answer=answer+result[i];
            }
        }

      
        return answer;
    }

    public static void main(String[] args) 
    {
        String s = "aabbccc";
        String result = solution(s);
        System.out.println(result.toString());
    }
}
