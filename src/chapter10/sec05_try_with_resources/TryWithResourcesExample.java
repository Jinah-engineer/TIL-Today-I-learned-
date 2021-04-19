package chapter10.sec05_try_with_resources;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read(); // fis.close()를 자동 호출한다.
			throw new Exception(); // 강제 예외 발생 - 예외가 발생되는 즉시 close메소드가 실행된다.

		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
