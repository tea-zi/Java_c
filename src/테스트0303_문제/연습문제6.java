package 테스트0303_문제;

public class 연습문제6 {
	public static void main(String[] args) {
		/*
			거리문제		
			[1] 철수는 자전거를 타고 2시간에 65040 미터를 간다. 
				1시간에는 몇미터를 가는가?
				30분에는 몇미터를 가는가?
				10분에는 몇미터를 가는가?
				1분에는 몇미터를 가는가?
				1초에는 몇미터를 가는가?
				17초에는 몇미터를 가는가?
				
			[2]
				철수는 자전거를 타고 2시간에 65040 미터를 간다. 
				
				철수는 10000미터를 몇초에 가는가?
				철수는 1000 미터를 몇초에 가는가?
				철수는 1미터를 몇초에 가는가?
		 */
		int 한시간 = 65040/2;
		int 삼십분 = 한시간/2;
		int 십분 = 삼십분/3;
		int 일분 = 십분/10;
		int 일초 = 일분/60;
		int 십칠초 = 일초*17;
		System.out.println("한신간 : " + 한시간 + " 삼십분 : " + 삼십분 + " 십분 : " + 십분 + " 일분 : " + 일분 + " 일초 : " + 일초 + " 17초 : " +십칠초);
		
		double 만미터 = 10000.0/일초;
		double 천미터 = 1000.0/일초;
		double 일미터 = 1.0/일초;
		System.out.printf("10000미터 : %.2f , 1000미터 : %.2f , 1미터 : %.2f",만미터,천미터,일미터);
	}
}