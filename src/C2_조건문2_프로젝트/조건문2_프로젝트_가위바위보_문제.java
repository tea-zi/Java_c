package C2_���ǹ�2_������Ʈ;

import java.util.Scanner;

public class ���ǹ�2_������Ʈ_����������_���� {
	/*
	 * [����]
	 * 		[����(0) ����(1) ��(2) ����]
	 * 1. player1 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
	 * 2. player2 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
	 * 3. ����,����,���� �������ڷδ� ǥ���Ҽ������Ƿ�  0,1,2 ���ڷ� ���ǥ���Ѵ�.
	 * 4. player1�� player2�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
	 */
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("[����(0) ����(1) ��(2) ����]");
		System.out.print("Player1 :");
		int p1 = scan.nextInt();
		System.out.print("Player2 :");
		int p2 = scan.nextInt();
		
		if(p1==p2) {
			System.out.println("����");
		}
		if(p1==0 && p2==1) {
			System.out.println("Player1�� ����.\nPlayer2�� �̰��.");
		}
		if(p1==0 && p2==2) {
			System.out.println("Player1�� �̰��.\nPlayer2�� ����.");
		}
		if(p1==1 && p2==0) {
			System.out.println("Player1�� �̰��.\nPlayer2�� ����.");
		}
		if(p1==1 && p2==2) {
			System.out.println("Player1�� ����.\nPlayer2�� �̰��.");
		}
		if(p1==2 && p2==1) {
			System.out.println("Player1�� ����.\nPlayer2�� �̰��.");
		}
		if(p1==2 && p2==0) {
			System.out.println("Player1�� �̰��.\nPlayer2�� ����.");
		}
		
	}
}