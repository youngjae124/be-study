package cond;

public class Cond03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 if
		 
		 
		 if
		 
		 if
		 
		 -------
		 else 혼자 사용불가 else 는 여러개가 사용할수가 업삳
		 
		 if
		 else     else이는 if 랑 항상같이 사용이 되어야한다 
		 
		 
		 
		 
		 if
		 else if 
		 else 
		 
		 -------------
		 else if도 혼사 사용이 불가능하다  else if 는 여러개가 사용이 가능하다 	 
		 
		 if
		else if
		else if
		else if
		else if
		else if
		else if
		else
		
		 */
		
		
		int dice = 5;
		
		if(dice == 1) {
			System.out.println("1칸 전진");
		}
		if(dice == 1) {
			System.out.println("1칸 전진");
		}else {
			System.out.println("2칸 전진");
		}
		

		if(dice ==1) { //    문법적으로 실행을하다 참 거짓을 구분을해서 진행이 안될떄도 있다
			
		}else if (dice ==2) {
			
		}else if (dice ==3) {
			
		}else if (dice ==4) {
			
		}else if (dice ==5) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(dice ==1) { // 문법적으로 다 참이라고 지정해도 마지막에 거짓이라도 실행을 시킨다고 문맥을 둔다
			
		}else if (dice ==2) {
			
		}else if (dice ==3) {
			
		}else if (dice ==4) {
			
		}else if (dice ==5) {
			
		}else if (dice ==6) {
			
		}else {
			
		}
		
		if (dice == 1) {		}
		
		if (dice == 2) {		}
		
		if (dice == 3) {		}
		
		if (dice == 4) {		}
		
		if (dice == 5) {		}
		
		if (dice == 6) {		}
		
		
		//switch문
		//변수가 어떤값을 갖는가에 따라 실행문이 선택된다 // (조건값)이 아닌 (변수)를 사용을한다
		// 같은 기능의 if문 보다 코드가 간결하다 //괄호 안의 변수값에따라 case로 가서 실행문을 실행시킨다
		// 변수값과 동일한 값을 갖는 case가 없으면 default로 가서 실행문을 실행시킨다
		// default가 필요없다면 생략이 가능하다
		// switch 는 비교하는 영역과 실행하는 영역이 같다
		
		// break문 
		// for, while, do-while, switch문의 실행을 중지할 때 사용
		// 주로 if문 과 함께사을 한다 
		
		if(dice >10) {}
		if(dice > 0 && dice <=6) {}
		
		switch( dice ) {
		case 1: // case1일때  if 문으로 비교했을때 :if(dice ==1) 형식이다 
			System.out.println("case1");
			System.out.println("case1");
			System.out.println("case1");
		case 2:
			System.out.println("case2");
		case 3:
			System.out.println("case3");
		case 4:
			System.out.println("case4");
		case 5:
			System.out.println("case5");
		case 6: 
			System.out.println("case6");
			break; // 범위 안에서만 실행 
		default : // default 는 else 에 해당한다
			System.out.println("default");			
		}
		// break; 뒤에 없어서 걸어줄 필요가 없다
		
		//-----------------------------------
		
		/*	출근시간 		일
		//   8시 		청소
		//  9시 			회의
		// 	10시 		업무
		//	11시 		외근
		*/
		
		
		int showTime = 8; //출근 
		// if(showTime <= 11) {외근}:  <-   ex) 범위를 지정할때 비교를 할것을 생각해야한다
		if( showTime <= 8) {
			// 청소
			//회의 
			//업무
			//외근
		}else if (showTime <=9) {
			//회의
			//업무
			//외근
			
		}else if (showTime <= 10) {
			//업무
			//외근
		}else if (showTime <= 11) {
		  //}else{
			//외근 
		}
			// else
		// if만 가지고도 가능하다
		if ( showTime <= 8) {
			//청소
		}if ( showTime <= 8) {
			//희의
		}if ( showTime <= 10) {
			//업무
		}if ( showTime <= 11) {
			//외근
		
			//default :
		}
		
		
		switch (showTime) {
		case 8:
			//청소
			//회의
			//업무
			//외근
		case 9:
			//회의
			//업무
			//외근
		case 10:
			//업무
			//외근
		case 11:
			//외근
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
