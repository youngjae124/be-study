package be_study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2진수 , 8진수 , 10진수 ,16진수
		
		int num2 = 0b10; // 1010 // 0010010 //2진수 표기 0b,OB
		int num8 = 012; // 8진수표기 12= 실제값 10 //8진수 표기 0
		int num10 = 10; // 10  // 10진수 표기  숫자로 작성
		int num16 = 0x30; // 16진수표기 30= 실제값 48  // 16진수 표기 0x,0X
		
		
		char chr1 = 'A'; //char타입 (정수타입) : 문자 1개 저장
							// 'A' 작은 따옴표로 감싸서 문자 1개
							// 'ABC' ->XXX
		char chr2 = 86;
		char chr3 = 0x023;    // 291
		
		char chr4 = 'F';
		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		
		char chr5 = '안';     //char 은 문자 1개만 작성 가능 
		// char chr6 = '안녕' 
				
		// 문자열 타입 " " 큰 따옴표로 감싼 여러문자  String 은 가능
		String s1 = "안";
		String s2 = "녕"	;
		String s3 = "안녕하세요";
		String s4 = "1234";  //String s 는 연산이불가하고 뒤에 가져다 붙여버린다
		
		System.out.println(s3);
		System.out.println(s4);
		
		int n =1234; // 정수형 
		
		System.out.println(n + 10);
			//1234 + 10 = 1244
		System.out.println(s4 + 10);
			// 1234 + 10 = "123410"
		
		System.out.println("지금은" + 16 + "시 입니다.");
		System.out.println("지금은 16시 입니다.");
		
		String msg = "\"안녕\"하세요";
		System.out.println(msg); // 안녕하세요 \"안녕"하세요
		
		System.out.println("어서\t오세요~ \n반갑습니다.");
		
		double d1 = 12.123; // double 은 int 과 다르게 소수점 을 사용할수있다
		double d2 = 5000.0;
		double d3 = 5e2; // 5* 10^2
		double d4 = 0.0012;
		double d5 = 0.12E-2; // 0.12 * 1/10^2
				
		float f1 =23.45f; // float 타입은 값뒤에 f 를 표기해야한다
		
		
		// 논리 타입 은 참거짓에 해당되는 true 와 false 만 나눈다
		boolean open = true;
		boolean close = false;
		boolean stop = false;
		
		boolean isOpened =true;
		boolean isClosed = false;  // is,has 를 가지고 있으면 boolean 타입이다
		boolean hasoption = false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}