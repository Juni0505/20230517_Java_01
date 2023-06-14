package kh.lclass.bank;

public class BankAccount {
	// static 클래스 변수
	private static int count; // 현재 통장을 개설한 사람 수

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		BankAccount.count = count;
	}

	// setter 있으면 안됨.
	private int accountNum; // 계좌번호
	private String name; // 예금주
	private Integer sno; // 주민번호

	private String accountName; // 통장이름
	private Information info; // 유의사항
	private int balance; // 잔액
	private int password; // 비밀번호

	{
		accountName = "내일배움-블럭초기화";
		balance = 5000000;
	}

	// 생성자 클래명과 동일, 리턴타입없음.
	public BankAccount() {
		accountName = "내일배움생성";
	}

	public BankAccount(Integer sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public BankAccount(Integer sno, String name, int phoneNumber) {
		this.accountNum = phoneNumber;
		this.sno = sno;
		this.name = name;
	}

	@Override //어노테이션 (annotation) : 가독성을 좋게 해준다
	public String toString() {
		return "BankAccount [accountNum=" + accountNum +
				", name=" + name + ", accountName=" + accountName
				+ ", balance=" + balance + "]";
	}

	// overloading 오버로딩 : 매개변수 개수, 자료형이 다르고 메소드 명이 같을때
	public double sum(double a, double b) {
		return a + b;
	}

	public double sum(double a, int b) {
		return a + b;
	}

	public double sum(int a, double b) {
		return a + b;
	}

	public double sum(int a, int b) {
		return a + b;
	}

	public double sum(int a, int b, int c) {
		return a + b + c;
	}

	public double sum(String a, double b) {
		return Integer.parseInt(a) + b;
	}

	public int sumArgs(int... args) {
		int result = 0;
		for (int a : args) {
			System.out.println(a);
			result += a;
		}
		System.out.println("합은 :" + result);
		// 가변인자 예
		System.out.printf("printf는 가변인자 사용 %d %f %d %c %s\n", 1, 3.5, 200000000000L, 'c', "문자열도 가능");
		return result;
	}

	// 메소드 정의 = 기능정의
	// 입금 --- 출처(source), 금액(inputmoney) 준다면 - balance에 금액만큼 더하고 - 최종 balance 를 화면
	// 표시함
	// 출금 --- 목적지(destination), 금액(outputmoney) 준다면 - balance에 금액만큼 빼고 - 최종 balance
	// 를 화면 표시함
	// 비밀번호 확인 ---입력한패스워드(inputpassword)와 - password를 비교하여 같다면 true 다르면 false를 표시
	// 잔액조회
	// 입출금내역조회

	public int deposit(String source, int inputMoney) {
		System.out.println(source + "으로 부터" + inputMoney + "만큼 입금되었습니다");
		double interate = 0.05; // 해당 값은 변수(지역변수) 지역변수는 해당 지역에서만 사용가능한 값이다.

		balance = balance + inputMoney;
		return balance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public String getName() {
		return name;
	}

	public Integer getSno() {
		return sno;
	}

	public String getAccountName() {
		return accountName;
	}

	public Information getInfo() {
		return info;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setInfo(Information info) {
		this.info = info;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
