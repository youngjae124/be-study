package be_study.var;

import java.util.Scanner; 

public class Variable05 {

	public static void main(String[] args) {
		
		System.out.println("println1"); // println은 () 안에 있는 내용을 출력한다
		System.out.println("println2");
		String s1 ="text test";
		System.out.println(s1);
		
		
		System.out.print("print1");  //print 은 ()안에 내용을 출력하고 행은 안바꾼다
		System.out.print("print2\n");

		System.out.println(); // 줄바꿈
		
		System.out.println("println3");  
		
		
		
		int hour = 15;
		int minute = 2;
		// 현재 시간은 15시 2분 입니다.
		
System.out.println("현재 시간은"+ hour + "시" + minute + "분 입니다");
		

		System.out.printf("현재 시간은 %d시  %d분 입니다" , hour, minute);
		  // printf 는 ()안에 형식 문자열 &d 를 넣고 ,를 한다음 변수를 작성한다
		
		String menu = "햄버거";
		System.out.println("오늘 점심 메뉴는 "+ menu + "입니다");
		System.out.printf("오늘 점심메뉴는 %s입니다.\n",menu);
		
		double rate =3.4612;
		// 오늘 기준 이자율은 3.4612% 입니다
		System.out.println("오늘 기준 이자율은" + rate + "% 입니다");
		System.out.printf("오늘 기준 이자율은 %.2f%%입니다.\n",rate); 
		// %같은 특수 문자를 사용할경우 %%2개를 연속 사용해줘야 % 라는 결과가 나온다
	// 나타내고 싶은 소수점 자리를 표시할려면 .n(n 은 숫자임)을 표시한다
		
		
		// 입력 받기 Scanner = scanner 클래스를 이용하면 입력된 통문자열을 읽을수 있다
	 //  scanner 변수 선언     scanner 객체생성
	//	Scanner scanner = new Scanner (System.in);
	 
		//입력받기 Scanner
		Scanner scanner = new Scanner(System.in);
		
		// int 정수형   scanner.nextint()
		//double 실수형 scanner.nextDouble()
		//String 문자열 scanner. nextLine()
		
// import java.util.Scanner; 는 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역활
		
		// 콘솔 변수값 정수,실수,문자 값 출력 방법
		System.out.print("숫자를 입력하세요 :");
		int number = scanner.nextInt();
		System.out.println("당신이 입력한 숫자는 "+ number + "입니다.");
		System.out.printf("당신이 입력한숫자는 %d입니다\n",number);
		
		System.out.print("실수형 숫자를 입력하세요 :");
		double number2 = scanner.nextDouble();
		System.out.printf("당신이 입력한숫자는 %f입니다\n",number2);
		// 엔터를 쳤을경우 엔터 를 초기화 상태로 만들어줘서 콘솔 문자값 출력방법
		scanner.nextLine(); // scanner.nextLine();한번더 입력해서(이전에 남은 엔터 처리용)
		System.out.print("문자열을 입력하세요 :");
		String str = scanner.nextLine();
		System.out.println("입력한 문자열 : "+ str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
