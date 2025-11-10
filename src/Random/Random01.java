package Random;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		// 난수 (랜덤값) 뽑기 사용   // Math.random()
		//	 Math.random()=	랜덤값을 나타낸다 0보다 작거나 같고 1보다 작다
		// (int)(Math.random()* 갯수(범위))+시작 숫자
		// (int)(Math.random()*10) +1
		
		
     /*
       랜덤값 0~1		랜덤값에서 *10 (int)  시작하고싶은숫자 +1
       0.0123	0.123				0		1
       0.1234	1.234				1		2
       0.15444	1.5444				1		1
       0.5789	5.789				5		6
      */
		
		
		
		for(int i=1; i<10; i++)
		System.out.println(Math.random());
		
		for(int i=1; i<10; i++)	//1~10
			System.out.println((int)(Math.random()*10)+1);
		
		for(int i=1; i<10; i++)	//1~50
			System.out.println((int)(Math.random()*50)+1);
		
		for(int i=1; i<10; i++)	// 101~200
			System.out.println((int)(Math.random()*100)+101);
		
		for(int i=1; i<10; i++)	// 30~50
			System.out.println((int)(Math.random()*21)+30);
			
		Random random = new Random();
		
		for(int i=1; i<=10; i++)//0~9
			System.out.println(random.nextInt(10)); //0<v < 10
		
		for(int i=1; i<=10; i++)//0~10
			System.out.println(random.nextInt(10)+1); 
		
		for(int i=1; i<=10; i++)//10~15
			System.out.println(random.nextInt(6)+10 ); 
		
		for(int i=1; i<=10; i++)//10~15
			System.out.println(random.nextInt(10,16)); 
		

	}

}
