package chapter11.sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();	
		
		System.out.println(strObj);
		
		System.out.println(myPhone);
		
		// toString의 method를 재정의할때 >> 여러 field 값을 활용해야 할 때 
	}
}
