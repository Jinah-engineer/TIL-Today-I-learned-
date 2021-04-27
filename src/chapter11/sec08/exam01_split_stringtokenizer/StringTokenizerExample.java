package chapter11.sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		
		// stringtokenizer
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		
		// 전체 토큰 수를 얻어 for 문으로 루핑
		int countTokens = st.countTokens();
		System.out.println(countTokens); // 3개의 token이 있다.
		
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token); // 토큰을 하나씩 꺼내기
		}
		
		// 일반적인 방법 - 남아있는 토큰을 확인하고 while 문으로 루핑w
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
