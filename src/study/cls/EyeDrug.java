package study.cls;

public class EyeDrug {	//안약
	
	//필드  (객체가 가질 수 있는 속성, 값, 특징, 상태 담을수 있는 변수)
	String name;
	int ml;
	String expired;
	
	
	//생성자
	EyeDrug(){  //new EyeDrug()
		//생성자에서 할일 코드 작성 영역
		
		//자기가 가진 필드변수의 초기화
		name = null;
		ml = 0;
		expired = null;
	}
	
	//  (매개변수)
	//       _name="눈안약"   m=50   e="280101"
	EyeDrug(String _name, int m, String e){
		name = _name;
		ml = m;
		expired = e;
	}
	
}
