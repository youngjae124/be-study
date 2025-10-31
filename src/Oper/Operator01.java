package Oper;

public class Operator01 {

	public static void main(String[] args) {
		
		
		// 산술 (+-*/%)
		
		System.out.println(1+1);
		System.out.println(10-5);
		System.out.println(5*9);
		System.out.println(30/7);
		System.out.println( (double) 30/7 );
		System.out.println(30/7.0);
		System.out.println( 9%5);
		System.out.println(28%9);
		
		
		//부호 ( + -)
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		System.out.println(-(-10) );
		
		
		// 증감 ++ --  1증가 1감소
		
		// ++변수 증가먼저 진행
		// 변수++ 증가 나중에 진행
		
		
		
		System.out.println("===============");
		
		int x = 10;
		System.out.println(x);
		System.out.println(++x);   // 1씩증가
		System.out.println(x);    // 원본 변수에 영향을 준다
		
		System.out.println(1+x); // 직접적으로 +1을 추가하면 원본에 영향은 안주고 일시적인 값으로 나옴 
		System.out.println(x);
		
		System.out.println(x++);
		System.out.println(x);
		
		
		int y =8;
		System.out.println(y--); // y-- 는 8 원본은 유지한상태이고 변수감소를 나중에 실행
		System.out.println(--y); // 6  첫줄에서 변수감소를 나중에 진행을 해서 --y 는 --이 2번 실행된거라 6
		System.out.println(y); // 변수감소 결과값이 총 y는 6이 된다
		
		int z =30;
		System.out.println(z+1); // 31 직접적으로 +1 을 한것이라 결과값은 31로 나온다
		System.out.println(z++); // 30 첫줄에 직접적인 연산이라 원본의 영향을 안미추고 결과값 30이 나오고 뒤에 ++는 다음줄에 나온다
		System.out.println(z);  // 31 이전 연산에서 z++가 나중에 연산이 되니까 최종값은 31이 된다 
		
		z++;
		++z;
		z=z+1;
		
		int q =1; //  int e 수식에 ++q 가 먼저 계산되서 q=2가되고
		int w =3; //  w-- 은 나중으로 미뤄으니 결과값은 2가 된다
		int e =10 + ++q;  // q+e 는 12 
		int r = 3 + w--;  // w--는 연산을 나중에 진행하므로 w=3으로 계산해서 r=3+w=3은 6이된다
		
		System.out.printf("%d %d %d %d\n",q,w,e,r); // %d는 뒤에 정수 타입을 둬서 정수값을 구하겠다라는 말을하는 수식어
		
		
		// 논리 부정! true false
		
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
		
		isHungry = false;
		isHungry = !isHungry;
		
		// 문자열 결합 연산다     +를 쓴다
		// +연산자의 피연산자 중 한 쪽이 문자열인 경우
		System.out.println(133+3.345 + "문자");
		
		//비교 연산자 피연산자의 대소 비교하여 true/false 산출 하는것 : 조건문이나 반복문에서 실횅 흐름제어를 한다
		// 동등비교 연산자는 모든 타입에 사용가능하다
		// 크기비교 연산자는 boolean 외 모든 기본 타입에 사용가능하다
		
		System.out.println(1==2); //false
		System.out.println(1 != 2);// true
		System.out.println(3<5); //true
		System.out.println(10>=9); // true
		System.out.println(4>4);	// false
		System.out.println(9<=1); // false
		
		boolean b1 = ( 9 > 8 ); // 크기비교하는 연산이여서 boolean 타입으로 결과가 나와야한다
		
		
	// 논리 연산자 는 boolean 타입만 사용이 가능하다 
	// AND(논리곱) 는 피연산자 모두가 true일 경우에만 연산결과가 true가 나온다 연산식: &&,&
	// OR(논리합) 피연산자중 하나만 true이면 연산결과는 true이다 연산식: ||,|
	// XOR(배타적 논리합) 피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산결과가 true로 나온다, 연산식 :^
	// NOT(논리 부정) 피연산자의 논리값을 바꾼다  연산식: !
		
		boolean b2 = (10 > 6 ) && (10 > 5); // true
			//			true  &&   true
		System.out.println(b2);
		
		boolean b3 = ( 5 != 1) || (10 < 4); //
		// 				ture   ||    false    true  ||는  2개의 값중에 하나라도 true가 있으면 true이다
		System.out.println(b3);
		
		boolean b4 = (2 >=1 ) && ! (3<4); // 
		//				true  &&    false    flase  &&이 나오는건 2개의 값이 다 true 일때만 나온다
		System.out.println(b4);
		
		
		//대입 연산자 : 오른쪽 연산자의 값을 왼쪽 연산자인 변수에 저장하는것
		int a = 30;
		a = 50;
		
		a+=30; // 이걸 풀이하면  a = a + 30
		a-=10; // a= a - 10 이 된다
		a*=3;  // a= a * 3
		a/=2; // a= a / 2
		a %=4; // a= a % 4 
		
		// 삼항 연산자 (조건) : 3개의 피연산자를 필요로 하는 연산자
		// ? 앞의 조건식에 따라 콜론 앞뒤의 피연산자 선택한다
		// 삼항 연산자는:  조건식 ? 앞 : 뒤 로 나타낸다
		//                   참   거짓
		int point = 300; // 포인트
		
		String eventItem = point > 200 ? "커피" : "생수";
		System.out.println(eventItem);
		
		eventItem = point <= 200 ? "생수 " : "커피";
		System.out.println(eventItem);
		
		// point>200 = point <=200 이고 
		// point<200 = point >= 200 이다
		
		System.out.println(point > 50 ? "단골" : "신규");
		
		
		/*
		 (조건식) ? 참 : 거짓
		 
		 (조건식) ? 참 : ( (조건식) ? 참 : 거짓 )
		 */
	// 예시 )
	// 삼항연산자 조건식으로 올렸을때 
	System.out.println( point <= 200 ? "생수":(point > 300 ? "맥주" : "커피") );
		
		// 0~200 :생수
		// 201~300: 커피
		// 301 ~: 맥주
		
	int num = -30;
	System.out.println( num < 0 ? "음수 " :  "양수");
	
	// 음수 0 양수
	
	System.out.println( num == 0 ? "0" : (num> 0 ? "음수" : "양수"));
	System.out.println(num != 0 ? (num < 0 ? "음수":"양수") : "0");
		
	System.out.println( num > 0 ? "양수" : (num < 0 ? "음수" : "0") );
	System.out.println(num >= 0 ? (num == 0 ? "0" : "양수") : "음수");
		
		
		
		
		

	}

}
