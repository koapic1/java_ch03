package lecture;

import java.util.Scanner;

public class DivideZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		int dividor;
		System.out.println("���ڸ� �Է��ϼ���.");
		num = scanner.nextInt();
		System.out.println("� ���� ����� �����");
		dividor = scanner.nextInt();
		try {
			System.out.println(num+"�� "+dividor+"�� ������ "+ num/dividor+"�Դϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			System.out.println(num+"�� "+dividor+"�� ������ "+ num/dividor+"�Դϴ�.");
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ���� ���� �����.");
//		}
		scanner.close();
	}

}
