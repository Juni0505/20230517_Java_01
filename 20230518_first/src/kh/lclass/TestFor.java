package kh.lclass;

import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {

		// 화면에 1-5까지 display해줘
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5);
		 */

		// 시작 : 1
		// 끝 : 100
		// step: 2
		int sum1 = 0;
		int start = 1;
		int end = 100;
		int step = 1;
		int num3 = start;
		while(num3 <= 100) {
			sum1 = sum1 + num3;
			num3 += step;
		}
		System.out.println(start+ "부터 "+ end + "까지의 합은 " + sum1);
		// 짝수합을 위한 초기화
		sum1 = 0;
		step = 2;
		num3 = start;
		while(num3 <= end) {
			sum1= sum1+num3;
			num3 += step;
		}
		System.out.println(start + "부터 " + end + "까지의 짝수 합은 " + sum1);
		// 홀수합을 위한 초기화
		sum1 = 0;
		step = 2;
		num3 = start+1;
		while(num3 <= end) {
			sum1= sum1+num3;
			num3 += step;
		}
		System.out.println(start + "부터 " + end + "까지의 홀수 합은 " + sum1);
		
		System.out.println("for========");
		int evenSum = 0;
		int oddSum = 0;
		sum1 = 0;
		for(start = 1, step = 1, num3 = start;	// 초기화 - 0
				num3 <= end;	//조건식 -1
				num3 += step) // 증감식 -3 
			{
			// 반복문 -2
			sum1 += num3;
			if(num3 % 2 == 0) {
				evenSum += num3;
			}else {
				oddSum += num3;
			}
		}
		System.out.println(start + "부터 "+ end + "까지의 합은 "+sum1);
		System.out.println(start + "부터 "+ end + "까지의 짝수의 합은 " + evenSum);
		System.out.println(start + "부터 "+ end + "까지의 홀수의 합은 " + oddSum);
			
		
		System.out.println("while 구문 =====");
		int num1 = 5;
		int num2 = 1;
		while (num1 >= 1) {
			System.out.println("(" + num1 + ", " + num2 + ")");
			num1 = num1 - 1;
			num2 = num2 * 2;
		}
		System.out.println("======for 구문");
		for (num1 = 5, num2 = 1; num1 >= 1; num1 = num1 - 1, num2 *= 2) {
			System.out.println("(" + num1 + ", " + num2 + ")");
		}
		System.out.println(" ====반복 끝");
		int sum = 0;
		for (int i = 2; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("지역 범위 -변수");
		int num8 = 10;
				for(num8 = 1; num8<5; num8++) {
					System.out.println(num8);
				}
				System.out.println("==========");
				System.out.println(num8);
				System.out.println("==========");
				for(int num9 = 1; num9 < 5; num9++) {
					System.out.println(num9);
				}
				for(int num9 = 3; num9 < 7; num9++) {
					System.out.println(num9);
				}
				
		System.out.println("====구구단 2단 =======");
		int dan = 2;
		int su = 1; //	1씩 증가하면서 9까지 dan이랑 곱해야된다.
		System.out.printf("%d * %d = %2d\n", dan, su, dan*su);
		System.out.printf("%d * %d = %2d\n", dan, ++su, dan*su);
		System.out.println("=========");
		for(dan=2; dan < 10; dan++) {
			for(su = 1; su < 10; su++) {
				System.out.printf("%d * %d = %2d\n", dan, su, dan*su);
		}
		System.out.println();
		}
		System.out.println("어릴때 외운 화면처럼 1단계 =======");
		//dan= 2;
		su = 1;
		for(su = 1; su < 10; su++) {
			for(dan=2; dan<10; dan ++) {
				System.out.printf("%2d * %2d = %2d\t", dan, su, dan*su);
				if(su == 5) {
					break;
				}
		}
			if(dan == 5) {
				break;
				
			}
		System.out.println();
	}
		
		System.out.println("==== countinue ====");
		int total = 0;
		for(int i = 1; i < 10; i++ ) {
			// 방법 1
/*			if(i%2==0)
				continue;
			total += i; 
		}	*/
			// 	방법2
			if(i%2 != 0) {
				total = total + i;
			}
			
			total = (i % 2 != 0) ? total + i   :  total   ;  //삼항연산자
			//0이 아니라면 ?로	total + 1 맞다면 total = total로서 삼항연산자가 된다
			
		}				
		String msg = (total > 0) ? "홀수 합계는 %d\n"	:	"합계는 음수일 수 없습니다. %d\n";
		if(total > 0) {
			msg = "홀수 합계는 %d\n";
		}else {
			msg = "합계는 음수일 수 없습니다. %d\n";
		}
		System.out.printf(msg, total);
	}
}
