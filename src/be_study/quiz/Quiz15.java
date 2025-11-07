package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	/*	+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 55
		결과 : 90				*/
		
		int[] arr1 = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("정수를 입력해 주세요 :");
			arr1[i]= scanner.nextInt();
		}
		int a = 0;
		System.out.println("몇번째 수 인가요? :");
		a = scanner.nextInt();
			System.out.println(arr1[a]); 

	/*	2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1			*/
			
	//	int n1, n2, n3, n4, n5;
		
		int[] arr2 = new int[5];  //ㅁ ㅁ ㅁ ㅁ ㅁ
		for(int i=0; i<5; i++) { // i: 0,1,2,3,4
			System.out.println("정수를 입력해 주세요 :");
			arr2[i]= scanner.nextInt();
		}
		
		/*	System.out.println("정수를 입력해 주세요 :");
			arr2[0]= scanner.nextInt();
			
			System.out.println("정수를 입력해 주세요 :");
			arr2[1]= scanner.nextInt();
			
			System.out.println("정수를 입력해 주세요 :");
			arr2[2]= scanner.nextInt();
			
			System.out.println("정수를 입력해 주세요 :");
			arr2[3]= scanner.nextInt();
			
			System.out.println("정수를 입력해 주세요 :");														
			arr2[4]= scanner.nextInt(); 	*/		
				 										
		for(int i=4; i>=0; i--) {
			System.out.print(arr2[i]);			
		}
			
	
	/*	3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16			*/
	//	arr3 = new int []  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int [][] arr3 = new int [4][4];	// 4행4열
		int n = 1;
		// 값을 저장하는곳		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				
			arr3[i][j] = n++;
			}
			
		}	// 값을 출력하는곳	
		for (int i=0; i<4; i++ ) {
			for(int j=0; j<4; j++) {
				System.out.print(arr3[i][j]+" ");				
			}
			System.out.println();
		}
				
		
		
		
		
		
		
		
		
	}	

}
