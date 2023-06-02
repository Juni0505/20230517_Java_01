package kh.lclass.oop.run;

import kh.lclass.oop.sample.Person;
import kh.lclass.oop.sample.Student;

public class TestArray {

	public static void main(String[] args) {
		
		
		Object obj1 = new Student();
		Object obj2 = new Person();
		Person p1 = new Student();
		Student s1 = new Student();
		
		
		// 방법 1
		Person[] personArray2 = new Person [] {new Person(), new Person(), new Person()};
		// 방법 2
		Person[] personArray = new Person[22];
		for(int i = 0; i < personArray.length; i++) {
			personArray[i] = new Person();
		}
		
		//personArray[0].setAge(25);
		// NullPointerException
		// 원인 : . 점 앞에 있는 변수(객체=인스턴스)가 null 상태
		// 즉 personArray[0]이 null 주소값을 가지고 있었음.
		// 해결방법 : 변수(객체=인스턴스)에 new 생성자(); 를 해줌
		personArray2[0] = new Person();
		personArray2[0].setAge(25);
		personArray2[0].setName("김소똥");
		personArray2[0].setGender('여');
		
		personArray2[1] = new Person("김개똥", 19, '남');
		personArray2[2] = new Person("김말똥", 22, '남');
		
		System.out.println(personArray2[0].getName());
		
		System.out.println("==== strArr ====");
		Student[] stdArr = new Student[3];
		for(int i = 0; i<stdArr.length; i++) {
			stdArr[i] = new Student();
		}
		stdArr[0].setAge(15);
		stdArr[0].setName("김영희");
		stdArr[0].setGender('여');
		stdArr[0].setScore(85);
		stdArr[0].setGrade(3);
		System.out.println(stdArr[0].getName());
		System.out.println(stdArr[0].getAge());
		System.out.println(stdArr[0].getGender());
		System.out.println(stdArr[0].toString());
		
		Student yh = new Student("김영희", '여', 20, 1);
		
	}
	
}
