package C2_조건문2_프로젝트;

import java.util.Scanner;

public class 조건문2_프로젝트_택시요금_문제 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		/*
		 * [문제]
			택시기본요금은 10000원입니다.
			기본요금으로는  10km 까지 이동 가능합니다. 
			10km이상 이동시 추가요금이 발생합니다. 
			추가요금은 3km이동할때마다 2300원씩 요금이 추가됩니다.
			이동거리를 입력받고 요금출력하시오.
		 */
		int n = 10000;
		int c =2300;
		int t;
		
		System.out.print("이동거리를 입력하시오. : ");
		int l = scan.nextInt();
		
		if(l<=10) {
			System.out.println("요금 : " + n);
		}
		if(l>10) {
			t = l-10;
			int s = t/3;
			System.out.println("요금 : " + (t/3*c+n));
			//위출력은 추가요금 발생시 3km가 넘지않으면 요금을 받지않는 계산
			if(t%3>0) {
				s = s+1;
				System.out.println("요금 : " + (s*c+n));
				//위출력은 추가요금 발생시 3km를 다 채우지않아도 추가요금발생
			}
		}
		
	
	}
}