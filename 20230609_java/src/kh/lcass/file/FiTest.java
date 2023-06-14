package kh.lcass.file;

import java.io.FileWriter;
import java.io.IOException;

public class FiTest {
	public static void main(String[] args) {
		String filePath = "a.txt";
		
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			
			fileWriter.write("Hello, Wrold");
			
			fileWriter.close();
			
			System.out.println("파일이 성공적으로 생성되었습니다.");
		} catch(IOException e) {
			System.out.println("파일 생성 중 오류가 발생했습니다. " + e.getMessage());
		}
	}
}
