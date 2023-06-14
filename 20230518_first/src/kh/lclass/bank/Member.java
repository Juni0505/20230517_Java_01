package kh.lclass.bank;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("통장개설을 원하십니까?");
		String answer = scan.nextLine();
		if(answer.equals("네")) {	//(answer=="네") 문자 == 비교할 수 없음.
			
			System.out.println("주민번호 확인 : ");
			//ing strNum = scan.nextLine(); scan.nextLine();
			String strNum = scan.nextLine();
			int sno = Integer.parseInt(strNum);
			
			System.out.println("이름 확인 : ");
			String strName =scan.nextLine();
			BankAccount yj = new BankAccount(sno, strName);
			BankAccount hj = new BankAccount(123123, "종호", 010322240);
			
			BankAccount jh = new BankAccount();
			System.out.println(jh.getSno());	// 0
			System.out.println(jh.getName());	// 0
			System.out.println(jh.getBalance()); // 0 ---> 5000000
			System.out.println(jh.getAccountName());	// 내일배움
			jh.sumArgs(2, 5, 3);
			System.out.println("=================");
			
			BankAccount hj2 = new BankAccount(123123, "종호", 010322240);
			if(hj2.equals(hj)) System.out.println(" hj 같다");
			else System.out.println(" hj 다르다");
			
			// String
			String str1 = "문자";
			String str2 = "문자";
			String str3 = new String();
			String str4 = new String("문자");
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3); // ""
			System.out.println(str4);
			boolean b = str1.equals(str4);
			if(str1.equals(str4)) System.out.println("같다");
			else		System.out.println("다르다");
			
			System.out.println(hj);
			System.out.println(hj.toString());
			System.out.println(hj.hashCode());
			
			System.out.println(hj.getSno().MAX_VALUE);
			System.out.println(hj.getSno());
			System.out.println("끝");
			
			char c = '\'';
			System.out.println("한줄\n한탭\t탭한슬래쉬\\\\따옴표는 어떻게\"'?");
			System.out.printf("한줄\n한탭\t탭한슬래쉬\\\\따옴표는 어떻게\"'?%%%%");

			System.out.println("안"+ 2 + 4);  //안 2 4
			System.out.println(2 + 4+"안");	//6 안
			System.out.println(2 * 4 + "안");	//8 안
			System.out.println("안" + 2*4);	//안 8
			System.out.println("안" + 2*4+7);	//안 8 7
			System.out.println(2 + 4 + "안" +7 + 8);	//6안 7 8
			System.out.println(2 + 4 + "안" + (7+8));	//6 안 15
			
			String str = "Hello Java";
			System.out.println(str.indexOf(' '));
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(2));
			System.out.println(str.length());
			System.out.println(str.toLowerCase()); //전부 소문자로 바꿔주세요
			System.out.println(str.toUpperCase()); //전부 대문자로 바꿔주세요
			String strReplace = str.replace('J', 'L');	//J라는 글자를 L로 바꿔주세요
			System.out.println(strReplace);
			int idx = str.indexOf(' ');
			String strSubString = str.substring(idx+1, idx+2);
			System.out.println(strSubString);
			
			
			for(int i = 0; i < str.length(); i++) {
				
			}
			if(str.length() < 3) {
				
			}
			
			
		}else {
			System.out.println("다른 창구를 이용해주세요.");
		}
		
	}
	
}
