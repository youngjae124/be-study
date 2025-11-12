package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
//		int count =0;
//		int floor =0;
//		int numberFloor =0;
//		
//		System.out.println("탑승인원을 입력해주세요");
//		numberFloor=scanner.nextInt();
//		
//		int[]destinations =new int[numberFloor];
//		
//		while(true) {
//			floor=1;
//			if(count>= numberFloor) {
//				break;
//			}
//			System.out.println((count +1)+"번째 사람이 내릴 층 (2~100): ");
//			floor= scanner.nextInt();
//			
//			if(floor>=2 && floor <=100) {
//				destinations[count] = floor;
//				count++;
//			}else {
//				System.out.println("유효하지 않은 층입니다");
//			}									
//		}
//		
//		System.out.println(" 엘리베이터가 올라갑니다");
//		int currentFloor =1;
//		while(currentFloor <=100) {
//			System.out.println(" 현재층 :"+ currentFloor);
//			for(int i=0; i< numberFloor; i++) {
//				if(destinations[i] == currentFloor) {
//					System.out.println(" "+ currentFloor + "층에서 사람이 내립니다");
//				}
//			}
//			currentFloor++;
//		}
//		
//		System.out.println("엘리베이터가 내려갑니다");
//		currentFloor = 100;
//		while(currentFloor>=1) {
//			System.out.println("현재층 : " + currentFloor);
//			currentFloor--;
//		}
		
		
		//----------------------------------------------------------
		
		
		
		
		
//		int people = scanner.nextInt();
//		int count =100;
//		while(true) {
//			if(count >= people) {
//				break;
//			}
//		}
//		System.out.println((count +1)+ "번째 사람이 내릴 층 (2~100): ");
//		int floor = scanner.nextInt();
//		
//		if(floor>=2 && floor <=100) {
//			System.out.println(floor + "층에서 사람이 내립니다");
//			count++;
//		}else {
//			System.out.println("유효하지 않은 층입니다");
//		}
//		
//		System.out.println("엘리베이터가 올라갑니다");
//		System.out.println("엘리베이터가 내려갑니다");
		
		//-------------선생님 풀이 -------------------------------
		
		System.out.println("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt(); //  탑승할 사람 수 
		// 10 5
		int[]destFloorArr = new int[personCount]; // 사람 수많큼 층수 입력을 저장할 배열 생성
		System.out.println("목적지 층수 입력 (2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt(); 
			//2~100 층 필터링 예외 처리
		}
		for(int i=0; i<=100; i++) { // 올라갈때 몇층에 멈출것인가?
			System.out.println(i + "층"); // 멈처야 하는층 정보 : destFloorArr
			for(int j=0; j<destFloorArr.length; j++) {
				// 현재층이 목적지 층에 속해 있는지 비교하는것
				if(i == destFloorArr[j]) { // 멈춰야하는 층이 맞다!
					System.out.println("***도착 (승객 하차)***");
					
				}
			}
		}
		for(int i=100; i>=1; i--) {// 내려오기 100층에서 1층으로
			System.out.println(i + "층");
		}
		
		
		
	
		
		
		
	}

}
