package C4_���ǹ�4_������Ʈ;

import java.util.Scanner;
import java.util.Random;

public class ���ǹ�3_������Ʈ_�����ڱ�ȣ_���� {
	/*
	 * [����]
	 * 
	 * 	[������ ��ȣ ���߱� ����]
	 * 1. 1~10 ������ ���� ���� 2���� a�� b�� ���� �����Ѵ�. ��) a = 3 , b = 4 
	 * 
	 * 2. 1~4 ������ ���� ���� 1���� op�� �����Ѵ�.  ��) op = 3
	 * 
	 * 3. op�� ����  ������ ��ȣ�� �ش�ȴ�. ��) op�ǰ��� 3�̸� ���ϱ� �̴�.
	 * 	  [1] + [2] - [3] * [4] % 
	 * 
	 * 4. ȭ�鿡 ���ڵΰ��� ���� ����Ѵ�.(��, ��ȣ�� ����ϸ�ȵȴ�.)
	 *    �׸��� �Ʒ� ������ ���⸦ ����Ѵ�.
	 * ��) 
	 * 		3 ? 4  = 12
	 *    	[1] + [2] - [3] * [4] % 
	 *    
	 * 5. ����ڴ� ��ȣ�� ���߸�ȴ�. ��) 3 ==> ����
	 *    
	 *  �ƽ��Ե� ���� ������ ���ü��ִ�. ������ �����Ұ����ϰ�, ���Ŀ� ���������ϴ�.  
	 *  
	 */
	
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int a = ran.nextInt(10)+1;
		int b = ran.nextInt(10)+1;
		int op = ran.nextInt(4)+1;
		int t=0;
		char c = ' ';
		if(op==1) {
			t=a+b;
			c='+';
		}
		if(op==2) {
			t=a-b;
			c='-';
		}
		if(op==3) {
			t=a*b;
			c='*';
		}
		if(op==4) {
			t=a%b;
			c='%';
		}
		
		System.out.printf("%d ? %d = %d\n",a,b,t);
		System.out.println("[1] + [2] - [3] * [4] %");
		int s = scan.nextInt();
		if(s>=1 && s<=4) {
			if(s==op) 
				System.out.println("����");
			else 
				System.out.println("����");
				
		}
		else 
			System.out.println("����");
		
		System.out.printf("%d %c %d = %d\n",a,c,b,t);
		
		
	}
}