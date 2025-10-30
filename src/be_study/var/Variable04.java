package be_study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 ="12";
		int n1 = 11;
		int n2 = 22;
		System.out.println(n1 + n2 + s1 ); //  "3312"
		System.out.println(n1+ s1 + n2  ); //  "111222"
		
	
		
	String s2 = "1234";
	int n3 = 16;
	System.out.println(s2 + n3);
	// string 을 숫자 (정수/실수) 변환하는방법 (1nt/double)
	System.out.println(Integer.parseInt(s2)+n3); 
	// string (int)로 변환시켜줌 int value= Integer.parseInt 는 정수 변환
	//					Integer.parseInt("1234") 
	//						1234+16
	
	
	String s3 = "33.55";
	//int n4 =Integer.parseInt(s3); // 실수형태 문자을을 int(정수형태)로 변환이 불가능하고 double(실수형태로 해줘야한다)
	//double d4 = Double.parseDouble(s3); // String 에 주어진 숫자가 정수인지 실수인지 구분을 하고 int/double 을 선택을 한다
	//System.out.println(d4 + 12.2);
	
	//String s4 = "12a.12b";
	//Double.parseDouble(s4); // string (double)로 변환시켜줌
	
		boolean b1 =true; //boolean 은 참거짓을 나타내는 형용 (true/false)
	
		String s5 ="false"; // 문자열 false 형태
		boolean b2 = Boolean.parseBoolean(s5); // false로 변환하여 계산
		System.out.println(b2);
		
		String s10 = String.valueOf(true);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(33.567);
		
		String s13 = 123 + "";// "123"
		//            int + string = string
		
		
		
	
	
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
