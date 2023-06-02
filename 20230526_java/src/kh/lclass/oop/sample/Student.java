package kh.lclass.oop.sample;

public class Student extends Person{
	private String name;
//	private int age;
//	private char gender;
	private int score;
	private int grade;
	
	public Student() {
		super(); // Person()
		//super("김말똥", 22, '남'); // Person("김말똥", 22, '남')
	}
	public Student(String name, char gender, int age, int grade) {
		super(name, age, gender);
		this.name = name;
		this.grade = grade;	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade 
				+ ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	// Overriding
	//	재졍의
	//	조건 : 상속한 클래스의 메소드와 동일한 메소드명 매개인자도 같아야된다.
	// 리턴타입도 동일
	// 단, 접근제한자는 달라도 됨 - 부모메소드의 접근제한자보다 넓은범위접근제한자를 사용해야함.
	
	public int getAge() {
		return super.getAge();
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
