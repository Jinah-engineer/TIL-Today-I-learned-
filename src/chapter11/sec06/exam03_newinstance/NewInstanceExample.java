package chapter11.sec06.exam03_newinstance;

public class NewInstanceExample {
	public static void main(String[] args) {
		// Class 객체 얻기
		try {
			Class clazz = Class.forName("chapter11.sec06.exam03_newinstance.SendAction");
			Action action = (Action) clazz.newInstance(); // Object를 다시 interface로 타입 변환해서 객체 생성
			action.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
