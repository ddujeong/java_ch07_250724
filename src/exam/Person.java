package exam;
// Person 클래스를 만들고, 
//Person 클래스를 상속 받는 Student, Solider, Employee 클래스를 만드시오.

public class Person {
	String name; // 이름
	String status; // 신분 
	String duties; // 담당 업무
	
	
	
	public Person(String name, String status, String duties) {
		super();
		this.name = name;
		this.status = status;
		this.duties = duties;
	}



	public void job() {
		System.out.println("이름 : " + name + "| 신분 : " + status +  "| 담당 업무 : "+ duties);
	}
	
	
}
