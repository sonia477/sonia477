package ch03;

public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;  // 1,000,000    1�鸸 = 10�� 6����
		int b = 2_000_000;  // 2,000,000    2�鸸 = 10�� 6����
		
//		long c = a * b;     // a * b = 2,000,000,000,000 ? �� �ƴ϶� -1454759936�� ����� ����
//		//�����÷ο� �߻� -> int�� ������ 10�� 9����
//		System.out.println(c);
		
		long c = (long)a * b;  // long c = a * (long)b;
		System.out.println(c);
	}

}
