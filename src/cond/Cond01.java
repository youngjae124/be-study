package cond;

public class Cond01 {

	public static void main(String[] args) {
		
		// 조건문 if문
		
		// if  (조건식 ) 참 -> 실행
		
		int num = 15;            //  if 문 은 조건문에 충족하지 않으면 실행이 되지 않는다
		int x = 3;
		if ( num > 5 ) {
			System.out.println("num이 5보다 크다");
			System.out.println("if 문 안에 실행");
		//=====================================================================================	
		//int x= 30; //	x 변수명 중복
			x=30; //	 x 는 이미 12번 라인에 선언되어있음
			
			int y = 20;
			y = y + 50;
			
			}
			x =20;
			//	y= y -5;  // 중괄호 밖으로 나와서 인식을 할수가 없다  
			//	y 변수 는 저 위에 if문 지역 내부에서만 인식되는 변수이기에 인식할수가 없다 (지역 변수)
			
			int y =5;
 		
		// if -else문 if 조건문이 false 면 else 을 사용한다 
		if (num < 10 ) {
			System.out.println("num 이 10보다 작다");	
			System.out.println("num 이 작다...");
		}
		else 
			System.out.println("num 이 10보다 작지않다");
	
		// if(조건식)  조건식 -> 결과가 논리형이다 (true/flase)
		
		boolean bln = (num != 15);
		 //boolean 은 논리형이 기때문에 if(조건문에) 조건식 없이 사용이 가능하다
	if(bln) { // 결과가 논리형이면 가능하다
		//if (bln == true) {
		//if(bln == flase) {
			System.out.println("15랑 다른수 ");
		}else {
			System.out.println("15랑 같은수 ");
		}
		
		
		 System.out.println("end");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
