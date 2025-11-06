package refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score1 = 100;
		int score2 = 20;
		int score3 = 50;
		int score4 = 40;
		int score5 = 12;
		
		int sum =0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum /5.0;
		
		System.out.println("총점"+ sum + "평균"+avg);
		
		// 점수를!  배열을 이용해 한번에 모아보겠다~
		// 배열에 이름을 짓는건 여러개가 들어있을거라 생각해서 복수형의 이름을 짓는다 
		// 값을 초기화 ,값을 셋팅함
		
		// index를 이용한 예시
		int[] scoreArr = {100,20,50,40,12}; //  <=int[] 변수 = { 주소가 저장되있는것이다  }
// index를 사용해서 0부터시작	(  0  1  2  3  4 ) 순서	
		//index = 배열을 접근할때 사용하고 배열인덱스는 0 부터 시작을 한다
		sum = 0;
		sum = scoreArr[0]+scoreArr[1]+scoreArr[2]+scoreArr[3]+scoreArr[4];
		System.out.println("총점 "+sum +"평균" +avg);
		
		sum =sum + scoreArr[0];
		sum =sum + scoreArr[1];
		sum =sum + scoreArr[2];
		sum =sum + scoreArr[3];
		sum =sum + scoreArr[4];
		// index" 0 1 2 3 4   0부터 시작 
		
		sum = 0;
		for(int i=0; i<5; i++) { // i = 0 1 2 3 4
			sum = sum + scoreArr[i];
		}
		System.out.println("총점"+sum + " 평균"+avg);
		
		
	//	int[] pointArr; args // 단순 선언만 해둠
		int[] pointArr = null; // null 값 초기화 선언
	//	pointArr = {30,12,10,5,1}; // 배열 변수 선언하고 뒤에는 다른 실행문에서 값 목록으로 배열생성이 불가능하다
		pointArr = new int []	{30,12,10,5,1}; // 배열 변수를 미리 선언한후 값목록이 나중에 결정되는경우 
												// new 연산자 를 상용해서 값목록이 지정하여 사용이 가능하다
		pointArr = new int[5]; // 사이즈 (공간)을 명시하면서 생성을 한다
	/*	
		//int n;			//pointArr -> 참조변수 주소를 의미한다
		//n=30;				//pointArr[2] -> int 변수를 의미한다  */
		
		/*pointArr = new int[5]; 5로 지정을함 
		index는 0부터 시작하기 때문에 실행이 안됨   pointArr[5]=1; 은 사용이 불가하다 */
		pointArr[0]=30;
		pointArr[1]=12;
		pointArr[2]=10;
		pointArr[3]=5;
		pointArr[4]=1;
	//	pointArr[5]=50;   사용불가  인덱스 범위를 벗어났다	
		
		for(int i=0; i<5; i++){ // 인덱스 값을 0 1 2 3 4 으로 지정
			pointArr[i] = i+1; //  값 1 2 3 4 5
		}
		for(int i=1; i<=5; i++) {// i의 값 : 1 2 3 4 5
			pointArr[i-1] = i; // 인덱스 :0 1 2 3 4 
		}
				
		// 배열index : 0 1 2 3 4	~
		for(int i=0; i<5; i++) {
			System.out.println(pointArr[i]+ " ");			
		}
		System.out.println();
		
		System.out.println(pointArr); // 주소
		
		
		// 초기값 확인      		// 배열의 초기화
		int []intArr = new int [6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[14];
		
		//for (int i=0; i<6; i++) {
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i<doubleArr.length; i++) {
			System.out.print(doubleArr[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i<stringArr.length; i++) {
			System.out.print(stringArr[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i<booleanArr.length; i++) {
			System.out.print(booleanArr[i]+" ");
		}
		System.out.println();
		
		
	}

}
