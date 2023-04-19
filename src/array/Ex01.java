package array;

public class Ex01 {
	
	public static void main(String[] args) {
	
		/*
		 - 같은 자료형으로 연속된 공간을 만드는 것
		 - 자료형 배열명[] 또는 자료형 [] 배열명 
		 - index는 0부터 시작한다(index : 배열의 위치)
		 */
		
		int[] arr = new int[3];
		// int 형태의 배열, 3개의 공간
		
		arr[0] = 1111;
		arr[1] = 2222;
		arr[2] = 3333;
		
		System.out.println(arr.length); // arr.length : 배열의 길이
		System.out.println(arr);		// 해당 배열의 주소값
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[] arr02 = {111, 222, 333, 444, 555};
		// 크기를 설정하지 않고 이렇게 초기화 해서 만드는 방법도 있음
		System.out.println("arr02 length : " + arr02.length); 
		
		
		for(int i=0; i<arr02.length; i++) {
			System.out.println(arr02[i]);
		}
		
		// 위와 아래의 결과값은 같다
//		System.out.println(arr02[0]);
//		System.out.println(arr02[1]);
//		System.out.println(arr02[2]);
//		System.out.println(arr02[3]);
//		System.out.println(arr02[4]);
		
		
		
		int[] arr03 = new int[] {1,2,3,4,5};
		for(int i=0; i<arr03.length; i++) {
			System.out.println(arr03[i]);
		}
		
	}
	
	
}
