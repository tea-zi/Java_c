package 테스트0303_문제;

public class 연습문제1 {
	public static void main(String[] args) {
		/*
		 * 시간 테스트 
		 * 
		 * 4000 초를 시간만 출력하시오.
		 * 4000 초를 시간을 제외하고 초만 출력하시오.
		 * 4000 초를 시간을 제외하고 분만 출력하시오.
		 * 
		 * 8000 초를 시간만 출력하시오.
		 * 8000 초를 시간을 제외하고 초만 출력하시오.
		 * 8000 초를 시간을 제외하고 분만 출력하시오.
		 * 
		 * 
		 * 123123 초를 시간만 출력하시오.
		 * 123123 초를 시간을 제외하고 초만 출력하시오.
		 * 123123 초를 시간을 제외하고 분만 출력하시오.
		 */
		System.out.println(4000/3600);
		System.out.println(4000%60);
		System.out.println(4000%3600/60);
		System.out.println("====================");
		System.out.println(8000/3600);
		System.out.println(8000%60);
		System.out.println(8000%3600/60);
		System.out.println("====================");
		System.out.println(123123/3600);
		System.out.println(123123%60);
		System.out.println(123123%3600/60);
	}
}