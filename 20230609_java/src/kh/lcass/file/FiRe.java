package kh.lcass.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FiRe {

	public static void main(String[] args) {
		String filePath = "b.txt";
		
		File file = new File(filePath);
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			
			if(fr!=null)
				fr.close();
			if(br!=null)
				br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
	}

}
