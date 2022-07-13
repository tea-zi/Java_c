package C2_조건문2_알고리즘;


public class 조건문2_알고리즘_오이_문제 {
	/*
  	[문제]
  	
  	 	 마트에서 오이를 3개씩 묶어서 1500원에 판매한다.
	 	 오이가 14개 필요하다. 
	 	 필요한 금액을 출력하시오.
	 	 단, 오이는 묶음으로만 판매한다.

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