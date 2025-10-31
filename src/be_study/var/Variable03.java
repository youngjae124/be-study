package be_study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본타입 허용범위 순
		// byte < short,char < int < float < double 순서이다 
		
		int i1 = 30;
		int i2 = i1;
		//int i3 = 3.11;  int는 정수형 변수이고 3.11은 실수형 값이여서 실행할수가없다
						// 실행을 하고싶으면 실수형 변수인 double 을 사용해야한다
		double d1 = 3.11;
		double d2 = d1;
		
		double d3 = 40; // 정수값을 실수형 변수에 담을려고 하면 자동타입 변환을 한다 
			// ex 40 -> 40.0으로 실수형 값으로 인식  int: 40 -> double:40.0
		System.out.println(d3);
		
		double d5 = i1; //  int i1에서 double d5로 자동변환이 되는것이다 
						// double 이 더 큰 타입이므로 int 를 담을수가 있다
            // 작은 타입이 큰타입으로 대입되는건 문제가없다 이걸 자동타입 변환이라고 한다	
		
		
	 char c1 = 'A';
	 int i3 = c1;  //char 타입이 int 타입으로 변환되면 유니코드값이 int타입에 변환된다
	 			// 'A' -> 65로 변환 되며 저장이된다
	 System.out.println(c1);
	 System.out.println(i3);
	 
	 // 강제 타입 변환은 큰 허용범위 타입을 작은 허용범위 타입을 강제적으로 바꾸는 것 
	 // 강제 타입 변환 의 캐스팅 연산자는 ()을 사용한다
	 //  ()에 들어가는 타입은 작은 허용범위 타입을 작성한다
	 
	  char c2 = (char) i3; // (char)65
	  System.out.println(c2); // A 
	  
	  double dd1 =12.34;  //double을 int 로 변환을 하면 큰 범위를 작은범위로 바꾸는것이라 강제타입변환을 한다
	  			// double(실수값)을 int(정수값)으로 변환하면 실수값 소수점을 버리고 앞에 정수값만 사용한다 
	  int ii1 = (int)dd1;// 강제타입변환 12.34 -> 12
	  System.out.println(ii1);
	  
	  //java 정수 =int 
	  //java 실수 = double
	  //float f1 =(float)4.45;
	  float f1 =4.45f;
	  double dd2 =12.45;   // float < double 자동타입변환 
	  
	  int i10 = 3;
	  double d10 = 5;
	  
	 // int i11 = i10 + d10; //int+ double은 double 로 인식을 한다
	            // 3  +  5  = 8이아니고 ->8.0으로 결과값이 나온다
	  double d11 = i10+ d10; //이렇게 double에 결과값을 저장해야 결과값이 나온다
	  
	  int i12 = 10;
	  double d12 = 5.5;
	  
	  //int i13 = i12 + d12;   // int +double -> double
	     //        10 +  5.5 = 15.5 = double(실수값)
	  //  int(정수타입)를 double(실수타입) 로 강제타입 변환을 해주는 법
	  
	  int i13 = (int)(i12 +d12);
	 // i13 = i12 + (int)d12;
	  //    int + (int)double ->double 형식으로 강제타입변형을 해준다.
	  
	 double dv1 = 5.5;
	 double dv2 = 6.6;
	 // result 는 두 정수중에 큰수를 반환을 한다 
	 int result = (int)dv1 + (int)dv2;  //각 각 정수타입으로 변환 해주어서 소수점을 버리고 정수로 계산
	 			//     5   +      6 = 11
	 System.out.println(result); // 11 
	 	result = (int)(dv1 + dv2);  //(double+double)을 계산을 해주고 int(정수)변환을 해준 결과값 항상 
	 									//()안에있는 수식부터 우선처리한다
	 	       //      5.5 + 6.6 = 12.1
	  System.out.println(result); // 12
	  
	  
	  int x = 1;
		int y = 2;
		double result2 = x+y; // int / int -> int  ( / ) 나누기 연산 
		//				1/2 ->0.5 =0 
// 0으로 나오는 이유는  자바에서 정수 연산결과는 항상 정수로 나오기 때문에 0.5가 아닌 0.0으로 나온다
					//double result =0.0
		
		//         x/y
		//         1/2  int타입/int타입 -> int타입   정수/정수 -> 정수
		//										  1/2 -> 0
		//         0.5
		
		//       int타입/double타입 -> double타입
		//       double타입/int타입 -> double타입 실수형
		//        1.0 / 2  -> 0.5 
		
	 	result2 = (double)x / y;
	 	result2 = x / (double)y;
	 	result2 = (double)x / (double)y;
	 	
	 	result2 = 1/2;
	 	result2 =(double)1/2;
	 	result2 = 1/2.0;
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
