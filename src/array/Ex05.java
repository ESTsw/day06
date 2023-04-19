package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int arr[] = { 10, 54, 13, 17, 25, 30 };
		String str;

		System.out.print("짝수, 홀수 입력 : ");
		str = scan.next();

		if (str.equals("짝수") || str.equals("홀수")) {
			for (int n : arr) {
				if (str.equals("짝수") && n % 2 == 0) {
					System.out.println("짝수 : " + n);
				} else if (str.equals("홀수") && n % 2 != 0) {
					System.out.println("홀수 : " + n);
				}
			}
		}else {
			System.out.println("잘못된 입력입니다");
		}

	}
}
