package C1_���ǹ�1_�˰���;

import java.util.Scanner;

public class ���ǹ�1_�˰���_��ū����_���� {
	/*
	 *  [����] 
	 *  
	 *  	���� 2���� �Է¹ް� ��ū������ ���� ����Ͻÿ�.
	 *  
	 *  (1) ����1�� �Է� : 
	 *  (2) ����2�� �Է� : 
	 *  (3) ��ū���ڴ� ? �Դϴ�.
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����1 �Է� : ");
		int a = scan.nextInt();
		System.out.println("����2 �Է� : ");
		int b = scan.nextInt();
		System.out.print("��ū���� : ");
		if(a>b) {
			System.out.println(a);
		}
		if(b>a) {
			System.out.println(b);
		}
		
		
	}
}