package C3_���ǹ�3_������Ʈ;

import java.util.Random;

public class ���ǹ�3_������Ʈ_������_���� {
	/*
	 * [����]
	 * 
	 *  [���� ���߱�]
	 *  
	 * 	�̹��� 1���� �������̶�� �Ҷ�, 
	 *  �������� 1~31�� �����ϰ� �ش� ���� ����Ѵ�. 
	 *  
	 *  ��) 3�� ==> �ݿ���
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		int date = ran.nextInt(31) + 1;
		if(date%7==1) {
			System.out.println(date + "���� �������Դϴ�.");
		}
		if(date%7==2) {
			System.out.println(date + "���� ������Դϴ�.");
		}
		if(date%7==3) {
			System.out.println(date + "���� �ݿ����Դϴ�.");
		}
		if(date%7==4) {
			System.out.println(date + "���� ������Դϴ�.");
		}
		if(date%7==5) {
			System.out.println(date + "���� �Ͽ����Դϴ�.");
		}
		if(date%7==6) {
			System.out.println(date + "���� �������Դϴ�.");
		}
		if(date%7==0) {
			System.out.println(date + "���� ȭ�����Դϴ�.");
		}
		long a = System.currentTimeMillis();
		System.out.println(a); // 1970��1��1�� 0�ʺ��� ���ݱ��� �� �� 
	}
}