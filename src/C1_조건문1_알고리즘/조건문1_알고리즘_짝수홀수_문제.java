package C1_���ǹ�1_�˰���;

import	java.util.Scanner;

public class ���ǹ�1_�˰���_¦��Ȧ��_���� {
	/*
	 * [����] 
	 * 
	 * 	int a ������ ���ڸ� �Է¹ް� "¦��" "Ȧ��" �� ����Ͻÿ�.
	 * 
	 *  ��)
	 *  (1) ���ڸ� �Է� : 
	 *  (2) ¦��
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		int a = scan.nextInt();
		
		if(a%2==0) {
			System.out.println("¦��");
		}
		if(a%2!=0) {
			System.out.println("Ȧ��");
		}

	}
}