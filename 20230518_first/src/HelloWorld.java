import kh.lclass.bank.BankAccount;

public class HelloWorld {

	public static void main(String[] args) {
		// JVM이 main 메서드를 호출해줌.
		
	/*	BankAccount yjchun = new BankAccount();
		yjchun.setName("이제이");
		yjchun.setBalance(5000);
		
		// 시간이 흘러서..
		int currentBalance = yjchun.deposit("역삼우리은행ATM3", 5000);
		System.out.println("잔액" + currentBalance + "입니다.");  
		*/
		final int NUMBER_OF_STUDENT = 10;
		
		boolean a1;
		byte a2;	// -128 ~ 127
		short a3; //
		int a4;	// 정수 기본연산 자료형
		long a5;
		
		float a6;
		double a7; // 실수 기본연산 자로형
		
		char a8;
		
		a1 = true;
		System.out.println(a1);
		a2 = 20;
		System.out.println(a2);
		a3 = 20;
		System.out.println(a3);
		a4 = 20;
		System.out.println(a4);
		a5 = 20;
		System.out.println(a5);
		a6 = 20.434323f; // float는 소수를 쓸 때 f를 반드시 써줘야된다
		System.out.println(a6);
		a7 = 20.434323;
		System.out.println(a7);
		a8 = 'A'; // 65
		System.out.println(a8);
		a8 = 65;
		System.out.println(a8);
		
		a5 = 20l;
		a5 = 20L;
		
		
		System.out.println("aaa");
		/*
		public class System {
		public Abcdef out;  // 참조형 
		
		}
		
		public class Abcedf {
			public void println(String a1) {
				/console창에 a1 뿌리기
				return;
			}
		
		*/
	}

}
