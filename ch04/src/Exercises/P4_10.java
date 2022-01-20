package Exercises;

import java.util.*;

public class P4_10 {

	public static void main(String[] args) {
		int input = 0; 
		int answer = (int)(Math.random()*100) + 1;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1과 100사이의 숫자를 입력하세요.>");
		do {
			count++;
			
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if (input<answer) {
				System.out.println("더 큰 수를 입력하세요.>");
			} else if (input>answer) {
				System.out.println("더 작은 수를 입력하세요.>");
			} else {
				System.out.println("정답입니다!");
				System.out.println("시도 횟수는 " + count + "번 입니다.");
				break;
			}
		} while (true);
		
	}

}
