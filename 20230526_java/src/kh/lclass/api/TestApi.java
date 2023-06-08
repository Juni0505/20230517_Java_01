package kh.lclass.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

import kh.lclass.vo.TestVo;
import kh.lclass.api.KhCommonApi.*;

public class TestApi {
	public void testData() {
		Date when = new Date(2000L);
		// 대부분 deprecated 되어있음.
		System.out.println(when);
		//	new Calendar() 오류
		//	Cannot intantiate the type Calendar
		//	원인 1. abstract class 2. 생성자 접근제한자 protected
		// 해결 1
		Calendar c = new GregorianCalendar();
		// 해결 2 - Singleton - 디자인패턴 중 하나
		Calendar c2 = Calendar.getInstance();
		
		TestSingleton ts = TestSingleton.getInstance();
		System.out.println(ts.getA());
		ts.setA(50);
		System.out.println(ts.getA());
		TestSingleton ts2 = TestSingleton.getInstance();
		System.out.println(ts2.getA());
		ts.setA(100);
		System.out.println(ts2.getA());
		
		System.out.println(c.getTime());
		
		
		
		
	}
	public void testWrapperdoWhile() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴 1-5 사이 선택해주세요.");
			int menu = 0;
			try {
				String menuStr = scan.nextLine();
				menu = Integer.parseInt(menuStr);
			} catch (InputMismatchException e) {
				scan.nextLine();
			}
			if (!checkMenu(1,5,menu)) {
				// 비정상 입력경우
				System.out.println("1-5사이 선택해주세요.");
				continue;
			}
			// 정상입력경우
			System.out.println("정상적으로 입력되어서... 다른 함수 호출함");
			testString();
			System.out.println("동작 마침!!!");
			break;
		}
	}

	/*
	 * while (true) { System.out.println("메뉴 1-5 사이 선택해주세요."); int menu =
	 * scan.nextInt(); if (menu > 0 && menu < 6) { // 정상입력경우
	 * System.out.println("정상적으로 입력되어서... 다른 함수 호출함"); testString();
	 * System.out.println("동작 마침!!!"); break; } else { // 비정상 입력경우"
	 * System.out.println("1-5사이 선택해주세요."); } }
	 * System.out.println("testWraaperDoWhile 끝");
	 */

	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
		str2.append("12345");
		str2.insert(2, "abc");
		System.out.println(str2);
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		str3.insert(1, "111");
		System.out.println(str3);

		Scanner scan = new Scanner(System.in);
		System.out.println("구분자를 입력해주세요.");
		String token = scan.nextLine();
		System.out.println("내용을 입력해주세요.");
		String content = scan.nextLine();
		String str = "AA|BB|CC";
		StringTokenizer st = new StringTokenizer(str, "|");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 기본자료형 --> String;
		int i = 35;
		String s1 = String.valueOf(i);
		String s2 = Integer.valueOf(i).toString();

		// String --> 기본자료형
		String s = "35";
		i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println("=====끝=====");

		int bnum1 = 10;
		int bnum2 = 11;
		String bcontent2 = "aaaa";
		String bwriter1 = "aa";
		bwriter1 = "bb";

		TestVo tvo = new TestVo(10, "aa");

		TestVo tvo2 = new TestVo(11);
		tvo2.setBoardContent("aaaa");
		// tvo2.setBoardNum(11);

		tvo2.getBoardContent();
		tvo.getBoardNum();
	}
}
