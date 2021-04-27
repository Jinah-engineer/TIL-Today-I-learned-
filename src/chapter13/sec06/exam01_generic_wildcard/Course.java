package chapter13.sec06.exam01_generic_wildcard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]); // Object 배열을 T[] 타입으로 Casting 하는 것
	}
	
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	// 배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		// students.length = capacity
		for (int i = 0; i < students.length; i++) {
			// 비어있는 곳 찾기
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
