package chapter11.sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		
		int[] scores = { 99, 97, 98 };
		// 반드시 먼저 정렬부터 하기
		Arrays.sort(scores);
		
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스 :" + index);
		
		String[] names = { "손진아", "차진아", "용진아" };
		Arrays.sort(names);
		
		int index2 = Arrays.binarySearch(names, "용진아");
		System.out.println("찾은 인덱스 :" + index2);
		
		Member m1 = new Member("손진아");
		Member m2 = new Member("차진아");
		Member m3 = new Member("이진아");
		Member[] members = { m1, m2, m3};
		
		Arrays.sort(members);
		int index3 = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스 :" + index3);

		
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
		
		
	}
}
