package be_study.quiz;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력");
		System.out.println("수정");
		System.out.println("조회");
		System.out.println("삭제");
		System.out.println("종료");

		int num = scanner.nextInt();
		while (true) {
			if (num == 1) {
				System.out.println("입력");
				num = scanner.nextInt();
			} else if (num == 2) {
				System.out.println("수정");
				num = scanner.nextInt();
			} else if (num == 3) {
				System.out.println("조회");
				num = scanner.nextInt();
			} else if (num == 4) {
				System.out.println("삭제");
				num = scanner.nextInt();
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못입력하셨습니다");
			}
		}
		

		
		
		int[][] aaa = new int[5][5];
		int a = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j)
					aaa[i][j] = 1;
				else if (i < j)
					aaa[i][j] = 2;
				else
					aaa[i][j] = 3;
			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(aaa[i][j]);
			}
			System.out.println();
					
		}
		
		//----------------------------------------------------------
		
		for(int x=1; x<10; x++) {
			for(int y=1; y<10; y++) {
				if(2 * x + 4 * y == 10 ) {
					System.out.println("x ="+ x + ", y ="+ y);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
