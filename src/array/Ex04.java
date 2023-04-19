package array;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		/*
		 * 문자열 비교
		 */

		Scanner scan = new Scanner(System.in);
		String s1, s2;

		System.out.print("문자열 입력 : ");
		s1 = scan.next();

		System.out.print("문자열 입력 : ");
		s2 = scan.next();
		
		
		
//		if(s1 == s2) {
//			System.out.println("두 문자열은 같다");
//		}else {
//			System.out.println("두 문자열은 다르다");
//		}
		// 문자열은 '=='로 비교할 수 없다
		

		if (s1.equals(s2)) {
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}

	}

}
