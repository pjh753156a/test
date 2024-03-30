package Iv000;

/*
 * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 
 * 매개변수로 주어질 때, 두 이진수의 합을 
 * return하도록 solution 함수를 완성해주세요.
 */

public class Solution132 
{
    public static String solution(String bin1, String bin2)
    {
        String answer = "";
        int intbin1 =Integer.parseInt(bin1,2);
        int intbin2 =Integer.parseInt(bin2,2);
        answer = Integer.toBinaryString(intbin1+intbin2);

        return answer;
    }

    public static void main(String[] args) 
    {
        String bin1 = "10";
        String bin2 = "11";
        String result = solution(bin1, bin2);
        System.out.println(result.toString());
    }
}
