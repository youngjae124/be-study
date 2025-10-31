package be_study.quiz;

public class Quiz05 {

	public static void main(String[] args) {
	
		int x =2;
		int y=3;
		int z;
		
		System.out.println("x="+x+ "y="+y);
		System.out.println(x+y);
		System.out.println(x++ + y++);
		System.out.println("x="+x +"y="+y);
		z= ++x + ++y;
		System.out.println("x="+x+"y="+y);
		z--;
		x+=--y;
		System.out.println("x="+x+"y="+y+"z="+z);
		x=10;
		z=x/y++;
		System.out.println("x="+x+"y="+y+"z="+z);
		System.out.println("x="+(x*2)+ "y="+ ++y + "z="+z);
		System.out.println("x="+x+"y="+y+"z="+z);
		
		
		int a= 1;
		int b =2;
		int c =3;
		System.out.println((a<b)&&(c>=a));
		System.out.println((a==b)||(a>=b)||(c<10) );
		boolean result = !(c==3);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int menuPrice = 30000;

		String food = menuPrice >6000 ? "선방" : "눈물";
		System.out.println(food);
		
		String food1 = menuPrice <= 6000 ? "선방 ": "눈물";
		System.out.println(food1);
		
		String food2 = menuPrice > 32000 ? "선방" : "물로배채우기";
		System.out.println(food2);
		
		String food3 = menuPrice <= 12000 ? "선방" : "눈물";
		System.out.println(food3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
