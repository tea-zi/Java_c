package C2_���ǹ�2_�˰���;

import	java.util.Scanner;

public class ���ǹ�2_�˰���_��_���� {
	/*
	[����] 
		�������� 24600�� ¥�� ��������ϴ�.
		1000��¥�� ����θ� �ʰ��� ���ٸ� ������ �ʿ��Ѱ���?
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ��Է� : ");
		int c = scan.nextInt();
		int s = c/1000;
		if(c%1000>0) {
			s=s+1;
		}
		System.out.println("�ʿ��� õ��¥�� ����� : " + s);
		
	}
}