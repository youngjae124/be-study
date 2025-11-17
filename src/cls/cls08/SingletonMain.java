package cls.cls08;

public class SingletonMain {

	public static void main(String[] args) {
	// 외부에서 생성불가
//		singleton s1 =new Singleton();
//		singleton s2 =new Singleton();
//		singleton s3 =new Singleton();
	
	//Singleton s3= new Singleton(); // 생성을 못하는데
	//s3.singleton // 어떻게 생성한 인스턴스 객체를 통해서 필드변수에 접근을 하느냐
//	Singleton.singleton =new Singleton();// 외부에 직접못만듬	
//	Singleton.singleton = null; // 기존에 있던 1개만 존재하는 객체를 삭제
	
//	Singleton.getInstance();
//	Singleton.getInstance();
	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();
	Singleton s3 = Singleton.getInstance();
	}

}
