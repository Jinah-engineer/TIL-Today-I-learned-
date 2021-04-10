package chapter06.sec12.exam03_import.mycompany;

import chapter06.sec12.exam03_import.hankook.SnowTire;
import chapter06.sec12.exam03_import.hankook.Tire;
import chapter06.sec12.exam03_import.hyundai.*; // *표는 이 패키지에 속하는 모든 클래스를 의미한다.
import chapter06.sec12.exam03_import.kumho.BigWidthTire;

public class Car {
	// field
	Engine engine = new Engine();
	Able able = new Able();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Tire tire3 = new Tire();
	chapter06.sec12.exam03_import.kumho.Tire tire4 = new chapter06.sec12.exam03_import.kumho.Tire(); // 다른 package에 있는 동일한 name의 class를 사용하고 싶을때
	// 대신의 import문을 제외하고 작성해야 한다. 클래스 명이 같은 경우에만 해당한다는 것! 
}
