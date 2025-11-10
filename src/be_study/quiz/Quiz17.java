package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
/*
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();			
		}
		

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}  */
	// ----------------------------------------------
	/*	System.out.println("입력 :");
		int num = scanner.nextInt();
		
	
		for(int i= 1; i <=num; i++) {
			if(num % i == 0) {
			System.out.print(i + " ");
			}
			
		}			*/
		//-------------------------------------------------------
	/*	
		System.out.print("입력 :");
		int n = scanner.nextInt();

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	for(int i = 5; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();			
		}
		
		
		System.out.print("입력 :");
		int n1 = scanner.nextInt();
		
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	for(int i = n1; i>=1; i--) {
			for(int j = 1; j<i; j++) {
				System.out.print("*");
			}System.out.println();			
		}
		
		//--------------------------------------------------
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum = sum + j;				
			}
		}
		System.out.println("누적 총합 :"+ sum);
		
		
		
		sum =0 ;
		int currentSum = 0;
		for(int i=1; i <=10; i++) {
			currentSum =currentSum +i;
			sum =sum +currentSum;
		}
		System.out.println("누적 총합"+ sum);
		
		sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum+(i * (10-(i-1)));
		}
		System.out.println("누적 총합 "+ sum);  */
	//----------------------------------------------------------------	
		int i =0;
		int total =0;
		while(true) {
			if(i%2 == 0) {//짝수 뺴기
				total =total - i;
			}else {//홀수 더하기
			total = total + i;
		}
		if (total >=100)
			break;
			i++;		
		}
		System.out.println("100이 넘은시점 누적합 :"+total+"얼마까지 계산:" +i);
		
		
		total = 0;
		for(i=1; total<100; i++) {
			if(i%2 ==0 ) {
				total = total -i;
			}else {
				total= total +i;
			}
		}
		System.out.println("100이 넘은시점 누적합 :"+total+"얼마까지 계산:" +(i-1));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		}	
	}

