package 테스트0304_문제;
/*
	[설명]
		어느 농장에는 토끼와 오리가 모두 35마리가 있다. 
		토끼와 오리의 다리의 수의 합이 96개이다.		 
		토끼와 오리는 각각 몇마리 인지 구하시오. 
		주석으로 표현하시오.
*/
public class 논리연산자2_개념01_오리다리 {
	public static void main(String[] args) {
		/*
		 * a = 툐끼
		 * b = 오리
		 * 4*a + 2*b = 96
		 * a+b =35
		 * b = 35-a
		 * 4*a + 70 -2*a = 96
		 * 2*a = 26
		 * a = 13
		 * b = 22
		 */
		int a = 13;
		int b = 22;
		System.out.println(4*a + 2*b == 96 &&  a+b == 35);
	}
}