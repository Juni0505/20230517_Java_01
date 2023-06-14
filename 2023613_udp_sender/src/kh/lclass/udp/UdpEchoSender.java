package kh.lclass.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpEchoSender {
	public static void main(String[] args) {
		UdpEchoSender instance = new UdpEchoSender();
		instance.senderUdp();
		
	}

	public void senderUdp() {
		// 포트번호 정함
		int myPort = 5001;
		int destPort = 6001;
		String destName = "localhost";

		DatagramSocket dSock = null;
		BufferedReader br = null;
		try {
			// DatagramSocket 객체 생성
			dSock = new DatagramSocket(myPort);

			// System.in이 기반스트림 역할
			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				// 전달할 메시지
				System.out.println("입력 >>");
				String sendMsg = br.readLine();
				// exit 입력하면 프로그램 끝내
				if (sendMsg.equals("exit")) {
					break;
				}
				// 3. 연결한 클라이언트 IP주소를 가진 InetAddress 객체 생성
				InetAddress destIp = null;
				try {
					destIp = InetAddress.getByName(destName);
					byte[] byteMst = sendMsg.getBytes();
					DatagramPacket sendData = new DatagramPacket(byteMst, byteMst.length, destIp, destPort);
					dSock.send(sendData);
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				byte[] byteMsg = new byte[1000];
				// 수신받을 메시지를 DatagramPacket 객체에 담음
				DatagramPacket receivedData = new DatagramPacket(byteMsg, byteMsg.length);
				dSock.receive(receivedData);
				String receivedStr = new String(receivedData.getData());
				System.out.println("Echo메시지 :"+ receivedStr);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (dSock != null)
				dSock.close();
		}
	}
}
