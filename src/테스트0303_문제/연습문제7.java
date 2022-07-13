package 테스트0303_문제;

public class 연습문제7 {
	public static void main(String[] args) {
		/*
			거리문제
			[1] 철수는 시속 3km 의 속도로 37분간 걸어갔다. 
			    철수가 간거리는 몇km 인가?
			    철수가 간거리는 몇m 인가?
			    
			[2] 철수는 870미터를 40분간 걸어갔다. 
				철수의 시속은 얼마인가?
				철수의 분속은 얼마인가?
		 */
		int 시속 = 3;
		double 초 = 37/60.0;
		double km = 시속*초;
		double m = km*1000;
		System.out.println(km + " " + m);
		
		int 분속 = 870/40;
		int 시 = 분속*60;
		System.out.println(분속 +" " + 시);
	}
}