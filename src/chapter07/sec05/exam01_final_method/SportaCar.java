package chapter07.sec05.exam01_final_method;

public class SportaCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// stop method는 final method이기 때문에 사용할 수 없음
}
