package chapter11.sec08.exam01_split_stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		
		// split
		String text = "홍길동&이수홍,박연수,김자바-최씨언어";
		
		String[] names = text.split("&|,|-");
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
