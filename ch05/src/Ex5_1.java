
public class Ex5_1 {

	public static void main(String[] args) {
//		int[] score; // 배열 score를 선언(참조변수)
//		score = new int[5]; // 배열의 생성(int저장공간x5)
		
		int[] score = new int[5]; // 배열의 선언과 생성을 동시에
		score[3] = 100;
		
		System.out.println("score[3]= " + score[3]);
	}

}
