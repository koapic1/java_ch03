package practice;

import java.util.Scanner;

public class Practice0306 {

	public static void main(String[] args) {
		int unit[] = {50000,10000,5000,1000,500,50,10,1};
		Scanner  scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오.");
		int money = scanner.nextInt();
		for(int i=0;i<unit.length;i++) {
			int rest = money/unit[i];
			if(rest>0) {
				System.out.println(unit[i] +"원 짜리는 "+rest+" 개");
				money=money%unit[i];
			}
		}
	}
}
