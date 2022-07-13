package C3_조건문3_프로젝트;

import java.util.Random;

public class 조건문3_프로젝트_일주일_문제 {
	/*
	 * [문제]
	 * 
	 *  [요일 맞추기]
	 *  
	 * 	이번달 1일이 수요일이라고 할때, 
	 *  랜덤으로 1~31을 저장하고 해당 요일 출력한다. 
	 *  
	 *  예) 3일 ==> 금요일
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		int date = ran.nextInt(31) + 1;
		if(date%7==1) {
			System.out.println(date + "일은 수요일입니다.");
		}
		if(date%7==2) {
			System.out.println(date + "일은 목요일입니다.");
		}
		if(date%7==3) {
			System.out.println(date + "일은 금요일입니다.");
		}
		if(date%7==4) {
			System.out.println(date + "일은 토요일입니다.");
		}
		if(date%7==5) {
			System.out.println(date + "일은 일요일입니다.");
		}
		if(date%7==6) {
			System.out.println(date + "일은 월요일입니다.");
		}
		if(date%7==0) {
			System.out.println(date + "일은 화요일입니다.");
		}
		long a = System.currentTimeMillis();
		System.out.println(a); // 1970년1월1일 0초부터 지금까지 의 초 
	}
}