package �׽�Ʈ0303_����;

public class ��������2 {
	public static void main(String[] args) {
		/*
			�ð� �׽�Ʈ 
				[1] 4000�� �� �ð��� ������ �п���  8000���� �ð��� ������ ���� ������ ���Ͻÿ�.			
				[2] 4567���� �ð��� ������ ���� 30���̻��̸� "ũ��" 30�й̸��̸� "�۴�" ���			
		 */
		System.out.println(4000%3600/60 - 8000%3600/60);
		if(4567%3600/60 >= 30) {
			System.out.println("ũ��");
		}
		else {
			System.out.println("�۴�");
		}
	}
}