import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'F', opt = '0';
		
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("����� ������ %d�� �Դϴ�.%n", score);
		
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
		
		System.out.println("����� ������ " + grade + opt + "�Դϴ�.");
	}

}
