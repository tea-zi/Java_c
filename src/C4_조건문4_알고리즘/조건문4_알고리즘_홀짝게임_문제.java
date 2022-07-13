package C4_조건문4_알고리즘;

import java.util.Scanner;
import java.util.Random;

public class 조건문4_알고리즘_홀짝게임_문제 {
	/*
	 * [문제]
	 * 
	 * 	[홀짝 게임]
	 * 
	 * 1. 1~10개의 숫자중 랜덤으로 한개의 숫자를 저장한다.
	 * 2. 랜덤의 숫자가 [1.홀수][2.짝수] 인지 맞추는게임이다.
	 */		
	public static void main(String[] args) {		
	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int a;
		int b;
		int num = ran.nextInt(10)+1;
		System.out.println("[홀짝 게임]");
		System.out.println("[1.홀수] [2.짝수]");
		int me = scan.nextInt();
		if(me==1) {
			a = num%2;
			if(a==0) { 
				System.out.println("오답");
				System.out.println(num+" : 짝수");
			}
			else {
				System.out.println("정답");
				System.out.println(num+" : 홀수");
			}
		}
		else if(me==2) {
			a = num%2;
			if(a==0) { 
				System.out.println("정답");
				System.out.println(num+" : 짝수");
			}
			else {
				System.out.println("오답");
				System.out.println(num+" : 홀수");
			}
		}
		else
			System.out.println("오류");
	}
}