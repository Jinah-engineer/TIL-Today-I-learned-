package chapter07.sec03.exam01_parent_constructor_call;

public class Student extends People{
	// field
	public int studentNo;
	
	// constructor
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
