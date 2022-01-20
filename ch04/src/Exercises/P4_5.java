package Exercises;

public class P4_5 {

	public static void main(String[] args) {
		
//		for (int i = 0; i<= 10; i++) {
//			for (int j = 0; j<=i; j++) {
//				 System.out.println("*");
//			}
//		System.out.println();
		
// 다음의 for문을 while문으로 변경하시오.
		
		int i=0;
		while (i<=10) {
			int j=0;
			while (j<=i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
