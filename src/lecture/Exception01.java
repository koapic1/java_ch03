package lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�.");
		//int sum = 0;
		//int num = 0;
		int sum=0,num = 0;
		for(int i=0;i<3;i++) {
			System.out.println(i+">>");
			try {
				num= scanner.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��� �ּ���.");
				scanner.next();
				i--;
				continue;
			}
			sum+=num;
		}
		System.out.println("����==="+sum);
		scanner.close();
		//"30"   "5"
		System.out.println(Integer.parseInt("3.14"));
	}

}