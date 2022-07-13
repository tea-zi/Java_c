package 테스트0301_문제;

import java.util.Random;

/*
	[문제]
	[회원등급]
		볼펜하나의 가격은 1200원이다. 	
		볼펜은 20개이상구매시 볼펜하나당 100원을 할인해주고있다. 
			
		또한, 회원등급에 따라 할인을 추가제공한다.
		
		회원등급이 1 이면 15% 할인제공,
		회원등급이 2 이면 10% 할인제공,
		기본회원등급은 3이고 할인을 제공하지않는다.
		
		철수가 구입해야하는볼펜개수는 (10~50) 사이로 랜덤으로 저장하고,
		철수의 등급은 (1~3) 사이로 랜덤으로 표현해서 
		철수가 지불해야하는 금액을 출력하시오.		
		소수점 2 자리까지 표현하시오.
*/
public class 조건문4_문제05_회원등급연습 {	
	public static void main(String[] args) {	
		Random ran = new Random();
		int 가격 = 1200;
		int 개수 = ran.nextInt(41)+10;
		System.out.println("개수 :" + 개수);
		double 전체 = 가격*개수;
		int 등급 = ran.nextInt(3)+1;
		System.out.println("등급 :" + 등급);
		int 할인 = 0;
		double 등급할인 = 0;
		if(개수>=20) {
			할인 = 개수*100;
		}
		if(등급 == 1) {
			등급할인 = (전체-할인)*0.15;
			System.out.printf("금액 : %.2f", 전체-할인-등급할인);
		}
		else if(등급 == 2) {
			등급할인 = (전체-할인)*0.1;
			System.out.printf("금액 : %.2f", 전체-할인-등급할인);
		}
		else {
			System.out.println("할인제공하지 않음");
			System.out.printf("금액 : %.2f", 전체-할인);
		}
		
	}
}