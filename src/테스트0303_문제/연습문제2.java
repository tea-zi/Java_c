package 테스트0303_문제;

public class 연습문제2 {
	public static void main(String[] args) {
		/*
			시간 테스트 
				[1] 4000초 의 시간을 제외한 분에서  8000초의 시간을 제외한 분을 뺀값을 구하시오.			
				[2] 4567초의 시간을 제외한 분이 30분이상이면 "크다" 30분미만이면 "작다" 출력			
		 */
		System.out.println(4000%3600/60 - 8000%3600/60);
		if(4567%3600/60 >= 30) {
			System.out.println("크다");
		}
		else {
			System.out.println("작다");
		}
	}
}