package programmers3;

import java.util.Arrays;

/*
 * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
 * 문자열 letter가 매개변수로 주어질 때, 
 * letter를 영어 소문자로 바꾼 문자열을 
 * return 하도록 solution 함수를 완성해보세요
 * 모스부호는 다음과 같습니다.
 */

public class Solution156 
{ 
	public static String solution(String letter) 
	{
		String answer = "";
		String[] arr = letter.split(" ");
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i].equals(".-")) answer += "a";
			if (arr[i].equals("-...")) answer += "b";
			if (arr[i].equals("-.-.")) answer += "c";
			if (arr[i].equals("-..")) answer += "d";
			if (arr[i].equals(".")) answer += "e";
			if (arr[i].equals("..-.")) answer += "f";
			if (arr[i].equals("--.")) answer += "g";
			if (arr[i].equals("....")) answer += "h";
			if (arr[i].equals("..")) answer += "i";
			if (arr[i].equals(".---")) answer += "j";
			if (arr[i].equals("-.-")) answer += "k";
			if (arr[i].equals(".-..")) answer += "l";
			if (arr[i].equals("--")) answer += "m";
			if (arr[i].equals("-.")) answer += "n";
			if (arr[i].equals("---")) answer += "o";
			if (arr[i].equals(".--.")) answer += "p";
			if (arr[i].equals("--.-")) answer += "q";
			if (arr[i].equals(".-.")) answer += "r";
			if (arr[i].equals("...")) answer += "s";
			if (arr[i].equals("-")) answer += "t";
			if (arr[i].equals("..-")) answer += "u";
			if (arr[i].equals("...-")) answer += "v";
			if (arr[i].equals(".--")) answer += "w";
			if (arr[i].equals("-..-")) answer += "x";
			if (arr[i].equals("-.--")) answer += "y";
			if (arr[i].equals("--..")) answer += "z";
		}
		return answer;
    }

	public static void main(String[] args) 
	{
		String letter = ".... . .-.. .-.. ---";
		String result = solution(letter);
		System.out.println(result.toString());
	}
}
