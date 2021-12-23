package practice;

import java.util.Scanner;

public class Practice0305 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner  scanner = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하시오.");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("입력받은 열개의 숫자 중에 3의 배수는===");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i]+"  ");
			}
		}
		scanner.close();
	}
}
