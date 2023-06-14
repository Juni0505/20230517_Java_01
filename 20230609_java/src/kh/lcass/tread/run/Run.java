package kh.lcass.tread.run;

import kh.lcass.tread.ThreadAaa;
import kh.lcass.tread.ThreadBbb;

public class Run {

	public static void main(String[] args) {
		
	//	Thread ta = new ThreadAaa();
		ThreadAaa ta = new ThreadAaa();
	//	ta.setPriority(1);
	//	ta.start();
		
		Thread tb = new ThreadBbb();
		tb.setPriority(10);
		tb.start();
		
		//run 일반 메소드 호출하듯 하면 Thread 동작 안함
//		ta.run();
//		tb.run();
		

		for(int i = 0; i<500; i++) {
			System.out.println(i+ "*");
		}
		System.out.println("main 끝");
	}

}
