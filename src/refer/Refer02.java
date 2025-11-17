package refer;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int likePoint = 50;
		String likeLevel = "매우 좋음";
		String likeLevel2 = "많이 좋음";
		
		if(likeLevel2.equals(likeLevel)) {
			System.out.println("아주 좋다 긍정적이다 ");
		}
		LikeIndex li1 = LikeIndex.VERYGOOD;
		LikeIndex li2 = LikeIndex.NORMAL;
		
		if(li2 == LikeIndex.VERYBAD) {
			System.out.println("매우나쁨이네");
		}else {
			System.out.println("매우나쁨은 아니네");
		}
	}

}
