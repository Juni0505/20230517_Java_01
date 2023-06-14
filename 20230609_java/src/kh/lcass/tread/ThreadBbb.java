package kh.lcass.tread;

public class ThreadBbb extends Thread{
	@Override
	public void run() {
		for(int dan =2 ; dan < 101; dan++) {
			for(int su =1; su< 10; su++) {
				System.out.println(dan + " * " + su + " = "  + dan*su);
			}
			System.out.println("===");
			try {
				sleep(10L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("******끝******");
		return;
	}
}
