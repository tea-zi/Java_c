package C3_���ǹ�3_�⺻�̷�;
public class ���ǹ�3_�⺻�̷�5_else������ {
	/*
	  	[else ���� ��������.]		  			  			  	
	  	else ��  �ٷ� ���� if �� ����Ǳ� ������ 
	  	������ �������ΰ�� �ùٸ��� �۵������ʴ´�. 			
		------------------------------------------------------		
		�Ʒ� ������ "���Ǳ�" �����̴�.
		1~3���� �Է��ϸ� �ֹ��� ����ǰ� 
		1~3�� ������ �ٸ���ȣ�� �Է��ϸ� "����" �� ��� �ϱ����� �ۼ��Ͽ�����
		else �� if �Ѱ��� ����Ǳ⶧���� ����� �̻��ϰԳ��´�. 	
	 */		
	public static void main(String[] args) {
		
		/*
		 * �Ʒ��� ������ �߻���Ų��.
		 */
		System.out.println("���Ǳ� : [1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		int select = 1;
		System.out.println("������ ��ȣ : " + select);
		if(select == 1) { System.out.println("1.����");}
		if(select == 2) { System.out.println("2.�����");}
		if(select == 3) { System.out.println("3.���");}
		else {System.out.println("[����]");} 
		
		System.out.println("-----------------------------------------");
		/*
		 *  �Ʒ��� ���� ����� ��Ȯ�� �۵��Ѵ�. 
		 */
		System.out.println("���Ǳ� : [1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		select = 1;
		System.out.println("������ ��ȣ : " + select);
		if(select == 1) { System.out.println("1.����");}
		if(select == 2) { System.out.println("2.�����");}
		if(select == 3) { System.out.println("3.���");}
		if(select < 1 || select > 3) {System.out.println("[����]");} 
		
		System.out.println("-----------------------------------------");
		/*
		 *  �Ʒ��� ���� ����� ��Ȯ�� �۵��Ѵ�. 
		 */
		System.out.println("���Ǳ� : [1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		select = 3;
		System.out.println("������ ��ȣ : " + select);
		if(select == 1) { System.out.println("1.����");}
		else if(select == 2) { System.out.println("2.�����");}
		else if(select == 3) { System.out.println("3.���");}
		else {System.out.println("[����]");}
	}
}