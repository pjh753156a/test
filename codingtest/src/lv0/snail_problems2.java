package lv0;

import java.util.Scanner;

public class snail_problems2 
{

	public static void main(String[] args) 
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
	          nx1 = number/2-1;
	          nx2 = number/2;
	          arr[nx1][nx2] = (int)Math.pow(number, 2);
	          for (int i = (int)Math.pow(number, 2); i >0;) 
		  	  {
		  	               for(n=0;n<j;n++)
		  	               {
		  	                    nx1+=sw;
		  	                    i--;
		  	                    if (i <=0)
		  	                    {
		  	                        break;
		  	                    }
		  	                    arr[nx1][nx2]=i;
		  	               }
		  	               for(n=0;n<j;n++)
		  	               {
		  	                    nx2-=sw;
		  	                    i--;
		  	                    if (i <=0) 
		  	                    {
		  	                    	break;
		  	                    }
		  	                    arr[nx1][nx2]=i;
		  	               }
		  	               j++;  
		  	               sw=-sw;
		  	    }  
	    }
	    if (number % 2 == 1) 
	    {
	          nx1 = (number - 1) / 2;
	          nx2 = (number - 1) / 2;
	          arr[nx1][nx2] = (int)Math.pow(number, 2);
	        for (int i = (int)Math.pow(number, 2); i >0;) 
	  	    {
	  	               for(n=0;n<j;n++)
	  	               {
	  	                    nx1-=sw;
	  	                    i--;
	  	                    if (i <=0)
	  	                    {
	  	                        break;
	  	                    }
	  	                    arr[nx1][nx2]=i;
	  	               }
	  	               for(n=0;n<j;n++)
	  	               {
	  	                    nx2+=sw;
	  	                    i--;
	  	                    if (i <=0) 
	  	                    {
	  	                    	break;
	  	                    }
	  	                    arr[nx1][nx2]=i;
	  	               }
	  	               j++;  
	  	               sw=-sw;
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
