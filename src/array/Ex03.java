package array;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] str = {"aaa", "bbb", "ccc"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("=============");
		
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("=============");
		
		
		int arr[] = {10, 54, 13, 17, 25, 30};
		
		for(int n : arr) {
			if(n%2 == 0 ) {
				System.out.println("짝수 : " + n);
			}else {
				System.out.println("홀수 : " + n);
			}
		}
		
		System.out.println("=============");
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("짝수 : " + arr[i]);
			}else {
				System.out.println("홀수 : " + arr[i]);
			}
		}
		
		System.out.println("=============");
		
		
	}
	
}
