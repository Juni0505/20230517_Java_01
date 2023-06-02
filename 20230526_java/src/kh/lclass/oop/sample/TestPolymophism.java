package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestPolymophism {

	public static void main(String[] args) {
		
		List<Car> carList = new ArrayList<Car>();
		ArrayList<Car> carArrList = new ArrayList<Car>();
		ArrayList<Car> carArrList2 = new ArrayList<Car>();
		Collection<Car> carCollection = new ArrayList<Car>();
		
		
		
		//오류 new TestiInterface();
		TestInterface kh = new Kh();
		((Kh)kh).khSpecial();
		// 같은 값이 출력되나 상황에 따라 다르게 사용된다.
		Kh kh2 = new Kh();
		kh2.khSpecial();
		kh2.method1();
		
		
		Car s = new Sonata();
		Car a = new Avante();
				
		Driver ej = new DriverSub();
		ej.setMoney(10000);
		ej.buy(s);
		ej.buy(a); 
		
		Driver jh = new Driver2Sub();
		jh.setMoney(10000);
		jh.buy(s);
		jh.buy(a);
		
	}

}
