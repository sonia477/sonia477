
public class Ex4_7 {

	public static void main(String[] args) {
//		int num = 0;
//		
//		for (int i = 1; i <= 5; i++) {
//			num = (int) (Math.random()*6) + 1;
//			System.out.println(num);
			
		// Quiz. 1 부터 10 사이의 난수를 20개 출력하시오.
		int num = 0;
		for (int i = 1 ; i <= 20; i++) {
			num = (int) (Math.random()*10)+1;
			System.out.printf("%d ", num);
		}
		
		System.out.printf("%n");
		
		// Quiz2. -5 부터 5 사이의 난수 20개를 출력하시오.
		int num2 = 0;
		for (int i = 1; i <= 20; i++) {
			num2 = (int) (Math.random()*11)-5;
			System.out.printf("%d ", num2);
		}
	}

}
