package C1_���ǹ�1_������Ʈ;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_�հ�_���� {
	/*
	 * [����]
	 *  [���� ��ȿ�� �˻�]
	 * 1. ����2���� �Է¹޾� ����� ���Ѵ�.
	 * 2. �����  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
	 * 3. ����1)  �Է¹��� ������ 
	 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
	 *    ��) ������  �߸� �Է��߽��ϴ�.
	 * 4. ����2) ����� 60 �̻��̶� , �Ѱ����̶� 50�̸��̸� ���հ��� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�");
		int a = scan.nextInt();
		System.out.println("�����Է�");
		int b = scan.nextInt();
		
		double avg = (a+b)/2.0;
		
		if(a<=100 && a>=0 && b<=100 && b>=0) {
			if(avg>=60 && a>=50 && b>=50) {
				System.out.println("�հ�");
			}
			if(avg<60 || a<50 || b<50) {
				System.out.println("���հ�");
			}
		}
		else {
		System.out.println("������ �߸� �Է��߽��ϴ�.");
		}
		

	}
}