package C4_���ǹ�4_�˰�����;

import java.util.Scanner;
import java.util.Random;

public class ���ǹ�4_�˰�����_Ȧ¦����_����2 {
	/*
	 * [����]
	 * 
	 * 	[Ȧ¦ ����]
	 * 
	 * 1. 1~10���� ������ �������� �Ѱ��� ���ڸ� �����Ѵ�.
	 * 2. ������ ���ڰ� [1.Ȧ��][2.¦��] ���� ���ߴ°����̴�.
	 */		
	public static void main(String[] args) {		
	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int a;
		int b;
		int num = ran.nextInt(10) +1;
		System.out.println("[Ȧ¦ ����]");
		System.out.println("[1.Ȧ��] [2.¦��]");
		int me = scan.nextInt();
		a = num%2;
		if(a==0) {
			if(me==1) {
				System.out.println("����");
			}
			else if(me==2) {
				System.out.println("����");
			}
			else
				System.out.println("����");
			System.out.println(num+ " : ¦��");
		}
		else if(a!=0) {
			if(me==1) {
				System.out.println("����");
			}
			else if(me==2) {
				System.out.println("����");
			}
			else
				System.out.println("����");
			System.out.println(num+ " : Ȧ��");
		}

	}
}