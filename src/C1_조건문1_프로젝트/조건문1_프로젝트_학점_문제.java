package C1_���ǹ�1_������Ʈ;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_����_���� {
	/*
	 * [����]
	 * 
	 * 	[����]
	 * 	���������� �Է¹޴´�. 
	 * 	���������� �ش��ϴ� ������ ����Ͻÿ�.
	 * 	�Ʒ��� ����ǥ�̴�.
	 * 		100~91 �̸� A����,
	 * 		90~81  �̸� B����,
	 * 		80���ϴ� "�����"
	 * 		
	 * 		��, �����̰ų�, A������ B������ ���� �ڸ��� 7���̻��̸� + �߰��Ͻÿ�.
	 * 		A������ B������ ���� �ڸ��� 3�������̸� - �߰��Ͻÿ�.
	 * 
	 * 	��) 
	 * 		100 => A+
	 *     	87 ==> B+
	 *     	82 ==> B-
	 *     	23 ==> �����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���������� �Է� : ");
		int a = scan.nextInt();
		
		if(a>=97 && a<=100) {
			System.out.println("A+");
		}
		if(a>93 && a<97) {
			System.out.println("A");
		}
		if(a>90 && a<94) {
			System.out.println("A-");
		}
		if(a>=87 && a<=90) {
			System.out.println("B+");
		}
		if(a>83 && a<87) {
			System.out.println("B");
		}
		if(a>80 && a<84) {
			System.out.println("B-");
		}
		if(a<=80) {
			System.out.println("�����");
		}
	

	}
}