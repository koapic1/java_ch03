package lecture;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[] = new int[10];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 17;
		arr[3] = 32;
		arr[4] = 80;
		System.out.println(arr[1]);
		int arr02[] = {1,2,3,100,5,6,7};
		System.out.println(arr02[3]);
		
		Scanner scanner = new Scanner(System.in);
		int arr03 [] = new int[5];
		int total = arr03.length;
		int max = 0;
		System.out.println("���� "+total+"���� �Է��Ͻÿ�.");
		for(int i=0;i<total;i++) {
			arr03[i] = scanner.nextInt();
			if(arr03[i] > max) {
				max = arr03[i]; 
			}
		}
		System.out.println(arr03[2]); // ����° �� ����ϱ�....
		System.out.println(max); // ���� ū �� ����ϱ�....
		//int arr03[10];
	}
	//���� 5���� �Է¹޾Ƽ� �迭�� ����� ����...
	//����°�� ����ϱ�...
}
