package chapter06.sec13.exam01_class_access.package2;

import chapter06.sec13.exam01_class_access.package1.B;

public class C {
//	A a; --> 다른 패키지에 있기 때문에 접근 불가
	B b; // import해서 사용 가능
}
