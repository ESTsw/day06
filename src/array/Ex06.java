package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		// 배열 5개를 만들고 로그인 프로그램을 만드시오

		Scanner scan = new Scanner(System.in);

		String[] id = new String[5];
		
		// System.out.println(id[0]);
		// 변수형의 첫번째 글자가 대문자 >> null로 초기화
		// 변수형의 첫번째 글자가 소문자 >> 0으로 초기화

		String[] pwd = new String[5];

//		id[0] = "aaaa";
//		
//		if(id[0] != null) {
//			System.out.println("값이 존재한다");
//			if(id[0].equals("aaaa")) {
//				System.out.println("aaaa와 같다");
//			}else {
//				System.out.println("aaaa가 아니다");
//			}
//		}else {
//			System.out.println("값이 없다");
//		}

		while (true) {

			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("======로그인=======");
				System.out.print("아이디 입력 : ");
				String writeId = scan.next();

				int index = 0;
				for (String i : id) {
					if (writeId.equals(id[index])) {
						System.out.print("비밀번호 입력 : ");
						String writePwd = scan.next();
						if (writePwd.equals(pwd[index])) {
							System.out.println("인증통과");
						} else {
							System.out.println("비밀번호가 일치하지 않습니다");
						}
					}
					index++;
				}

//				for (String i : id) {
//					if (writeId.equals(id[index]) == false) {
//						System.out.println("존재하지 않는 아이디입니다");
//					} else {
//						System.out.print("비밀번호 입력 : ");
//						String writePwd = scan.next();
//						if (writePwd.equals(pwd[index]) == false) {
//							System.out.println("비밀번호가 틀렸습니다");
//						} else {
//							System.out.println("로그인 됐습니다");
//						}
//					}
//				}
				break;
			case 2:
				System.out.println("======회원가입========");
				System.out.print("아이디 입력 : ");
				String newId = scan.next();
				int index2 = 0;

				for (String i : id) {
					if (i == null ) {
						if(newId.equals(i)==false) {
							System.out.print("비밀번호 입력 : ");
							String newPwd = scan.next();
							id[index2] = newId;
							pwd[index2] = newPwd;
							System.out.println("회원가입 완료");
							break;
						}else {
							System.out.println("이미 존재하는 아이디 입니다");
						}
					} else{
						System.out.println("더 이상 저장할 공간이 없습니다");
					}
					index2++;
				}

			case 3:
				return;
			}
		}

	}
}