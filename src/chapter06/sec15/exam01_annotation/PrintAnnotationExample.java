package chapter06.sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// Service 클래스에 선언된 메소드 얻기 (Reflection)
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		// Method 객체를 하나씩 처리
		for (Method method : declaredMethods) {
			
			// PrintAnnotation이 적용되었는지 확인하기
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				
				// PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 구분선 출력
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println(); // 개행
				
				// 메소드 호출하기
				try {
					method.invoke(new Service());
					System.out.println();
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}
}
 