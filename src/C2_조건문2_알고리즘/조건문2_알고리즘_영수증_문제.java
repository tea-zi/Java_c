package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_������_���� {
	/*
	 * [����]
	 *  
	 * 	[������ ���]
	 * 1. �޴����� ����Ѵ�.
	 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
	 * 3. ������ �Է¹޴´�.
	 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
	 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
	 */
	public static void main(String[] args) {	
		
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.print("�޴��� ��ȣ�� �Է����ּ���! ");
		int order = scan.nextInt();
		System.out.print("������ �־��ּ���! ");
		int money = scan.nextInt();
		if(order==1) {
			if(money>=price1) {
				System.out.println("���� ���� : " + money);
				System.out.println("1.�Ұ�� ���� : " + price1);
				System.out.println("�Ž����� : " + (money-price1));
			}
			else {
				System.out.println("������ �����մϴ�.");
			}
		}
		if(order==2) {
			if(money>=price2) {
				System.out.println("���� ���� : " + money);
				System.out.println("2.���� ���� : " + price2);
				System.out.println("�Ž����� : " + (money-price2));
			}
			else {
				System.out.println("������ �����մϴ�.");
			}
		}
		if(order==3) {
			if(money>=price3) {
				System.out.println("���� ���� : " + money);
				System.out.println("3.�� �� : " + price3);
				System.out.println("�Ž����� : " + (money-price3));
			}
			else { //else�� money<price3�� ���氡��
				System.out.println("������ �����մϴ�.");
			}
		}
				
	}
}