package lv0;

import java.util.Scanner;

public class snail_problems 
{
	public static void main(String[] args) throws Exception
    {
		System.out.print("숫자를 입력하세요");
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    int nx1 = 0;
	    int nx2 = 0;
	    int n = 0;
	    int j = 1;
	    int sw=1;
	    int[][] arr = new int[number][number];
	    if (number % 2 == 0) 
	    {
	          nx1 = (number - 2) / 2;
	          nx2 = (number - 2) / 2;
	    }
	    if (number % 2 == 1) 
	    {
	          nx1 = (number - 1) / 2;
	          nx2 = (number - 1) / 2;
	    }
	    arr[nx1][nx2] = 1;  
	    
	    for (int i = 1; i <= Math.pow(number, 2);) 
	    {
	         if(sw==1)
	         {
	               for(n=0;n<j;n++)
	               {
	                    nx1++;
	                    i++;
	                    if (i > Math.pow(number, 2))
	                    {
	                        break;
	                    }
	                    arr[nx1][nx2]=i;
	               }
	               for(n=0;n<j;n++)
	               {
	                    nx2++;
	                    i++;
	                    if (i > Math.pow(number, 2)) 
	                    {
	                    	break;
	                    }
	                    arr[nx1][nx2]=i;
	               }
	               j++;
	               sw=0;
	               continue;
	         }
	         if(sw==0)
	         {
	              for(n=0;n<j;n++)
	              {
	                    nx1--;	                 
	                    i++;
	                    if (i > Math.pow(number, 2)) 
	                    {
	                    	break;
	                    }
	                    arr[nx1][nx2]=i;
	              }
	              for(n=0;n<j;n++)
	              {
	                    nx2--;	                    
	                    i++;
	                    if (i > Math.pow(number, 2)) 
	                    {
	                    	break;
	                    }
	                    arr[nx1][nx2]=i;
	              }
	              j++;
	              sw=1;
	          }
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    {
	         for(int j2=0;j2<arr[i].length;j2++)
	         {
	                System.out.print(arr[i][j2]+"\t");
	         }
	         System.out.println();
	    }
	}									
}									