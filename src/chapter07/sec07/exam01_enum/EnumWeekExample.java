package chapter07.sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); // 현재 날짜를 calender객체로 만들어서 돌려주는 메소드
		int week = cal.get(Calendar.DAY_OF_WEEK); // get은 오늘의 요일을 돌려준다.
		System.out.println(week);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
