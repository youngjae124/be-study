package cond;

public class Cond04 {

	public static void main(String[] args) {
		
		// 중첩해서 사용
		//조건식 ? 참 : 거짓
		//조건식 ? 참 :(조건식 ? 참 : 거짓)
		
	//	if() { //참이면 앞에 if문 실행
			
	//	}else { //거짓이면 else 실행
	//		if() {}
			
//		}
		
		
		
		
		
		// 21시 전에 일찍		
		// 21시 늦게 늦게
		
		// 8시 많이 많이		
		// 8시 적게 적게
		
		// 일찍 많이 		
		// 일찍 적게		
		// 늦게 많이		
		// 늦게 적게
		
		int goBedTime = 23; // 자러간시간  //switch 범위을 지정한다
		int sleepTime = 6; // 수면시간 
		
		if(goBedTime <= 21) {			//일찍
			
			if(sleepTime >8 ) {     //많이
				System.out.println("일찍 많이");
			}else {						//적게
				System.out.println("일찍 적게");
			}
		}else {     				//늦게
			
			if(sleepTime >8 ) {     //많이
				System.out.println("늦게 많이");
			}else {						//적게
				System.out.println("늦게 적게");
		}
		 // 조건문에 해당되는 형식
		if(goBedTime <= 21 && sleepTime>8) {
			System.out.println("일찍 많이");
			//else if (goBedTime <=21 && sleepTime =>8)
		}else if (goBedTime <=21 && !(sleepTime >8)) {
			System.out.println("일찍 적게");
		}else if (goBedTime > 21 && sleepTime >8)
			System.out.println("늦게 많이");
		else { // else if
			System.out.println("늦게 적게");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	

	}


