package ch03;

public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;  // 1,000,000    1백만 = 10의 6제곱
		int b = 2_000_000;  // 2,000,000    2백만 = 10의 6제곱
		
//		long c = a * b;     // a * b = 2,000,000,000,000 ? 이 아니라 -1454759936이 결과로 나옴
//		//오버플로우 발생 -> int의 범위는 10의 9제곱
//		System.out.println(c);
		
		long c = (long)a * b;  // long c = a * (long)b;
		System.out.println(c);
	}

}
