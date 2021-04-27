package chapter15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장
		list.add("Java"); //0
		list.add("JDBC"); //1
		list.add("Servlet/JSP"); //3
		list.add(2, "Database"); //2
		list.add("iBATIS"); //4
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		// 2번 인덱스 객체 삭제
		list.remove(2);
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		// 2번 인덱스 객체 삭제
		list.remove(2);
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		// 객체 직접 삭제
		list.remove("iBATIS");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
	}
}
