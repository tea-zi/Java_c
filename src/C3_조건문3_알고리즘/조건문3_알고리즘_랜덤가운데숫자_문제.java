package C3_���ǹ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_�˰���_�����������_���� {
	/*
	 * [����]
	 * 
	 * 	[��� ���� ���߱� ����]
	 * 
	 * 1. 150~250 ������ ���� ���� �����Ѵ�.
	 * 2. ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�.
	 * ��)
	 * 		249		: 4
	 */
	public static void main(String[] args) {	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(101) +150;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		int b = num%100/10;
		
		if(a==b) {
			System.out.println(num + " : " + a);
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�");
		}
	
		
	}
}