package C1_���ǹ�1_�˰���;

import java.util.Scanner;

public class ���ǹ�1_�˰���_ȸ������_���� {
	/*
	 * [����]
	 * 
	 * 	[ȸ������ �� �α���] 
	 * 1. ���� ���̵�� ��й�ȣ�� �Է��ؼ� ȸ�������Ѵ�. 
	 * 2. ���� �α����� ���� �ٽ� ���̵�� ��й�ȣ�� �Է¹޴´�.
	 * 3. ���Ե� ���̵�� ��й�ȣ�� �α��ν� �Է��� ���̵�� ��й�ȣ�� ���Ѵ�.
	 * 4. "�α���" �Ǵ� "�α��ν���" �� ����ϼ���. 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ȸ������");
		System.out.print("���̵� �Է� : ");
		int join_id = scan.nextInt();
		System.out.print("��й�ȣ �Է� : ");
		int join_pw = scan.nextInt();
		
		System.out.println("�α���");
		System.out.print("���̵� �Է� : ");
		int log_id = scan.nextInt();
		System.out.print("��й�ȣ �Է� : ");
		int log_pw = scan.nextInt();
		
		if(join_id == log_id && join_pw == log_pw) {
			System.out.println("�α���");
		}
		if(join_id != log_id || join_pw != log_pw) {
			System.out.println("�α��ν���");
		}
	
		
	}
}