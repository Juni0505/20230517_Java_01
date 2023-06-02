package kh.lclass.oop.sample;

public class Person {
	protected String name;
	private int age;
	private char gender;

	// 기본 생성자

	// allArgumetsConstructor 만들어주세요.
	// allArgumetsConstructor 란 모든 매개인자를 받아서 처리하는 생성자
	// overloading 으로 생성

	
	public Person() {

	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// getter // setter
}
