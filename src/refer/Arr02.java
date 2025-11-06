package refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int  변수
		//int[]  1차원 배열
		// int [][] 2차원배열 
		// int [][][] 3차원배열
		
		
		int n =10; 
		int[] nArr = new int [5]; //  배열
		
		int [][] nArr2 = new int [3][5]; // 2차원 배열
		
		
		/* 0   123    4
		0   ㅁㅁㅁㅁㅁ
		1   ㅁㅁㅁㅁㅁ 
		2   ㅁㅁㅁㅁㅁ
		 				*/
		int[][]nArr3 =new int[4][3];
		/* 01 2
		 0 ㅁㅁㅁ
		 1 ㅁㅁㅁ
		 2 ㅁㅁㅁ 		nArr3[3][0]
		 3 ㅁㅁㅁ			nArr3[1][2]		  
		 */
		
		
		int[] nArray1= {1,2,3,4,5,6};
		int[][] nArray2= { {1,2,3},{4,5,6} };    // 2행 3열
		// ㅁㅁㅁ 123
		// ㅁㅁㅁ 456
		
		int[][] nArray3= { {1,2},{3,4},{5,6} };    // 3 행 2열
		// ㅁㅁ   1 2
		// ㅁㅁ   3 4
		// ㅁㅁ   5 6
		System.out.println(nArray2[0][2]);
		
		int [][]nArray4 = new int[2][3];
		// 2행 3열 nArray2 출력
		// nArray2 [2][3]				
		//for(int i=0; i<2; i++) {
		for(int i=0; i<nArray2.length; i++)	{
			for(int j=0; j<nArray2[i].length; j++) {
			//for(int j=0; j<3; j++) {
				System.out.print(nArray2[i][j]+" ");
			} //						 0	0 		// i:000111
				//						 0	1		// j:012012
			//							 0  2     // nArray2[0][0] nArray2[0][1] nArray2[0][2]
			//							 1  0	  // nArray2[1][0] nArray2[1][1] nArray2[1][2]	
			//							 1	1
				//						 1	2	
			System.out.println();
		}
		
		
		
		
	}

}
