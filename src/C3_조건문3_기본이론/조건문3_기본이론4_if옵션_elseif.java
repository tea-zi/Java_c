package C3_���ǹ�3_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�3_�⺻�̷�4_if�ɼ�_elseif {
	/*	  
	      if ���� �ɼ�  (2) else if 		  	  		  	  
	  	  if �� ������ ��Ȯ�� �ڵ带 ©��������,
	  	  else if ����ϸ�   ���ǹ��� ������ �������ΰ�� ����
	  	   ȿ�������� �ڵ带 �ۼ��Ҽ��ִ�.		  	  		  	 
	  	 --------------------------------------------		 
	  	  if(���ǽ�1){
		 		���ǽ�1�� ��(true)�� ��, ������ ����;
		  }else if(���ǽ�2){
		  		���ǽ�2�� ��(true)�� ��, ������ ����;
		  }else if(���ǽ�3){
		  		���ǽ�3�� ��(true)�� ��, ������ ����;
		  }else{
		  		�� ������ ��� �������� ���� ��, ������ ����;
		  }			 		
	 */		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 	if ���� else if 2�� �� ���� else ���� ���� �ϳ��ι��δ�. 
		 * 	else�� ��������� �����̵Ǹ� �۵��Ѵ�. 	
		 */	
		System.out.println("1.��� 2.���� 3.��");
		int  select = scan.nextInt();
		System.out.println("������ ��ȣ : " + select);
		if(select == 1) 	 { System.out.println("1.���");}
		else if(select == 2) { System.out.println("2.����");}
		else if(select == 3) { System.out.println("3.��");}
		else {System.out.println("����1");}
		//============================================
		System.out.println("���Ǳ� : [1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		select = scan.nextInt();
		System.out.println("������ ��ȣ : " + select);
		if(select == 1) { System.out.println("1.����");}
		if(select == 2) { System.out.println("2.�����");}
		if(select == 3) { System.out.println("3.���");}
		if(select < 1 || select > 3) {System.out.println("[����]");}
	}
}