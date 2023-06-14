package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx() {
		// The constructor InetAddress() is not visible
		// 원인 생성자 없음.
		// 조치내용 : 1. singleton 확인 (주로 get/instance(),create() 메소드 지원 확인)
		// 2. static method 즉 클래스메소드지원이 됨.
		String host1 = "www.naver.com";
		String host2 = "www.google.com";
		String host3 = "www.oracle.com";
		try {
			InetAddress[] ipAll = InetAddress.getAllByName(host1);
			System.out.println(Arrays.toString(ipAll));
			for (InetAddress ip : ipAll) {
				System.out.println(ip);
				System.out.println();
				byte[] ipAddr = ip.getAddress();
				System.out.print("ip : ");
				for (byte i : ipAddr) {
					if (i < 0) {
						System.out.print(i + 256);
					} else {
						System.out.print(i);
					}
					if(i == ipAddr.length-1)
						continue;
					System.out.print(".");
					
				}
				System.out.println();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
