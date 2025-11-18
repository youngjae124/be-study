package be_study.quiz;

public class TopScoreStudent {

	public static void main(String[] args) {
		// 배열 생성
		String[] names = { "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel" };
		int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98 };

		// 1등 인덱스 검색
		int i = topIndex(scores);

		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}

	// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) { // scores -> arr
		/* 해당 함수를 완성하세요. */
//		int scores = 0;
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];// 최대값
				maxIndex = i;
			}
//			if(arr[i]>arr[scores]) {
//				scores =  i ;
//			}
		}
		return maxIndex;
//		return scores; 
	}
}