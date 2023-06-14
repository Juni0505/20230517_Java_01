package kh.lclass.bank;

/*
1. 자료형
	 - 기본자료형 = 프리미티브자료형 = primitive type = 기본형
	 int , double, boolean , byte , float , short , char , long
	 
	 boolean - 1byte - true/false
	 	boolean a1 = true;
	 byte - 1byte - 정수
	 	byte a2 = 20;
	 char - 2byte '문자한자와작은따옴표'
	 	char a3 = '한';
	 short  - 2byte - 정수
	 	short a4 = 20;
	 int - 4byte - 정수
	 	int a5 = 20;
	 float - 4byte - 실수
		float a6 = 20.0;
	 double - 8byte - 실수
	 	double a7 = 20. 0;
	 long - 8byte - 정수
	 	long a8 = 20;
	 
	 - 참조자료형 = 레퍼런스자료형 = reference type = 참조형 --> 클래스명
	2. 변수선언 vs 변수활용
		자료형 변수명;  // 선언 선언은 한번만 이루어지며 같은 이름으로 두번적용할수없다.
		변수명 = 값; // 활용 - 대입
		변수명	// 활용 - 꺼내기
	3. 메소드정의 vs 메소드호출
		// 메소드정의
		리턴형 메소드명(자료형 매개변수, 자료형 매개변수, ..) {return 값;}
		char abc(int p1) {
		
			return 'a';
		}	 // int값은 { ~ } 괄호 안에서만 사용 된다
		
		//메소드호출
		자료형 변수명 = 메소드명(값, 값, ..);
		char a = abc(1000);
		
	 
*/
//클래스선언 vs 클래스생성=인스턴스생성=객체생성 vs 인스턴스메소드호출
//										/인스턴스필드값대입	
public class BankAcoount1 {
	public int acoountNo;

}
