package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
	//	1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
	//System.out.print("정수입력 :" );
	// int input = scnner.nextInt();
	// %2 결과 0 -> 2의배수 -> 짝수
	 // %2 결과 1 -> 홀수
	
	
		
		
		
		
		
		
		
		
	
	//	2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.

		//3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		// int i = 1;					 	 
	//	 for( i= 1; i<=1000; i =i+5) {
		//	 int x = 0;
		//	 System.out.println("");
		// }
	 int sum =0;
	// for(int i =1; i<=100; i++) {
	//	 sum =sum +i;
	// }
	 	for(int i =1; i<=1000; i++) { // ㅑ:1.2.3.4.5....999.1000
		 //5 의 배수일때만
	 		if(i%5 == 0) { // 1x2x3x4x5x6x7x8x9x100x
	 			sum = sum+i;  // +5+10....
	 		}
	 		
	 	}
	 	System.out.println("1~1000까지 중 5의 배수의 합:"+sum);
	 	
	 	sum=0;
	 	for(int i=5; i<=1000; i=i+5) {
	 		sum = sum +i;
	}
		System.out.println("1~1000까지 중 5의 배수의 합:"+sum);
		
		
		
		
		//4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		//ex) 입력 : 10
		//결과 : **********
		// int q =40;
	//	 for (q=40; q<=50; q++) {
		//	 System.out.printf("*");		
		// }
		 
		//System.out.print("1~50 까지 수 입력 :");
		//int num = scanner.nextInt();
		// *을 몇번을 출력을 할것인지  while for  어디~어디~
		// for 몇번 
		//for (초기화 조건 증감 )
		//System.out.print("*");
		
		//if(num==1) { System.out.println("*");}
		//if(num==1) { System.out.println("**");}
		//if(num==1) { System.out.println("***");}
		//if(num==1) { System.out.println("*****");}
		
		
		
		//if(num >=1 && num <=50) {}
		 
		// 4번 문제 정답 
		//System.out.print("1~50 까지 수 입력 :");
		
		//int num = scanner.nextInt();
		//for(int i=num; i>=1; i--) {
		//	System.out.print("*");
		//}
		 
		 
		//5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		//ex) 1 - 2 + 3 - 4 .....
		// 5번 정답
		//int result = 1 - 2 +3 -4 +5 -6 +7 -8 +9 -10;
		//int result = 0;
	//	for(int i=1; i<=10; i++) {
		//	if(i%2 == 0) {
		//		result = result -i;
		//	}else {
		//		result = result +i;
		//	}
	//	}
		//	System.out.println(result);
		
		
	//	6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
	//	1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		// 6번 정답   ex)1번 풀이
		int total = 0;
		for(int i=1 ; i<=1000; i++) {
			if(total < 1000) {
			total = total+i;			
		}else {
			break;
		}
	}		
		System.out.println(total); 
	
	// ex) 2번풀이	
		total=0;
		int i = 1;
		while(true) {
			
			total=total +i;  //   <- total = total +total + i++; 형식으로 도 사용이 가능하다
			i++;				//   <-  i = i +1; 형식으로 사용이 가능하다 
			
			if(total >= 1000) {
				break;
			}
		}
		System.out.println(total);
		
		
		// ex)3번째 풀이
		
		total = 0;
		i=1;
		while (total < 1000) {
			total = total +i;
			i++;
		}
		System.out.println(total);
		
		//4 번째 풀이  // for문 위체에 따른것 다른변수들이 조건에 들어가도 상관없다.
		
		total =0;
		for(i=1; total<=1000; i++) {
			total = total +i;
		}
		System.out.println(total);
		
		
		
		
	//	7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
	//	ex) 입력 3
	//	3 * 1 = 3
	//	3 * 2 = 6
	//	3 * 3 = 9
	//	...
	//	3 * 9 = 27
		
	System.out.print("1~9까지 중에 보고싶은 구구단은? :");	
	int num = scanner.nextInt();
	
	for(int i1=1; i1<=9; i1++) {
		
		System.out.printf("%d * %d = %d\n" , num , i1 ,num * i1 );
	}
		
		
		
		
		
		
		
		
	}

}
