package kh.lclass;

import java.util.Scanner;

public class TestIfLoop2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요. 정수 0~200 : ");
		int age = sc.nextInt();
		// 8살이면 학교에 입학하였습니다.
		// 9살부터 19살까지 학교에 다닙니다.
		// 그외 학교에 다니지 않습니다.
		// 19살이면 곧 졸업합니다.
		if (age >= 8 && age <= 19) {
			System.out.println("학교에 다닙니다.");
			if(age == 8) {
				System.out.println("학교에 입학하였습니다.");
			} else if (age == 19) {
				System.out.println("곧 졸업합니다.");
			}
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("================");
		System.out.println("공원입장료");
		System.out.println("나이를 입력해주세요.");
		//교재 flow chart 97page 보면서 작성해주세요.
		
		int age2 = 0;
		int charge = 0;
		age2 = sc.nextInt();
		
		/*
		  switch(age2 / 수식사용가능) {
		  case 1:	// case (수식사용 불가)
		  case 2:
		  case 3:
		 */
		
		
		if (age2 < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if (age2 < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if (age2 < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
			System.out.println("요금은" + charge + "원 입니다.");
		
		System.out.println("=================");
		System.out.println("====== 학점 ======");
		System.out.println("평균점수를 입력하세요 :");
		int totalScore = sc.nextInt();
		int score = totalScore / 10;	//	10으로 나눈 몫(정수연산이므로)
		// 99 ==> 9 , 90 ~ 99 ==> 9
		// switch - case 문은 비교문의 규칙성이 있을 때 사용하면 좋음.
		switch(score) {
			case 10:		//if
			case 9:
				System.out.println("A학점입니다.");
				break;
			case 8:		// else if
				System.out.println("B학점입니다.");
				break;
			case 7:		// else if
				System.out.println("C학점입니다.");
				break;
			case 6:		// else if
				System.out.println("D학점입니다.");
				break;
			default: 	//	else
				System.out.println("과락입니다.");
		}
		
		System.out.println("=================");
		
		
		// 1~100 정수의 합을 구하시오.
		int i;
		int sum = 0;
		//for (1초기값설정 ; 2조건식 ; 4증감식 ) {
		for(i = 1 ; i<= 100 ; i = i+1) {
			// 3여기
			sum += i;
			
		}
		// 20명의 영어 성적을 입력받아 합계와 평균값을 구해주세요.
		
		sc.close();
	}

}
