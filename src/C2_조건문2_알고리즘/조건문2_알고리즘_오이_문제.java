package C2_���ǹ�2_�˰���;


public class ���ǹ�2_�˰���_����_���� {
	/*
  	[����]
  	
  	 	 ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǹ��Ѵ�.
	 	 ���̰� 14�� �ʿ��ϴ�. 
	 	 �ʿ��� �ݾ��� ����Ͻÿ�.
	 	 ��, ���̴� �������θ� �Ǹ��Ѵ�.

 */
	public static void main(String[] args) {
		int o = 3;
		int me = 14;
		
		int s = me/o;
		if(me%o>0) {
			s=s+1;
		}
		System.out.println(s*1500);
		
		
		
	}
}