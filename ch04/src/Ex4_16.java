
public class Ex4_16 {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		
		while(true) { // 무한 반복문 (for(;;) {})
			// while문에서는 (true)가 생략 불가
			if (sum>100) {
				break;
			}
			sum += ++i;
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
