package Exercises;

public class P4_3 {

	public static void main(String[] args) {
		int sum = 0, totalSum = 0;
		
		// 1+(1+2)+(1+2+3)+...+(1+2+3+4+...+9+10)
		
		for (int i=1; i<=10; i++) {
				sum += i;
				totalSum += sum;
		}
		System.out.println("totalSum = " + totalSum);
	}

}
