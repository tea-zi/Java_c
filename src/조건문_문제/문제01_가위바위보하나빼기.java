package 조건문_문제;

import java.util.Random;
import java.util.Scanner;

/*	
	[문제]
	[가위바위보 하나빼기]
	[1] 룰은 직접 정하고 게임을 최대한 비슷하게 만들어보시오.
*/
public class 문제01_가위바위보하나빼기 {
	public static void main(String[] args) {
			Random ran = new Random();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("[1.가위][2.바위][3.보]");
			System.out.println("가위바위보");
			int me1 = scan.nextInt();
			int me2 = scan.nextInt();
			int r1 = ran.nextInt(3)+1;
			int r2 = ran.nextInt(3)+1;
			System.out.println(r1 + " " + r2);
			System.out.println("하나빼기");
			System.out.println("[1][2]");
			int sel = scan.nextInt();
			int me = 0;
			if(sel == 1) {
				me = me1;
			}
			else if(sel == 2) {
				me = me2;
			}
			else {
				System.out.println("오류");
			}
			int csel = ran.nextInt(2);
			int com = 0;
			if(csel == 0) {
				com = r1;
			}
			else if(csel == 1) {
				com = r2;
			}
			System.out.println(me);
			System.out.println(com);
			if(me == 1) {
				if(com == 1) {
					System.out.println("무승부");
				}
				else if(com == 2) {
					System.out.println("패");
				}
				else if(com == 3) {
					System.out.println("승리");
				}
			}
			else if(me == 2) {
				if(com == 1) {
					System.out.println("승리");
				}
				else if(com == 2) {
					System.out.println("무승부");
				}
				else if(com == 3) {
					System.out.println("패");
				}
			}
			else if(me == 3) {
				if(com == 1) {
					System.out.println("패");
				}
				else if(com == 2) {
					System.out.println("승리");
				}
				else if(com == 3) {
					System.out.println("무승부");
				}
			}
	}
}