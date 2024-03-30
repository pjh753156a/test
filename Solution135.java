package Iv000;

import java.util.Arrays;

/*
 * 영어 점수와 수학 점수의 평균 점수를 기준으로 
 * 학생들의 등수를 매기려고 합니다. 
 * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 
 * 영어 점수와 수학 점수의 평균을 기준으로 
 * 매긴 등수를 담은 배열을 return
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution135 
{
    public static int[] solution(int[][] score) 
    {
        int[] answer = {};
        answer = new int[score.length];
        int num=0;
        double[] avgarr2 = new double[score.length];

        for(int i=0;i<avgarr2.length;i++)
        {
            avgarr2[i] = (score[i][0]+score[i][1])/2.0;
        }

        Arrays.sort(avgarr2);
        //System.out.println(Arrays.toString(avgarr2));

        for(int i=avgarr2.length-1;i>=0;i--)
        {
            num++;
            if(i==avgarr2.length-1)
            {
                answer=compare(avgarr2[i],score,answer,num);
            }
            else if(i!=avgarr2.length-1 && avgarr2[i]!=avgarr2[i+1])
            {
                answer=compare(avgarr2[i],score,answer,num);
            }
            
        }

     
        return answer;
    }


    public static int[] compare(double avgarr,int[][] score,int[] answer,int num) 
    {
        for(int i=0;i<score.length;i++)
        {
               if(avgarr==(score[i][0]+score[i][1])/2.0)
               {
                    answer[i]=num;
               }

        }

     
        return answer;
    }

    public static void main(String[] args) 
    {
        int[][] score = {{1, 1}, {0, 0}, {2, 2}};
        int[] result = solution(score);
        System.out.println(Arrays.toString(result));
    }
}
