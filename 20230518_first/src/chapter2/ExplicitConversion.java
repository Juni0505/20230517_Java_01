package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;
		float  fNum2 = 0.9f;
		int iNum3 = (int)1.2 + (byte)0.9f;
		int iNum4 = (int)(1.2 + 0.9f);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
				
		int a1 = 10;
		int b1 = 3;
		int c1 = a1  / b1;
		double d1 = a1 / b1; 
		double d2 = (double)(a1 / b1); // d1 , d2는 int값으로 나옴
		double d3 = (double)a1 / (double)b1;
		double d4 = (double)a1 / b1;
		double d5 = a1 / (double)b1;	// d3 ,d4 ,d5 경우 회사마다 쓰는 방식이 있어 지침대로 따라 가면 된다
		
		//  int / int ==> int
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
	}

}
