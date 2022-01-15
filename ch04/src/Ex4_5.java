import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'F', opt = '0';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d점 입니다.%n", score);
		
		if (score>=90) {
			grade = 'A';
			if (score>=97) {
				opt = '+';
			} else if (score<=93) {
				opt = '-';
			}
		} else if (score>=80) {
			grade = 'B';
			if (score>=87) {
				opt = '+';
			} else if (score<=83) {
				opt = '-';
			}
		} else if (score>=70) {
			grade = 'C';
			if (score>=77) {
				opt = '+';
			} else if (score<=73) {
				opt = '-';
			}
		} else if (score>=60) {
			grade = 'D';
			}
		
		System.out.println("당신의 학점은 " + grade + opt + "입니다.");
	}

}
