package kh.lclass.IO;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import exception.UserException;
import kh.lclass.oop.sample.Person;

public class TestFileIO {
	public void testFileOutputStreamObject() {
		// 파일에 사람들 자료를 저장함.
		Person p1 = new Person("홍길동", 23, '남');
		Person p2 = new Person("영희", 27, 'F');

		String filePath = "D:/data2/test/aaa.txt";
		FileOutputStream fos = null; // 기반스트림
		ObjectOutputStream oos = null; // 보조 스트림
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
				if (fos != null)
						fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void testFileInputStreamObject() {
		String filePath = "D:/data2/test/aaa.txt";
		FileInputStream ios = null;
		ObjectInputStream ois = null;
		try {
			ios = new FileInputStream(filePath);
			ois = new ObjectInputStream(ios);
			Person a = (Person)(ois.readObject());
			Person b = (Person)(ois.readObject());
			System.out.println(a);
			System.out.println(b);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(ios != null) ios.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void testRamda() throws UserException {
		int arr[] = { 2, 3, 4, };
		int arr2[] = { 2, 3, 4, };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		if (arr.length > 2) {
			throw new UserException("배 크면 안됨. 줄여주세요.");
		}
	}

	public void testFileReadData() {
		String filePath = "D:/data2/test/aaa.txt";
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath));) {
			long temp = 0L;
			while ((temp = dis.readLong()) != 0) {
				System.out.println(String.valueOf(temp));
			}

			// F2 - quick fix 사용 1. try catch 신중하게 잘 써야함. 2. unimplement method add
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void testFileRead3() {
		String filePath = "D:/data2/test/aaa.txt";
//		BufferedReader br = null;
		try (
			FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			)
		{
			// br = new BufferedReader(new FileReader(filePath));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
/*		} finally {
			try {
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			*/
		}
	}

	public void testFileRead2() {
		// 보조 스트림
		String filePath = "D:/date2/test/aaa.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 생성 순서 : 기반스트림 --> 보조스트림
			fis = new FileInputStream(filePath);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			// 줄여서 나타내기
		//	isr = new InputStreamReader(new FileInputStrea(filePat))
		//	br = new BufferedReader(new InputStreamReader(new FileInputStream))
			
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 해제 순서 (생성반대순서) : 보조스트림 --> 기반스트림
				if(br != null) br.close();
				if(isr != null) isr.close();
				if(fis != null) fis.close();
			}catch (IOException e2){
				e2.printStackTrace();
			}
			
			
		}
		}

	public void testFile()/* thorws Exception */ {
//		File f1 = new File("D:data/aaa.txt");
//		f1.mkdirs();
		String path = "D:/data2/test";
		String filename = "aaa.txt";

		new File(path).mkdirs();
		File f2 = new File(path, filename);
		// Unhandled exception type IOException
		FileWriter fw = null;
		try {
			f2.createNewFile();

			fw = new FileWriter(f2);
			fw.write("한글 한 ");
			fw.flush();
			return;
		} catch (IOException e) {
			System.out.println("file 생성 못함");
			e.printStackTrace();

		}
	}
}
