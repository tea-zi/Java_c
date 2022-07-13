package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_최대값_문제 {

	/*
	 * [문제]
	 *	최대값 구하기
	 * 1. 숫자 3개를 입력받는다.
	 * 2. 입력받은 3개의 수를 비교한다.
	 * 3. 가장 큰 수(MAX)를 출력한다.
	 */
	public static void main(String[] args) {		
			
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("숫자입력 : ");
		a = scan.nextInt();
		System.out.print("숫자입력 : ");
		b = scan.nextInt();
		System.out.print("숫자입력 : ");
		c = scan.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("MAX 값 : " + a);
			}
			if(a==c) {
				System.out.println("MAX 값 : " + a + c);
			}
			if(a<c) {
				System.out.println("MAX 값 : " + c);
			}
		}
		if(a==b) {
			if(a>c) {
				System.out.println("MAX 값 : " + a + b);
			}
			if(a==c) {
				System.out.println("MAX 값 : " + a + b + c);
			}
			if(a<c) {
				System.out.println("MAX 값 : " + c);
			}
		}
		if(a<b) {
			if(b>c) {
				System.out.println("MAX 값 : " + b);
			}
			if(b==c) {
				System.out.println("MAX 값 : " + b + c);
			}
			if(b<c) {
				System.out.println("MAX 값 : " + c);
			}
		}
		
		int max = a;
		if(max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}
		System.out.println("max = " + max);
	}
}