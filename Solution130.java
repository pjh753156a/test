package Iv000;

/*
 * 1부터 13까지의 수에서, 
 * 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
 * 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution130 
{
    public static int solution(int i, int j, int k)
    {
        int answer = 0;
        int check;
        for(int index=i;index<=j;index++)
        {
            check=index;
            while(true)
            {
                if(check%10==k)
                {
                    answer++;
                }
                check=check/10;
                if(check==0)
                {
                    break;
                }
                
            }
        }
        return answer;
    }

    public static void main(String[] args) 
    {
        int i=3;
        int j=10;
        int k=2;
        int result = solution(i, j, k);
        System.out.println(result);
    }
}
