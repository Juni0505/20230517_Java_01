package kh.lclass.chat.serer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ServerBackground {
	private ServerSocket serverSocket;
	private ServerGUI gui;

	// client 여러명을 관리 : key : nickname, value : socket객체
	private Map<String, BufferedWriter> mapClients = new HashMap<String, BufferedWriter>();
	// map.put("socket", socket);
	// map.put("nickname", "ej");
	// mapList.add(map);

	// map.put("ej", socket);
	// map.put("ej", socket);

	private Socket socket;

	private int count;

	// 서버 생성 및 설정
	public void setting() {
		Collections.synchronizedMap(mapClients);
		try {
			serverSocket = new ServerSocket(7777);
			// 방문자 접속을 계속 받아들임. 무한반복함. GUI프로그램경우 창 닫힐때까지 계속 반복
			while (true) {
				// 접속자 대기 중
				socket = serverSocket.accept(); // 클라이언트 받음
				new Client(socket).start();
				// 클라이언트 nickname이 바로 이어서 들어옴.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 클라이언트 접속하면 그 정보를 나타내 주는 메소드
	public void addClient(String nickname) {
		gui.appendMsg(nickname + "님이 접속했습니다.");
	}

	// private ServerGUI gui
	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}
	public void sendMessage(String msg) {
		// client들 모두에게 msg 전달
		Set<String> keys = mapClients.keySet();
		for(String key : keys) {
			BufferedWriter wr = mapClients.get(key);
			try{
				wr.write(key+":"+msg+"\n");
				wr.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	class Client extends Thread {
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickname;

		public Client(Socket socket) {
			// 초기값 설정
			// client와 입/출력 통로 생성
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				String nickname = br.readLine();
				// client nickname이 바로 이어서 들어옴.
				// 접속되면 바로 nickname이 전달될 것이므로 읽음
				// server 화면에 표현
				addClient(nickname);
				// client outputStream 관리 map에 추가
				mapClients.put(nickname, bw);
				// client map 모두에게 접속 정보 전달
				sendMessage(nickname+ "님 접속했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while (br != null) {
				try {
					String msg = br.readLine();
					gui.appendMsg(msg);
					// client map 모두에게 접속 정보 전달
					sendMessage(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
				

			}
		}

	}
}
