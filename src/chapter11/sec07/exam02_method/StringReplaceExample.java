package chapter11.sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		
		// replace()
		String oldStr = "진아는 오늘 집에서 혼자 있습니다. 밥을 먹었을까요?";
		String newStr = oldStr.replace("진아", "진마");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
