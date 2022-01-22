import java.util.Arrays; // ctrl + shift + o => 자동으로 import문 추가

public class Ex5_2 {

	public static void main(String[] args) {
//		int[] iArr = {100, 95, 80, 70, 60};
//		// 길이가 5인 int 배열
//		for (int i=0; i<iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
//		System.out.println(iArr);
//		
//		System.out.println(Arrays.toString(iArr));
		
		
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i=0; i < iArr1.length; i++) {
//			iArr1[i] = i + 1;
//		}
//		
//		for(int i=0; i < iArr2.length; i++) {
//			iArr2[i] = (int) (Math.random()*10) + 1;
//		}
//		
//		for(int i=0; i < iArr1.length; i++) {
//			System.out.print(iArr1[i] + ", ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
		
		int sum=0;
		float average=0f;
		int[] score= {100, 88, 100, 100, 90};
		
		for (int i=0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum/(float)score.length;
		System.out.println("총점=" + sum);
		System.out.println("평균=" + average);
	}

}
