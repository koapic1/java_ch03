package lecture;

import java.util.Scanner;

public class Continue {
	//정수 다섯개를 입력받아서 합 구하기....
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개를 입력하시면 양수의 합 만 구해드립니다. ");
		
		int sum = 0;
		for(int i=0;i<5;i++) {
			int num = scanner.nextInt();
			if(num<=0) continue; // break 는 반복문 블럭을 빠쪄나가기... // continue는 건너뛰기...
			sum+=num;
		}
		System.out.println(sum);
	}
}
