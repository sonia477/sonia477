package Exercises;
import java.util.*;
public class P4_1 {

	public static void main(String[] args) {
		int x=15;
		System.out.println(10<x&&x<20);
		
//		char ch=' ';
//		System.out.println(!(ch==' '||ch=='\t'));
		
		char ch = 'x';
		System.out.println(ch=='x'||ch=='X');
		
		System.out.println('0'<=ch && ch<='9');
		System.out.println(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z'));
		
		int year=2021;
		System.out.println(year%400==0 || year%4==0 && year%100!=0);
		
		boolean powerOn = false;
		System.out.println(powerOn==false);
		System.out.println(!powerOn);
		
		String str="yes";
		System.out.println(str.equals("yes"));
		System.out.println("yes".equals(str));
	}

}
