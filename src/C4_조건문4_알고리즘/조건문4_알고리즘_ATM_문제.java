package C4_���ǹ�4_�˰���;

import java.util.Scanner;

public class ���ǹ�4_�˰���_ATM_���� {
	/*
	 * [����] 
	 * [ATM]
	 *  [��������]
	 *   cash ==> �������ִ� ������ ǥ���Ѵ�.
	 *   balance ==> ������ ǥ���Ѵ�.
	 *   joinId ==> �̹� ������ ���̵�
	 *   joinPw ==> �̹� ������ �н�����
	 *  [Ư�̻���] ==>  �α��� ���Ŀ� ���ο� �޴��� �������� �Ѵ�.
	 *    	[1.�α���] 
	 *  	    [1-1. �α��μ���] ==> ���ο�Ŵ����� ==> [1.�Ա�] [2.���] 	
	 *              [1-1-1.�Ա�] ==> ������ �پ��� ������ �þ��.
	 *              [1-1-2.���] ==> ������ �پ��� ������ �þ��.
	 *  		[1-2. �α��ν���] ==> ����
	 *  	[0.����]
	 *   [��������� ����Ͻÿ�]
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
		System.out.println("[1.�α���] [0.����]");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.print("���̵� �Է� : ");
			int logId = scan.nextInt();
			System.out.print("��й�ȣ �Է� : ");
			int logPw = scan.nextInt();
			if(joinId == logId && joinPw == logPw) {
				System.out.println("�α��� ����");
				System.out.println("[1.�Ա�] [2.���]");
				select = scan.nextInt();
				if(select == 1) {
					System.out.print("�Ա��� �ݾ� : ");
					a = scan.nextInt();
					int charge = cash - a;
					if(charge>=0) {
						cash = cash-a;
						balance = balance+a;	
						System.out.println("���� : "+cash);
						System.out.println("���� : "+balance);
					}
					else
						System.out.println("����");
				}
					
				else if(select==2) {
					System.out.print("����� �ݾ� : ");
					a = scan.nextInt();
					int charge = balance - a;
					if(charge>=0) {
						cash = cash+a;
						balance = balance-a;
						System.out.println("���� : "+cash);
						System.out.println("���� : "+balance);
					}
					else
						System.out.println("����");
				}
				else
					System.out.println("����");
			}
			else {
				System.out.println("�α��� ����");
				System.out.println("����");
			}
		}else if (select == 0) {
			System.out.println("����");
		}

	}
}