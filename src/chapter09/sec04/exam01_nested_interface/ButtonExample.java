package chapter09.sec04.exam01_nested_interface;

public class ButtonExample {
	public static void main(String[] args) {
		
		Button button = new Button();
		
		button.setOnClickListener(new CallListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
		
		// 익명 구현 객체
		button.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		
		button.touch();
	}
}
