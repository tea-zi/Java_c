package C4_조건문4_알고리즘;

import java.util.Scanner;

public class 조건문4_알고리즘_ATM_문제 {
	/*
	 * [문제] 
	 * [ATM]
	 *  [변수설명]
	 *   cash ==> 가지고있는 현금을 표현한다.
	 *   balance ==> 예금을 표현한다.
	 *   joinId ==> 이미 가입한 아이디
	 *   joinPw ==> 이미 가입한 패스워드
	 *  [특이사항] ==>  로그인 이후에 새로운 메뉴가 나오도록 한다.
	 *    	[1.로그인] 
	 *  	    [1-1. 로그인성공] ==> 새로운매뉴등장 ==> [1.입금] [2.출금] 	
	 *              [1-1-1.입금] ==> 현금이 줄어들고 예금이 늘어난다.
	 *              [1-1-2.출금] ==> 예금이 줄어들고 현금이 늘어난다.
	 *  		[1-2. 로그인실패] ==> 종료
	 *  	[0.종료]
	 *   [최종결과를 출력하시오]
	 *  
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;    
		int balance = 30000; 
		int joinId = 11111; 
		int joinPw = 1234;  
		int a;
	
		System.out.println("===MEGA ATM===");
		System.out.println("[1.로그인] [0.종료]");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.print("아이디 입력 : ");
			int logId = scan.nextInt();
			System.out.print("비밀번호 입력 : ");
			int logPw = scan.nextInt();
			if(joinId == logId && joinPw == logPw) {
				System.out.println("로그인 성공");
				System.out.println("[1.입금] [2.출금]");
				select = scan.nextInt();
				if(select == 1) {
					System.out.print("입금할 금액 : ");
					a = scan.nextInt();
					int charge = cash - a;
					if(charge>=0) {
						cash = cash-a;
						balance = balance+a;	
						System.out.println("현금 : "+cash);
						System.out.println("예금 : "+balance);
					}
					else
						System.out.println("오류");
				}
					
				else if(select==2) {
					System.out.print("출금할 금액 : ");
					a = scan.nextInt();
					int charge = balance - a;
					if(charge>=0) {
						cash = cash+a;
						balance = balance-a;
						System.out.println("현금 : "+cash);
						System.out.println("예금 : "+balance);
					}
					else
						System.out.println("오류");
				}
				else
					System.out.println("오류");
			}
			else {
				System.out.println("로그인 실패");
				System.out.println("종료");
			}
		}else if (select == 0) {
			System.out.println("종료");
		}

	}
}