package ch03;

public class Ex3_11 {

	public static void main(String[] args) {
//		double pi = 3.141592;
//		double shortpi = Math.round(pi*1000)/1000.0;
//		System.out.println(shortpi);  // 3.142
		
		// 3.141을 얻으려면?
//		double pi = 3.141592;
//		double pi2 = pi*1000;
//		double shortpi = (int)pi2/1000.0;
//		System.out.println(shortpi);
		
		double pi = 3.141592;
		System.out.println((int)(pi*1000)/1000.0);
	}

}
