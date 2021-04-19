package chapter09.sec05.exam03_button_event;

public class Button {
	// field
	OnClickListener listener; // field type - inner interface type
	
	// method
	void setOnClickListener(OnClickListener listener) { // interface type 매개변수
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// inner interface
	interface OnClickListener {
		// method
		void onClick();
	}
}
