package practice;

import java.util.Scanner;

public class Practice0303 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϸ� ���� ��� �帳�ϴ�.");
		int num = scanner.nextInt();
		//5
//		for(int i = num;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 0;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
