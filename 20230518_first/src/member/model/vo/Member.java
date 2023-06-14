package member.model.vo;

import java.util.Date;

public class Member {
	private String name;  //name -> 변수명 String -> 자료형
	private int age;
	private Date enrollDate;
	
	public Member() {}
	
	public Member(String name, int age, Date enrollDate) {
		super();
		this.name = name;
		this.age = age;
		this.enrollDate = enrollDate;
				
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
