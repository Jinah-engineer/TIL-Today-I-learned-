package chapter06.sec10.exam04_singleton;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton() --> compile error (외부에서의 객체 생성을 막았기 때문에)
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 singleton 객체 입니다.");
		} else {
			System.out.println("다른 singleton 객체 입니다.");
		}
		
		// 결과적으로 obj1 과 obj2 는 같은 singleton 객체를 참조하고 있다는 것을 알수있다.
	}
}
