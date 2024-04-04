package Iv0000;

/*
 * 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 
 * 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
 * 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 
 * 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 
 * 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록
 * solution 함수를 완성해주세요.
 */

public class Solution164 
{
    public static int solution(int[] box, int n) 
    {
        int answer = 0;
        int sum1=n;
        int sum2=n;
        int sum3=n;
        int num1=0;
        int num2=0;
        int num3=0;

        while(true)
        {
            if(sum1>box[0])
            {
                break;
            }
            sum1=sum1+n;
            num1++;
        }

        while(true)
        {
            if(sum2>box[1])
            {
                break;
            }
            sum2=sum2+n;
            num2++;
        }

        while(true)
        {
            if(sum3>box[2])
            {
                break;
            }
            sum3=sum3+n;
            num3++;
        }

        answer=num1*num2*num3;

        return answer;
    }

    public static void main(String[] args) 
    {
        int[] box = {1, 1, 1};
        int n=1;
        System.out.println(solution(box, n));
    }
}
