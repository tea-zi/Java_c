package C3_���ǹ�3_�⺻�̷�;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_�⺻�̷�6_elseifȰ�� {
	/*
	 *  ���������� ������ if - else if �������� �����غ���.
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int com = ran.nextInt(3);

		System.out.print("����(0),����(1),��(2) �Է� : ");
		int me = scan.nextInt();

		if (com == me) {
			System.out.println("����.");
		} else if (com == 0 && me == 1) {
			System.out.println("�̰��.");
		} else if (com == 1 && me == 2) {
			System.out.println("�̰��.");
		} else if (com == 2 && me == 0) {
			System.out.println("�̰��.");
		} else {
			System.out.println("����.");
		}

	}
}