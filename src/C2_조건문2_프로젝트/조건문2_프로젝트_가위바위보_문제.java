package C2_조건문2_프로젝트;

import java.util.Scanner;

public class 조건문2_프로젝트_가위바위보_문제 {
	/*
	 * [문제]
	 * 		[가위(0) 바위(1) 보(2) 게임]
	 * 1. player1 은 0~2 사이의 숫자를 입력받는다. 
	 * 2. player2 는 0~2 사이의 숫자를 입력받는다. 
	 * 3. 가위,바위,보를 아직문자로는 표현할수없으므로  0,1,2 숫자로 대신표현한다.
	 * 4. player1과 player2를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
	 */
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("[가위(0) 바위(1) 보(2) 게임]");
		System.out.print("Player1 :");
		int p1 = scan.nextInt();
		System.out.print("Player2 :");
		int p2 = scan.nextInt();
		
		if(p1==p2) {
			System.out.println("비겼다");
		}
		if(p1==0 && p2==1) {
			System.out.println("Player1이 졌다.\nPlayer2가 이겼다.");
		}
		if(p1==0 && p2==2) {
			System.out.println("Player1이 이겼다.\nPlayer2가 졌다.");
		}
		if(p1==1 && p2==0) {
			System.out.println("Player1이 이겼다.\nPlayer2가 졌다.");
		}
		if(p1==1 && p2==2) {
			System.out.println("Player1이 졌다.\nPlayer2가 이겼다.");
		}
		if(p1==2 && p2==1) {
			System.out.println("Player1이 졌다.\nPlayer2가 이겼다.");
		}
		if(p1==2 && p2==0) {
			System.out.println("Player1이 이겼다.\nPlayer2가 졌다.");
		}
		
	}
}