package kh.lclass;

import java.util.Scanner;

public class TestIfLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		// 8살이면 학교에 입학하였습니다.
		// 9살부터 19살까지 학교에 다닙니다.
		// 그외 학교에 다니지 않습니다.
		// 19살이면 곧 졸업합니다.
		if (age == 8) {
			System.out.println("학교에 입학하였습니다.");
		}
		else if (age == 19) {
			System.out.println("곧 졸업합니다.");
		}
		else if (age >= 9 && age <= 19){
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}

	}

}
