package cls.cls07.pack1;
//
import cls.cls07.pack2.Cup;
public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cup c1 = new Cup();
		cls.cls07.pack1.Cup c2 = new cls.cls07.pack1.Cup();
		cls.cls07.pack1.Cup c3 = new cls.cls07.pack1.Cup();
		cls.cls07.pack1.Cup c4 = new cls.cls07.pack1.Cup();
		
		
		
		// 클래스 명의 풀네임은 패키지 포함
	java.util.Scanner scanner = new java.util. Scanner(System.in);
		
	Cup c5 = new Cup();
	
	cls.cls07.pack2.Cup c6 = new cls.cls07.pack2.Cup();
	
	c5.method();
	c6.method();
	
	c6.type = "플라스틱"; // public을 을 사용하여 접근을 한다
	}

}
