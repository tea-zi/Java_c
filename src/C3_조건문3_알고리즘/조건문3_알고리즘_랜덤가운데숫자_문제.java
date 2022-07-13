package C3_조건문3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 조건문3_알고리즘_랜덤가운데숫자_문제 {
	/*
	 * [문제]
	 * 
	 * 	[가운데 숫자 맞추기 게임]
	 * 
	 * 1. 150~250 사이의 랜덤 숫자 저장한다.
	 * 2. 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다.
	 * 예)
	 * 		249		: 4
	 */
	public static void main(String[] args) {	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(101) +150;
		System.out.print("숫자를 입력하세요 : ");
		int a = scan.nextInt();
		
		int b = num%100/10;
		
		if(a==b) {
			System.out.println(num + " : " + a);
		}
		else {
			System.out.println("틀렸습니다");
		}
	
		
	}
}