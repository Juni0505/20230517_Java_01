package kh.lcass.tread;

public class ThreadAaa implements Runnable{

	@Override
	public void run() {
		for(int dan =2 ; dan < 101; dan++) {
			for(int su =1; su< 10; su++) {
				System.out.println(dan + " * " + su + " = "  + dan*su);
			}
			System.out.println("===");
		}
		System.out.println("******끝******");
	}
	
}
