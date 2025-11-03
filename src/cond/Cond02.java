package cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 0;
		
		boolean isHungry = true;
		if(isHungry) {
			System.out.println("햄버거 메뉴 주문 추가");
			money += 5000;			
		}else {
			System.out.println(" 젤리 하나 추가");
			money += 300;
		}
		
		
		
		boolean optoin = false;
		if(optoin == true){
			System.out.println("패티 추가로 비용 발생");
			money += 2000;
		}else {
			System.out.println("옵션 없이 진행");
		}
		
		
		boolean isDiscount = true;
		if(!isDiscount) { // 할인 x
			System.out.println("할인 없음");
		}else { //할인 o
			int coupon = 500; // 할인쿠폰 금액
			System.out.println("할인쿠폰 적용");
			money -= 500;
			money = money - coupon;
		}
		//System.out.println("적용한 쿠폰 + coupon"); 이 수식은 (지역내부에 벗어나서 적용이 안된다)
		System.out.println("최종금액 "+ money);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
