package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_�ִ밪_���� {

	/*
	 * [����]
	 *	�ִ밪 ���ϱ�
	 * 1. ���� 3���� �Է¹޴´�.
	 * 2. �Է¹��� 3���� ���� ���Ѵ�.
	 * 3. ���� ū ��(MAX)�� ����Ѵ�.
	 */
	public static void main(String[] args) {		
			
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("�����Է� : ");
		a = scan.nextInt();
		System.out.print("�����Է� : ");
		b = scan.nextInt();
		System.out.print("�����Է� : ");
		c = scan.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("MAX �� : " + a);
			}
			if(a==c) {
				System.out.println("MAX �� : " + a + c);
			}
			if(a<c) {
				System.out.println("MAX �� : " + c);
			}
		}
		if(a==b) {
			if(a>c) {
				System.out.println("MAX �� : " + a + b);
			}
			if(a==c) {
				System.out.println("MAX �� : " + a + b + c);
			}
			if(a<c) {
				System.out.println("MAX �� : " + c);
			}
		}
		if(a<b) {
			if(b>c) {
				System.out.println("MAX �� : " + b);
			}
			if(b==c) {
				System.out.println("MAX �� : " + b + c);
			}
			if(b<c) {
				System.out.println("MAX �� : " + c);
			}
		}
		
		int max = a;
		if(max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}
		System.out.println("max = " + max);
	}
}