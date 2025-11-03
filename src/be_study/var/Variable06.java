package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		
		// 기본 타입 값 비교와 문자열 비교

		// 기본 타입의 값비교는 == 을 사용한다
		// 문자열의 비교는 equals() 메소드 를 사용한다 
		
		Scanner scanner = new Scanner(System.in); 
		
		int num1 = scanner.nextInt();
		int num2 = 10;
		// 값이 같은가 를 사용하는 비교하는 연산자 ==사용한다
		// ==비교 결과 논리형 (true/false)로 나온다
		boolean b1 = (num1==num2); // 논리 타입으로 나온다 
		System.out.println(b1);
		
		scanner.nextLine(); // 앞에남은 엔터 (\n) 청소용
		
		String str1 = scanner.nextLine();
		String str2 = "햄버거";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2) );
		System.out.println(str2.equals(str1) );
		System.out.println(str1.equals("햄버거") );
		
		// 문자열(string)값 비교할때는 ==은 사용하지말고 equals를 사용한다
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
