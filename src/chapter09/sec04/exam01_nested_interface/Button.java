package chapter09.sec04.exam01_nested_interface;

public class Button {
	// field
	OnClickListener listener; // field type - inner interface type
	
	// method
	void setOnClickListener(OnClickListener listener) {
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
