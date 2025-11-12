package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	/*
	  수행하는 순서(흐름)
	  조건-> 처리방향
	  언제까지
	  *** 메뉴 뭐 시켰는지 어디에 저장/관리 하는지
	  *** 메뉴 뭐 몇개를 시켰는지
	  *** 메뉴 금액 얼만지 어디에?
	  ***가지고 있는 메뉴가 뭐가 있는지
	  
	  (순서대로 진행)
	  메뉴 보여주기 -> 어떻게 보여줄건지
	  메뉴 선택 입력받기
	  ->단순입력
	  ->잘못입력했을때 대처
	  주문수량 몇개 입력받기
	  ->단순입력
	  ->잘못입력 했을때 대처
	  추가 주문 여부 체크(y/n)
	  -추가주문 y -> 다시 메뉴보여주기 반복
	  -추가주문 n->끝
	  주문한 메뉴별 수량 보여주기
	  주문 총금액 보여주기
	 */
		
		
		//선생님 풀이
		
	//	while(true) {
			//메뉴보여주기
			//메뉴선택
			//수량선택
			//추가주문 여부 선택
		// if(추가주문 여부가 "n"이다?
			//break -> 주문내역/금액출력 ->끝
	//	}
		// 주문내역/금액 출력 끝!
	
	//---------------------------------------------------------------	
		
		
		
		

//		System.out.println("메뉴");
//		System.out.println("아메리카노 3500원");
//		System.out.println("카페라떼 4100원");
//		System.out.println("바닐라 라떼 4300원");
//		System.out.println("주문종료");
//		System.out.print("메뉴번호를 선택하세요");
//		
//		int drink = scanner.nextInt();
//		while(true) {
//			if(drink == 1) {
//				System.out.println("메뉴");
//				drink=scanner.nextInt();
//			}else if(drink ==2){
//				System.out.println("아메리카노");
//				drink=scanner.nextInt();
//			}else if(drink ==3) {
//				System.out.println("카페라떼");
//				drink=scanner.nextInt();
//			}else if(drink ==4) {
//				System.out.println("바닐라 라뗴");
//				drink=scanner.nextInt();
//			}else if(drink == 5) {
//				System.out.println("주문종료");
//				break;				
//			}else {
//				System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
//			}
//		}
	
		
		
//		int americano = 0, latte = 0, vanilla = 0;
//        int total = 0;
//
//        final int AMERICANO_PRICE = 3500;
//        final int LATTE_PRICE = 4100;
//        final int VANILLA_PRICE = 4300;
//
//        while (true) {
//            System.out.println("\n========== 메뉴 ==========");
//            System.out.println("1. 아메리카노 3500원");
//            System.out.println("2. 카페라떼 4100원");
//            System.out.println("3. 바닐라 라떼 4300원");
//            System.out.println("4. 주문 종료");
//            System.out.print("메뉴 번호를 선택하세요: ");
//
//            int drink = scanner.nextInt();
//
//            if (drink == 1) {
//                System.out.print("아메리카노 수량 입력: ");
//                int qty = scanner.nextInt();
//                americano += qty;
//                total += qty * AMERICANO_PRICE;
//            } else if (drink == 2) {
//                System.out.print("카페라떼 수량 입력: ");
//                int qty = scanner.nextInt();
//                latte += qty;
//                total += qty * LATTE_PRICE;
//            } else if (drink == 3) {
//                System.out.print("바닐라 라떼 수량 입력: ");
//                int qty = scanner.nextInt();
//                vanilla += qty;
//                total += qty * VANILLA_PRICE;
//            } else if (drink == 4) {
//                System.out.println("주문을 종료합니다.");
//                break;
//            } else {
//                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//            }
//        }
//
//        // 주문 내역 출력
//        System.out.println("\n========== 주문 내역 ==========");
//        if (americano > 0) System.out.println("아메리카노 " + americano + "잔\t" + (americano * AMERICANO_PRICE) + "원");
//        if (latte > 0) System.out.println("카페라떼 " + latte + "잔\t" + (latte * LATTE_PRICE) + "원");
//        if (vanilla > 0) System.out.println("바닐라 라떼 " + vanilla + "잔\t" + (vanilla * VANILLA_PRICE) + "원");
//        System.out.println("총 금액: " + total + "원");
        
     //----------------------------------------------------------------------------------
        
//        int[]scores = {88,92,75,63,95,70,85,90,100,67};
//        int max =scores[0];
//        int min =scores[0];
//        int sum = 0;
//        int count80 =0;
//        
//        for(int i=0; i<scores.length; i++) {
//        	if(scores[i]>max) max= scores[i];
//        	if(scores[i]<min) min= scores[i];
//        	sum +=scores[i];
//        	if(scores[i]>=80)count80++;       	
//        }
//        double avg= (double)sum/scores.length;
//        
//        System.out.println("최고점수"+max);
//        System.out.println("최저점수"+min);
//        System.out.println("평균점수"+avg);
//        System.out.println("80점 이상학생수"+count80+"명");
        
    // ------------------선생님 풀이--------------------------------
        
		int[]scores = {88,92,75,63,95,70,85,90,100,67};
		 int sum = 0;
		 int count80 =0;
		 int max =scores[0];
		 int min =scores[0];
		 for(int i=0; i<scores.length; i++) {
			 sum += scores[i];
			 
			 if(scores[i] >= 80) {
				 count80++;
			 }
			 // 최소값 찾기
			 if(scores[i]<min) {
				 min = scores[i];
			 }
			 // 최대값 찾기
			 if(scores[i]>max) {
				 max = scores[i];
		 }
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : "+ min);
        System.out.println("평균점수 " + (double)sum/scores.length);
        System.out.println("80점 이상 학생수 : "+ count80);
		 
    }								
}
}

