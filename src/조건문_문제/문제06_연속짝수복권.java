package ���ǹ�_����;
import java.util.Random;
/*
	[�н���ǥ]
		������ Ȱ���ؼ� ���ǹ��� �н��Ѵ�.
	[����]
	[����¦������]
		100~900 ������ �������ڸ� ����Ѵ�. 
		���ڸ��� ���ڸ� ���� ���ڸ��� �и��Ѵ�.		
	[��Ģ]
		[1] ���ڸ���� ¦���̸� "1��"�� ����Ѵ�.
		[2] ���ڸ��� ¦���̰�, ¦���μ��ڰ� �����̸� "2��"�� ����Ѵ�. 
		[3] �׿ܴ� "��"�� ����Ѵ�. 
		[4] ��, 0�� ¦���̴�.
	[����]
		462 : 4,6,2 ���ڸ� ��� ¦���̹Ƿ� "1��"
		245 : 2,4,5 ���ڸ��� ¦���̰� 2,4�����̹Ƿ� "2��"
		456 : 4,5,6 ���ڸ��� ¦�������� ������ �ƴϹǷ� "��"
		782 : 7,8,2 ���ڸ��� ¦���̰� 8,2�����̹Ƿ� "2��" 	
*/
public class ����06_����¦������ {
	public static void main(String[] args) {	
		Random ran = new Random();
		int r = ran.nextInt(801)+100;
		System.out.println(r);
		int hun = r/100;
		int ten = r%100/10;
		int one = r%10;
		int count = 0;
		if(hun%2 == 0) {
			count++;
		}
		if(ten%2 == 0) {
			count++;
		}
		else if(ten%2 != 0) {
			count = 0;
		}
		if(one%2 == 0) {
			count++;
		}
		
		if(count == 3) {
			System.out.println("1��");
		}
		else if(count == 2) {
			System.out.println("2��");
		}
		else {
			System.out.println("��");
		}
	}
}