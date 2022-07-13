package C3_조건문3_프로젝트;

import java.util.Random;

public class 조건문3_프로젝트_모두의마블_문제 {
	/*
		[문제]
		
		[모두의마블게임] 
		
		 - 철수는 지금 모두의마블게임을 하고있다.
		 - 게임은 0 ~ 20까지 이동할수있는거리가있다.
		 - 지금 철수의 차례이고 , 현재의 위치는 
		 - 시작점으로부터  9 만큼 이동했다.		 
		 - 1 ~ 6의 눈금이 있는 주사위 2개를 던진다.
		 - 주사위 숫자의  합만큼 이동한다. 
		 - 다음 이동할 철수의 위치를 출력하시오.
	
		 [조건]
		 1) 두 주사위 숫자가 서로다를경우는 현재위치에서
		 		주사위숫자 합만큼 이동한다. 예) 3, 5 ==> 8 만큼이동한다.
	
		 2) 두 주사위 숫자가 같은경우 보너스 이동거리 6 추가한다.
		      예) 2 , 2  ==> 4 + 6 만큼이동한다.
	
		 3) 14,15,16 번의 위치에 함정이 있다. 
			  함정에 걸리면 주사위2개를 다시 던지고 
			  그합이 6이하이면 [패널티] 처음위치(0)로 이동한다.
	          그합이 7이상이면 함정탈출[패널티없음]
	
		 4) 20 이상의 값이 나오면 "승리" 를 출력한다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		
		int a = ran.nextInt(6) +1;
		int b = ran.nextInt(6) +1;
		System.out.printf("주사위의 눈금 : %d, %d\n",a,b);
		int sum;
		int 철수위치 = 9;
		if(a==b) {
			sum = a+b+6;
			System.out.printf("주사위 눈금의 합 : %d\n",sum);
		}
		else {
			sum = a+b;
			System.out.printf("주사위 눈금의 합 : %d\n",sum);
		}
		int 철수이동 = sum+철수위치;
		if(철수이동>=14 && 철수이동<=16) {
			System.out.println("함정에 빠졌습니다. 주사위를 다시 굴리세요.");
			a = ran.nextInt(6) +1;
			b = ran.nextInt(6) +1;
			System.out.printf("주사위의 눈금 : %d, %d\n",a,b);
			sum = a+b;
			System.out.printf("주사위 눈금의 합 : %d\n",sum);
			if(sum>=7) {
				System.out.println("함정탈출");
			}
			else {
				System.out.println("패널티 처음위치로");
				철수이동 = 0;
			}
		}
		System.out.printf("철수의 현위치 : %d\n",철수이동);
		if(철수이동>=20) {
			System.out.println("승리\n");
		}
			
		
	}
}