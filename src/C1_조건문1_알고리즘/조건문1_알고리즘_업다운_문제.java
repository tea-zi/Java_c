package C1_���ǹ�1_�˰���;

import	java.util.Scanner;

public class ���ǹ�1_�˰���_���ٿ�_���� {
	/*
	 * [����]
	 * 	[Up & Down ����]
	 * 
	 *  com�� 8�̴�.
	 *  me�� ���ڸ� �ϳ��Է¹޴´�.
	 *  com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
	 *   [1] me < com	: Up!
	 *   [2] me == com : Bingo!
	 *   [3] me > com  : Down!
	 *   
	 *   ��)
	 *   (1) ���ڸ� �Է� : 
	 *   (2) Up! 
	 *   
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int com = 8;
		System.out.println("���� �Է� : ");
		int me = scan.nextInt();
		
		if(me<com) {
			System.out.println("Up!");
		}
		if(me==com) {
			System.out.println("Bingo");
		}
		if(me>com) {
			System.out.println("Down!");
		}
	}
}