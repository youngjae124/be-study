package be_study.quiz;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
//		System.out.print(" 탑승 인원 수 입력 : ");
//		int personCount = scanner.nextInt();
//		
//		int[]destFloorArr =new int[personCount];
//		System.out.println(" 목적지 층수 입력 (2~100 : ");
//		
//		for(int i=0; i<destFloorArr.length; i++) {
//			destFloorArr[i]=scanner.nextInt();
//			
//			System.out.println(" 최대 멈추는 횟수");
//			int maxStopCount = scanner.nextInt();
//			
//			
//			for(int i1=1; i1<=100; i1++) {
//				System.out.println(i1+"층");
//				for(int j=0; j<destFloorArr.length; j++) {
//					if(i == destFloorArr[j]) {
//						System.out.println("도착");
//					}
//				}
//			}
//			for(int i1=100; i1>=1; i1--) {
//				System.out.println(i1 + "층");
//		}
//		
//
//	}
		
		//------------선생님 풀이 ---------------------------
		
		int personCount =(int) (Math.random() * 20)+1;
		System.out.println("탑승 대기인원 : "+ personCount);
		
		int[]destFloorArr = new int[personCount];
		System.out.print("목적지 층수 입력 (2~100) : ");
		for(int i =0; i<destFloorArr.length; i++) {
			
			destFloorArr[i] = (int)(Math.random()*99)+2;
			System.out.print(destFloorArr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("최대 멈춤 횟수 입력 : ");
		int maxStopCount = scanner.nextInt();
		// 각승객의 몸무게 랜덤 생성 40~150kg
		int[]weightArr = new int[personCount];
		System.out.println("탑승객 몸무게 목록(40~150kg)");
		for(int i=0; i<weightArr.length; i++);
		weightArr[i]=(int)(Math.random()*20)+1;
		
		
		System.out.println("엘리베이터 정보 입력");
		System.out.print("최대 허용 총 무게 입력 :");
		int maxWeight = scanner.nextInt();
		System.out.print("탑승 정원 입력 :");
		int maxPersonCount = scanner.nextInt();
		
		int sumWeight = 0; // 승객 무게 합 
		int realPersonCount = 0; // 실제 탑승 인원이 몇명인가0.................
		
		// 무게 계산
		for(int i=0; i<weightArr.length; i++) {
			if(i>maxPersonCount) {
				realPersonCount =maxPersonCount;
				break;
			}
			// 최대 무게 계산
			if(sumWeight + weightArr[i] > maxWeight) {//혹시 이번 승객이 탄다고 가정하면 무게를 더이상 더하면 안됨
				realPersonCount =i;
				break;
			}else {
				sumWeight = sumWeight + weightArr[i];								
			}										
		}
		
		
		
		
		
		
		
		
		
	}
}
