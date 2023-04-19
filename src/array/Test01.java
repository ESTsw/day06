package array;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] id = new String[5];
		String[] pwd = new String[5];
		int j = 0;
		int i = 0;

		while (true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				System.out.println("=====로그인=====");
				System.out.print("아이디 입력 : ");
				String writeId = scan.next();
				for (i = 0; i < id.length; i++) {
					if (writeId.equals(id[i])) {
						System.out.print("비밀번호 입력 :");
						String writePwd = scan.next();
						if (writePwd.equals(pwd[i])) {
							System.out.println("인증완료");
							break;
						} else {
							System.out.println("비밀번호가 일치하지 않습니다");
							break;
						}
					}
				}

				if (i == id.length) {
					System.out.println("존재하지 않는 아이디 입니다");
				}
				break;

			case 2:
				System.out.println("=====회원가입=====");
				System.out.print("아이디 입력 : ");
				String newId = scan.next();

				for (j = 0; j < id.length; j++) {
					if (newId.equals(id[j])) {
						System.out.println("이미 존재하는 아이디 입니다");
						break;
					}
					if (id[j]==null) {
						id[j] = newId;
						System.out.print("비밀번호 입력 : ");
						String newPwd = scan.next();
						pwd[j] = newPwd;
						System.out.println("회원가입 완료");
						break;
					}
				}
				
				if(j==id.length) {
					System.out.println("저장공간이 부족합니다");
				}
				
				break;

			case 3:
				return;
			}
		}

	}
}
