package org.dimigo.oop;

import java.util.*;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("가장 좋아하는 가수는?");
		
		String answer = scanner.nextLine();
		if("아이유".equals(answer))
		{
			System.out.println("정답입니다!! ^^");
		}
		else
		{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("");
		
		
		System.out.println("가장 좋아하는 배우는?");
		
		String answer1 = scanner.nextLine();
		if("유해진".equals(answer1))
		{
			System.out.println("정답입니다!! ^^");
		}
		else
		{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("");
		
		System.out.println("가장 좋아하는 축구선수는?");
		
		String answer2 = scanner.nextLine();
		if("제라드".equals(answer2))
		{
			System.out.println("정답입니다!! ^^");
		}
		else
		{
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		System.out.println("");
		scanner.close();
	}

}
