import java.util.*;

public class Ex4_15 {

	public static void main(String[] args) {
		int input=0, answer=0;
		
		answer = (int)(Math.random()*100)+1;  // 1�� 100������ ������ �� ����
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if (input<answer) {
				System.out.println("�� ū ������ �ٽ� �õ��غ�����.>");
			} else if (input>answer) {
				System.out.println("�� ���� ������ �ٽ� �õ��غ�����.>");
			} 
		} while (input!=answer);
		System.out.println("�����Դϴ�.");
	}

}
