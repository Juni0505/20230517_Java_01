package kh.lclass;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = new String("mango");
		// strArr을 복사할 strCopyArr 생성
		String[] strCopyArr = new String[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			strCopyArr[i] = strArr[i]; 
		}
		strArr[2] = "oragne";
		strCopyArr[1] = "딸기";
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " : " + strCopyArr[i]); 
		}
		System.out.println("==================");
		
		int a = 10;
		//a.
		int[] arrA = new int[3];
		int[] arrB = arrA.clone();
		System.out.println(arrB.length);
		System.out.println(arrB[2]);
		
		Arrays.copyOf(strArr, 3);
		System.out.println("=== Arrays.copyOf===");
		String[] strCopyArr2 = Arrays.copyOf(strArr, 3);
		for(int i = 0; i < strCopyArr2.length; i++) {
			System.out.println(strCopyArr2[i]);
		}
		
		System.out.println("=== System. ===");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strCopyArr, 1, strCopyArr3, 0, 2);
		
		String[] strArr2 = {"apple", "banana", new String("mango")};
		String[] strArr3 = {new String("apple"),new String("banana"),new String("mango") };
		String[] strArr4 = new String [] {"apple", "banana", new String("mango")};
		String[] strArr5 = new String [] {new String("apple"),new String("banana"),new String("mango")};
		
		System.out.println("strArr의 1번째 과일은 " + strArr[0]);
		System.out.println("strArr의 2번째 과일은 " + strArr[1]);
		System.out.println("strArr의 3번째 과일은 " + strArr[2]); 
		for(int i = 0; i < strArr.length; i++) {
			System.out.println("strArr의" + i + "번째 과일은" + strArr[i]);
			System.out.printf("strArr의 %d번째 과일은 %s\n", i, strArr[i]);
		}
	
		//오류 발생!! IndexOutOfBoundsException
		//System.out.println(strArr[0]);
		
		int[] intArr = new int[3];
		System.out.println(intArr[1]);
		
		//int[] intArr2 = new int[3] {1, 2, 3}; // 해당값은 초기화 할때 방에 수를 넣으면 안된다
		
		int[] intArr3 = new int[] {1, 2, 3};	// 해당 하는 값으로 해야 오류가 안뜬다
		int[] intArr4 = {1, 2, 3};
		
		//Student[] studentArr = new 
	}

}
