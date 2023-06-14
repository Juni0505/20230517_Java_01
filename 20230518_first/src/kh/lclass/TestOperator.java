package kh.lclass;

public class TestOperator {
	public static void main(String[] args) {
		int num5 = 100;
		int num2 = 3;
		double num3 = 3.0;
		
		System.out.println(num5%num2);
		System.out.println(num5%num3);
		System.out.println(-num5);
		System.out.println(-(-num5-10));
		
		//병원이나 은행같이 차례대로 대기자 처리할 경
		int a = 1;
		int b = 0;	// 처리 완료자수
		a = a + 1;  // 대기번호표 , 대기자수x
		a += 1;
		System.out.println(a); // 3
		a = a * 2;
		a *= 2;
		System.out.println(a); // 12
		a = a / 4;
		a /= 4;
		System.out.println(a); // 0
		// == 이와 같이 처리할때 += -= .. 연산자를 사용
		System.out.println("전위증감");
		a= 10;
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println("후위증감");
		
		
		System.out.println(num5);
		
		System.out.println("비교연산자 결과는 true/flase");
		System.out.println(3 < 7);
		boolean c = !(3<5);
		// 정수값, 실수값, 문자값 등은 true /false로 형변환되지 않음
		
		int num1 = 10;
		int i = 2;
		boolean value = ((num1 = num1 +10) < 10) && ((i = i+2) < 10);
		// ((num1 = num1 + 10) < 10)
			// (num1 = num1 + 10)
		 		// num1 + 10
				// num1 대입	
			// 10
		// ((i = i < 2) < 10)
		// 순서
		// num1 = num1 + 10;  ==> 20
		// num1 < 10		==> false   == 여기서부터 뒤 쪽이 참이든 거짓이든 연산을 하지 않는다
		// i = i + 2  ==> 4
		// i < 10  ==> true
		// false && true
		// value = false
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2 ) < 10);
		// num1 = num1 + 10;  ==> 20
				// num1 < 10		==> true
				// i = i + 2  ==> 4
				// i < 10  ==> true
				// false || true
				// value = true;
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
