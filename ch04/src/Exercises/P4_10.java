package Exercises;

import java.util.*;

public class P4_10 {

	public static void main(String[] args) {
		int input = 0; 
		int answer = (int)(Math.random()*100) + 1;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1�� 100������ ���ڸ� �Է��ϼ���.>");
		do {
			count++;
			
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if (input<answer) {
				System.out.println("�� ū ���� �Է��ϼ���.>");
			} else if (input>answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.>");
			} else {
				System.out.println("�����Դϴ�!");
				System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�.");
				break;
			}
		} while (true);
		
	}

}
