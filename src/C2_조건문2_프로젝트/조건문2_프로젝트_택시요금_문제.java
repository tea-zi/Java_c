package C2_���ǹ�2_������Ʈ;

import java.util.Scanner;

public class ���ǹ�2_������Ʈ_�ýÿ��_���� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		/*
		 * [����]
			�ýñ⺻����� 10000���Դϴ�.
			�⺻������δ�  10km ���� �̵� �����մϴ�. 
			10km�̻� �̵��� �߰������ �߻��մϴ�. 
			�߰������ 3km�̵��Ҷ����� 2300���� ����� �߰��˴ϴ�.
			�̵��Ÿ��� �Է¹ް� �������Ͻÿ�.
		 */
		int n = 10000;
		int c =2300;
		int t;
		
		System.out.print("�̵��Ÿ��� �Է��Ͻÿ�. : ");
		int l = scan.nextInt();
		
		if(l<=10) {
			System.out.println("��� : " + n);
		}
		if(l>10) {
			t = l-10;
			int s = t/3;
			System.out.println("��� : " + (t/3*c+n));
			//������� �߰���� �߻��� 3km�� ���������� ����� �����ʴ� ���
			if(t%3>0) {
				s = s+1;
				System.out.println("��� : " + (s*c+n));
				//������� �߰���� �߻��� 3km�� �� ä�����ʾƵ� �߰���ݹ߻�
			}
		}
		
	
	}
}