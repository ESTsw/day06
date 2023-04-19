package array;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		String s = null;
		s = "aaaa";
//		System.out.println(s.equals("aa"));
		// NullPointerException
		// null 값을 .을 통해 비교를 하면 오류 발생

		Scanner scan = new Scanner(System.in);
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputId = null, inputPwd = null;
		String searchId = null, deleteId = null, editId = null, changePwd = null;

		boolean bool;
		int index = 0;
		int count = 0;
		while (true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 특정회원 보기");
			System.out.println("4. 특정회원 비밀번호 수정");
			System.out.println("5. 특정회원 삭제");
			System.out.println("6. 모든 회원 보기");
			System.out.println("7. 나가기");
			System.out.print(">>>");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("=====로그인=====");
				System.out.print("아이디 입력 : ");
				inputId = scan.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = scan.next();
				bool = true;
//				for(int i=0; i<id.length; i++) {
//					if(inputId.equals(i)) {
//						if(inputPwd.equals(pwd[i])) {
//							System.out.println("인증 통과");
//						}else {
//							System.out.println("비밀번호 불일치");
//						}
//						bool = false;
//						break;
//					}
//				}
//				
//				if(bool) {
//					System.out.println("존재하지 않는 아이디 입니다");
//					System.out.println("회원가입 부터하세요");
//				}

				for (index = 0; index < id.length; index++) {
					if (inputId.equals(id[index])) {
						if (inputPwd.equals(pwd[index])) {
							System.out.println("인증 통과");
						} else {
							System.out.println("비밀번호 불일치");
						}
//						bool = false;
						break;
					}
				}

				if (index == id.length) {
					System.out.println("존재하지 않는 아이디 입니다");
					System.out.println("회원가입 부터하세요");
				}
				break;

			// index 와 bool의 방법으로 할 수 있음
			// 반복문을 다 돌고 빠져나옴 .. >> index가 5(id.length)가 되면 빠져나옴
			case 2:
				System.out.println("=====회원가입=====");
				System.out.print("아이디 입력 : ");
				inputId = scan.next();
				System.out.print("비밀번호 입력 : ");
				inputPwd = scan.next();

//				for(index=0; index<id.length; index++) {
//					if(inputId.equals(id[index])) {
//						System.out.println("중복된 아이디 입니다");
//						break;
//					}
//					if (id[index] == null) {
//						id[index] = inputId;
//						pwd[index] = inputPwd;
//						System.out.println("가입 완료");
//						break;
//					}
//				}
//				if(index == id.length) {
//					System.out.println("저장공간이 부족합니다");
//				}

				if (count < id.length) {
					for (index = 0; index < count; index++) {
						// count >> 회원 가입된 숫자만 확인
						if (inputId.equals(id[index])) {
							System.out.println("중복된 아이디 입니다");
							break;
						}
					}
					if (index == count) {
						pwd[count] = inputPwd;
						id[count] = inputId;
						count++;
					}
				} else {
					System.out.println("저장공간이 부족합니다");
				}
				break;

			case 3:

				System.out.println("=====회원정보확인=====");
				System.out.print("확인할 아이디를 입력하세요 : ");
				searchId = scan.next();

				for (index = 0; index < count; index++) {
					if (searchId.equals(id[index])) {
						System.out.println("아이디 : " + id[index]);
						System.out.println("비밀번호 : " + pwd[index]);
						break;
					}
				}

				if (index == count) {
					System.out.println("존재하지 않는 회원입니다");
				}
				break;

			case 4:
				System.out.println("=====회원정보수정=====");
				System.out.print("수정할 회원의 아이디를 입력하세요 : ");
				editId = scan.next();

				for (index = 0; index < count; index++) {
					if (editId.equals(id[index])) {
						System.out.print("기존 비밀번호 입력 : ");
						String originPwd = scan.next();

						if (originPwd.equals(pwd[index])) {
							System.out.print("수정할 비밀번호 입력 : ");
							changePwd = scan.next();
							pwd[index] = changePwd;
							System.out.println("정보가 수정됐습니다");
							break;
						} else {
							System.out.println("비밀번호가 일치하지 않습니다 다시 확인해주세요");
							break;
						}
					}
				}
				if (index == count) {
					System.out.println("회원정보가 없습니다");
				}
				break;

			case 5:
				System.out.println("=====회원삭제=====");
				System.out.print("삭제할 회원의 아이디를 입력하세요 : ");
				deleteId = scan.next();

				for (index = 0; index < count; index++) {
					if (deleteId.equals(id[index])) {
						System.out.print("비밀번호를 입력하세요 :");
						String originPwd = scan.next();
						if (originPwd.equals(pwd[index])) {
							id[index] = null;
							pwd[index] = null;
							System.out.println("회원이 삭제됐습니다");
							break;
						} else {
							System.out.println("비밀번호가 일치하지 않습니다");
							break;
						}
					}
				}
				if (index == count) {
					System.out.println("존재하지 않는 회원입니다");
				}
				break;


			case 6:
				boolean boole = true;
				System.out.println("=====모든 회원 보기=====");
				
				for (index = 0; index < count; index++) {
						
					
					if (id[index] == null) {
						continue;
					}
					System.out.println("----------------");
					System.out.println("아이디  : " + id[index]);
					System.out.println("비밀번호 : " + pwd[index]);
					System.out.println("----------------");
				}
				
				
				
				
				break;
			case 7:
				System.out.println("프로그램 종료");
				System.exit(1); // 프로그램 강제 종료
				break;

			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
		}

	}
}
