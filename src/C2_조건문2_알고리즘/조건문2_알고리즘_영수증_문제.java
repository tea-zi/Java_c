package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_영수증_문제 {
	/*
	 * [문제]
	 *  
	 * 	[영수증 출력]
	 * 1. 메뉴판을 출력한다.
	 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
	 * 3. 현금을 입력받는다.
	 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
	 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
	 */
	public static void main(String[] args) {	
		
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.print("메뉴의 번호를 입력해주세요! ");
		int order = scan.nextInt();
		System.out.print("현금을 넣어주세요! ");
		int money = scan.nextInt();
		if(order==1) {
			if(money>=price1) {
				System.out.println("받은 현금 : " + money);
				System.out.println("1.불고기 버거 : " + price1);
				System.out.println("거스름돈 : " + (money-price1));
			}
			else {
				System.out.println("현금이 부족합니다.");
			}
		}
		if(order==2) {
			if(money>=price2) {
				System.out.println("받은 현금 : " + money);
				System.out.println("2.새우 버거 : " + price2);
				System.out.println("거스름돈 : " + (money-price2));
			}
			else {
				System.out.println("현금이 부족합니다.");
			}
		}
		if(order==3) {
			if(money>=price3) {
				System.out.println("받은 현금 : " + money);
				System.out.println("3.콜 라 : " + price3);
				System.out.println("거스름돈 : " + (money-price3));
			}
			else { //else는 money<price3로 변경가능
				System.out.println("현금이 부족합니다.");
			}
		}
				
	}
}