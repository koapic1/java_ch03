package practice;

import java.util.Scanner;

public class Practice0305 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner  scanner = new Scanner(System.in);
		System.out.println("���� ���� 10���� �Է��Ͻÿ�.");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("�Է¹��� ������ ���� �߿� 3�� �����===");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i]+"  ");
			}
		}
		scanner.close();
	}
}
