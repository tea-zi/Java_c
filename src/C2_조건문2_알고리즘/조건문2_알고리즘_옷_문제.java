package C2_조건문2_알고리즘;

import	java.util.Scanner;

public class 조건문2_알고리즘_옷_문제 {
	/*
	[문제] 
		상점에서 24600원 짜리 옷을샀습니다.
		1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액입력 : ");
		int c = scan.nextInt();
		int s = c/1000;
		if(c%1000>0) {
			s=s+1;
		}
		System.out.println("필요한 천원짜리 제폐수 : " + s);
		
	}
}