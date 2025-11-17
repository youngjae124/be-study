package cls.cls07.pack1;

public class Point {

	//점수관리
	
	int math; //수학
	public int eng; // 영어
	private int lang; //국어

	//private Point(){}  private 외부접근 차단
	public Point(){}
	
	
  public Point(int math, int eng, int lang){
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}
	
	
	void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}
	private void method3() {
		System.out.println("method3");
	}
	
//	void Setter() {
//		
//	}
	// Setter 는 저장용 
	// SetXXX
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		//메소드는 로직 코드 등 작성이 가능하다
		//0~100이 아닌 잘못된 숫자를 입력하면
		//점수입력 실수로 0점 처리한다는 로직을 생성 
		if(eng > 0 && eng <= 100) {
			this.eng =eng;
		}else {
			this.eng = 0;
		}
		
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getMath() {
		return this.math;
	}
	public int getEng() {
		return this.eng;
	}
	public int getLang() {
	//	return this.lang;
		//return this.lang;
		//1000점 만점으로 환산해서 반환
		//0~100 > *10
		return this.lang *10;
	}
	
	
	
	
	}


