package lv00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 
 * 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 
 * 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution85 
{
    public static String[] solution(String[] picture, int k) 
    {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        
        String X = "";
        String G = "";
        
        for(int i=0;i<k;i++)
        {
        	X=X+"x";
        }
        
        for(int i=0;i<k;i++)
        {
        	G=G+".";
        }
        
        for(int i=0;i<picture.length;i++)
        {
        	picture[i]=picture[i].replaceAll("x",X);
        	picture[i]=picture[i].replaceAll("\\.",G);
         
        	list=add(list,picture[i],k);
        	
        }
        
        answer = new String[list.size()];
        
        for(int i=0;i<answer.length;i++)
        {
        	answer[i]=list.get(i);
        }
              
        return answer;
    }
    
    public static List<String> add(List<String> list,String picture, int k) 
    {
        for(int i=0;i<k;i++)
        {
        	list.add(picture);
        }
        
        return list;
    }
    
	public static void main(String[] args)
	{
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k = 2;
		String[] result = solution(picture, k);
		System.out.println(Arrays.toString(result));
 	}
}
