package ���ǹ�_����;

import java.util.Random;
import java.util.Scanner;

/*	
	[����]
	[���������� �ϳ�����]
	[1] ���� ���� ���ϰ� ������ �ִ��� ����ϰ� �����ÿ�.
*/
public class ����01_�����������ϳ����� {
	public static void main(String[] args) {
			Random ran = new Random();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("[1.����][2.����][3.��]");
			System.out.println("����������");
			int me1 = scan.nextInt();
			int me2 = scan.nextInt();
			int r1 = ran.nextInt(3)+1;
			int r2 = ran.nextInt(3)+1;
			System.out.println(r1 + " " + r2);
			System.out.println("�ϳ�����");
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
				System.out.println("����");
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
					System.out.println("���º�");
				}
				else if(com == 2) {
					System.out.println("��");
				}
				else if(com == 3) {
					System.out.println("�¸�");
				}
			}
			else if(me == 2) {
				if(com == 1) {
					System.out.println("�¸�");
				}
				else if(com == 2) {
					System.out.println("���º�");
				}
				else if(com == 3) {
					System.out.println("��");
				}
			}
			else if(me == 3) {
				if(com == 1) {
					System.out.println("��");
				}
				else if(com == 2) {
					System.out.println("�¸�");
				}
				else if(com == 3) {
					System.out.println("���º�");
				}
			}
	}
}