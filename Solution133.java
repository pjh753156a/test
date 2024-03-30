package Iv000;

public class Solution133
{
    public static int solution(int chicken) 
    {
        int answer = 0;
        int coupons = chicken; 
        
        
        while (coupons >= 10) 
        {
            int serviceChickens = coupons / 10;
            answer += serviceChickens;
            coupons = serviceChickens + (coupons % 10);
        }
        
        answer += coupons / 10;
        return answer;
    }

    public static void main(String[] args)
    {
        int chicken1 = 100;
        int chicken2 = 1081;

        System.out.println(solution(chicken1)); 
        System.out.println(solution(chicken2)); 
    }
}
