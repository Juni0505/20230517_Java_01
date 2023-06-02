package kh.lclass.oop.sample;

public class Avante extends Car{
	
	public Avante() {
		//setPrice(3000); setter을 이용해서 값을 넣는경우
		super(3000);	// 생성자를 통해 int price 값으로 한번에 넣는경우
	}
	public void moveAvante() {
		System.out.println("Avante moveAvante");
	}
}
