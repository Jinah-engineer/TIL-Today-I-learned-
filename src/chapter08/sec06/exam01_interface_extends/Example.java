package chapter08.sec06.exam01_interface_extends;

public class Example {
	public static void main(String[] args) {
		// 객체 생성
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		C ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
