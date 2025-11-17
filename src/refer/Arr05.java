package refer;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		
		for(int i=0; i<5; i++) {
			System.out.printf("arr[%d] = %d\n", i,arr[i] );
		}
		System.out.println();
		
		int index = 0;
		for(int v: arr) {    //{10,20,30,40,50};
			
			// 배열의 전체 갯수 만큼 처음부터 끝까지 반복을 하겠다 
			// v에 들어오는것은 값이 주어진다 index는 아직 값만 들어온거라 아직 모른다 
			System.out.print(v+ " ");
			//arr[index]
			//index++;
		}
		System.out.println();
		
		int[] scores = {90,95,100,85,80};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum+ scores[i];  // 90+95+100+85+80 이라는 총합이 나옴
		}
		System.out.println(sum);
		
		sum = 0;
		// index= 0;  
		for(int s : scores) { // 이형식은 처음부터 끝까지 다 돈다 별도로 관리가 필요한다 
			sum = sum+s;
			//intdex++;
			//if(index == 숫자} break; 
			//이런형식으로 하나하나 관리
		}
		System.out.println(sum);
		
		//{90,95,100,85,80};
		//채점 실수 각 모든 점수 -5 점처리
		//{85,90,95,80,75};
		
		// 단춘 출력용
		for(int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		//-5 점 처리 
		for(int i=0; i<scores.length; i++) {
			scores[i]=scores[i]-5;
			
		}
		for(int s : scores) {  
			s = s -5;
		}
		// 단순 출력용
		for(int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
