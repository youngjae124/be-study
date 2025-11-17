package study.cls;

public class ClsBasic {
/*
	클래스
	
	속성 / 동작(기능)
	
	자바 코드화 ~ 표현
	
	
	클래스 구성요소
	- 필드	(속성)
	- 생성자	(생성시 초기화 할일)
	- 메소드	(기능, 동작)
 */
	public static void main(String[] args) {
		int n = 10;
		int[] narr = new int[5];
		narr[3] = 40;
		
		
		EyeDrug ed = new EyeDrug();
		System.out.println(ed.name);
		System.out.println(ed.ml);
		System.out.println(ed.expired);
		
		EyeDrug ed2 = new EyeDrug(); //인스턴스 객체가 생성됨
		ed2.name = "아이드롭";
		ed2.ml = 14;
		ed2.expired = "270717";
		System.out.println(ed2.name);
		System.out.println(ed2.ml);
		System.out.println(ed2.expired);
		
		
		EyeDrug ed3 = new EyeDrug("눈안약", 50, "280101");
		System.out.println(ed3.name);
		System.out.println(ed3.ml);
		System.out.println(ed3.expired);
		
		EyeDrug ed4 = new EyeDrug("눈안약222", 250, "22280101");
		System.out.println(ed4.name);
		System.out.println(ed4.ml);
		System.out.println(ed4.expired);
		
	}
}
