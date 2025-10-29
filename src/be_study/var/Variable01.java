package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 선언
		
		//타입 변수명
		//int 타입: 정수형 숫자 타입
		
		int aaa;	//변수 선언
		int sss;	//정수형 숫자 타입의 변수
		
		int point; //선언
		int score;
		
		score = 90; // score라는 변수에 90이라는 값을 저장
		// 변수명은 영문 단어로 의미있게 저장하는것이 좋다 
		
		
	//	int x;  
	//	int y;
	//	int z;
		
		int x,y,z; //변수 이름을 중복적으로 사용할수 없다
		
		
		// level = 99;// 선언하지 않은 변수
int level; //선언한 라인보다 아래에 있으면 변수 선언이 안된다 항상 int 로 지정한후 변수 를 선언한다
	level = 99;
	int math = 99; // 선언과 동시에 저장 = 초기화 (변수의 최초의 값을 세팅하는것)
	
	
	int time; //변수 선언	
	time = 12; // 12값 저장
	time = 13; // 13값 저장
	
	int myTime = 10 + 5 - 2; // 연산 이 가능하다
	
	myTime = time + 5;  // 저장한 변수를 가져다가 사용할수있다
	
	myTime = time +4 + time -1 + time; // 변수는 중복 사용 가능하다
	// 마지막 라인 수 의 존재하는 값의 수 에 따라 계산을 한다 
	
	int value= 20; // value 변수 선언만  // value + 변수값 선언 + 초기화 (값 저장)
	
	int result = value +5; // 변수 선언만 했을 경우 사용할수가 없다, 초기화되지 않은 수는 연산불가
	 //값이 있는 변수는 연산가능
	
	//출력
	
	System.out.println("문자들 넣으면 출력");
	System.out.println(12345);
	System.out.println(value);
	System.out.println(result);
	//System.out.println(level); // 초기화되지 않은 변수...
	
	System.out.println( result + 50 );
	result = 75;
	
	System.out.println( result + value + result +value);
	
	int totalscore = score + score + 50;
	System.out.println(totalscore); // 230
	
	System.out.println(totalscore + 30); // 260
	System.out.println(totalscore ); // 230
	
	totalscore = totalscore + 70;
	System.out.println(totalscore); // 300
	
	
	int a = 10;
	int b = 20;
	
	// a:10 b:20
	System.out.println(a);
	System.out.println(b);
	
	//값 바꾸는 법 // 값을 저장을 해줄 int 변수 를 하나더 추가를 시켜 바꿔준다
	
	int c = a; // a=10 b=20 c=10
	 a = b; //a = 20 b = 20 c = 10   
	 b = c; // a = 20 b = 10 c = 10
	//a:20 b:10
	System.out.println(a); // 20 ?
	System.out.println(b); // 10 ?
	
	
	
	
	
	
	
	
	}

}
