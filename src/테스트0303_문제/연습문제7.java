package �׽�Ʈ0303_����;

public class ��������7 {
	public static void main(String[] args) {
		/*
			�Ÿ�����
			[1] ö���� �ü� 3km �� �ӵ��� 37�а� �ɾ��. 
			    ö���� ���Ÿ��� ��km �ΰ�?
			    ö���� ���Ÿ��� ��m �ΰ�?
			    
			[2] ö���� 870���͸� 40�а� �ɾ��. 
				ö���� �ü��� ���ΰ�?
				ö���� �м��� ���ΰ�?
		 */
		int �ü� = 3;
		double �� = 37/60.0;
		double km = �ü�*��;
		double m = km*1000;
		System.out.println(km + " " + m);
		
		int �м� = 870/40;
		int �� = �м�*60;
		System.out.println(�м� +" " + ��);
	}
}