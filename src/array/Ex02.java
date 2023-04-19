package array;

public class Ex02 {

	public static void main(String[] args) {

		int[] arr = { 111, 222, 333 };
		// int 형태의 배열 생성

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(); // 위와 아래의 출력값 일치(차이가 없는건 아님)

		// ':'을 기준으로 오른쪽에는 여러개의 값을 갖고있는 변수
		// ':'을 기준으로 왼쪽에는 사용할 '변수형 변수명'
		// 오른쪽값을 왼쪽값에 순차적으로 대입하여 종속문장을 실행한다
		for (int array : arr) {
			System.out.println(array);
		}

		System.out.println();

		// 연산을 해야할때는 기존 for문을 사용하는게 더 편하다
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 100;
			System.out.println(arr[i]);
		}

		System.out.println();

		int index = 0;
		for (int array : arr) {
//			arr = array - 100; 이렇게 쓰는게 불가능
			arr[index] = array - 100;
			System.out.println(arr[index]);
			index++;
		}

	}

}
