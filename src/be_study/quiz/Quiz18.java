package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
	//1)	
		int [][]arr1 = new int [4][4];
		int n =1 ;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				
			arr1[i][j] = n++;
			}
			
		}		
		for (int i=0; i<4; i++ ) {
			for(int j=0; j<4; j++) {
				System.out.print(arr1[i][j]+" ");				
			}
			System.out.println();
		}
		
		//2)
		
		int [][]arr2 = new int [4][4];
		int a=1;
		
		for(int x=0; x<4; x++) {
			for(int y=0; y<4; y++) {
				arr2[y][x] = a++;
			}
		}
		for(int x=0; x<4; x++) {
			for(int y = 0; y<4; y++) {
				System.out.print(arr2[x][y]+" ");
			}
			System.out.println();
		}				*/
			//-----------------------------------------------------------
	//3)
		/*
		int[][] arr3 = new int [4][4];
		int b=16;
		
		for(int num =0; num<4; num++) {
			for(int sus =0; sus<4; sus++) {
				arr3[num][sus] = b--;
			}
		}
		
		
		for(int num = 0; num<4 ; num++) {
			for(int sus=0; sus<4 ; sus++) {
				System.out.print(arr3[num][sus]+" ");
			}
			System.out.println();
		}				*/
		//------------------------------------------

		int[][]arr4 =new int[4][4];
		int c =16;
		
		for(int r=0; r<4; r++) {
			
			for(int n=0; n<4; n++) {
				arr4[n][r] = c--;
			}
		}
		for(int r=0; r<4; r++) {
			for(int n=0; n<4; n++) {
				System.out.print(arr4[r][n]+ " ");
			}
			System.out.println();
		}
		
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
