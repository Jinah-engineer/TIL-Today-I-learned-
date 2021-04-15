package chapter07.sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		
		Parent parent = new Parent(); // 자동타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2"; --> parent 타입에 정의되어 있지 않기 때문에  
//		parent.method3();
		
		Child child = (Child) parent; // 강제타입변환
		child.field2 = "yyy";
		child.method3();
	}
}
