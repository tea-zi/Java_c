package C2_���ǹ�2_�⺻�̷�;

public class ���ǹ�2_�⺻�̷�1_�����ǻ����ֱ�1 {
	/*
	 * ������ �����ֱ�(Scope)
	 * ������ �������� {}�߰�ȣ �ȿ��� �ۿ� �����Ѵ�. } ���� �߰�ȣ�� ������ �Ҹ��Ѵ�.
	 */

	public static void main(String[] args) {

		
		int x = 10;
		if (true) {
			int y = 20;
			System.out.println("x = " + x);
			System.out.println("y = " + y);

		} // y �� �Ҹ��ϴ� �ñ�
		//System.out.println("y = " + y); y�� ���� �����߻�
		System.out.println("x = " + x); // x�� ��밡�������� y�� ����Ҽ�����.
		// System.out.println("y = " + y);

	}// x�� �Ҹ��ϴ� �ñ�

}