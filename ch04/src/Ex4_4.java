import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("������ �Է��ϼ���.>");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		if (score>=90) {
//			grade = 'A';
//		} else if (score>=80) {
//			grade = 'B';
//		} else if (score>=70) {
//			grade = 'C';
//		} else if (score>=60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
//		System.out.println("����� ������ " + grade + "�Դϴ�.");
		
		int score = 0;
		char grade = 'F'; 
		
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score>=90) {
			grade = 'A';
		} else if (score>=80) {
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		} else if (score>=60) {
			grade = 'D';
		} 
		System.out.println("����� ������ " + grade + "�Դϴ�.");

	}

}
