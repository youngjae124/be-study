package cls.cls09;

public class Cls09Main {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		int n3 = 30;

		int[] nArr = { 10, 20, 30 };
		int[] nArr1 = { n1, n2, n3 };
		int[] nArr2 = new int[5];
		nArr2[3] = 100;

		for (int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i] + " ");
		}
		System.out.println();

		for (int n : nArr2) {
			System.out.print(n + " ");
		}
		System.out.println();

		System.out.println(methodA(n2));

		methodB(nArr);
		methodB(nArr2);

//		methodC(nArr);
		int[] cArr = methodC(null); // int [] arr = null; 을 넣을수 있다
		// methodC(300); // int[]arr =300 은 넣을수가 없다
		methodB(cArr);

		System.out.println("--------------------");
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		Temp t3 = new Temp();

		Temp[] tArr = { new Temp(), new Temp(), new Temp() }; // 생성자를 부르면서 객체를 만든것
		Temp[] tArr1 = { t1, t2, t3 };
		Temp[] tArr2 = new Temp[5]; // 참조변수 타입 공간만 만들어둔것 생성자를 만든것은 아님 배열공간 선언 5개짜리 new temp[5]
		tArr2[3] = new Temp(); // 객체생성 new temp() ()

		for (int i = 0; i < tArr.length; i++) {
			System.out.print(tArr[i].num);
			tArr[i].method();
		}

		System.out.println();

		for (Temp t : tArr1) {
			System.out.println(t.num);
			t.method();
		}
		System.out.println();

	}

	public static int methodA(int n) {
		return n + 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void methodB(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] methodC(int[] arr) {

		int[] ar = { 5, 4, 3, 2, 1 };

		return ar; // return 인트배열;

	}

	public static void methodD(Temp t) {

	}

	public static void methodE(Temp[] arr) {
		for (Temp t : arr) {
			System.out.println(t.num);
		}

	}
}
