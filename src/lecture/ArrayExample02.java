package lecture;

import java.util.Scanner;

public class ArrayExample02 {
	
	//�迭�� 5��¥�� �迭�� �Է¹޾Ƽ� ����� ��� ����غ���.... 
	public static void main(String[] args) {
		int arr [] = new int[5];
		int sum = 0;
		int total = arr.length;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(total+"���� ������ �Է��Ͻÿ�");
		for(int i=0;i<total;i++) {
			arr[i] = scanner.nextInt();
		}
//		for(int j=0;j<total;j++) {
//			sum+=arr[j];
//		}
		for(int item : arr) {  // forEach
			sum+=item;
		}
		avg = sum/total;
		System.out.println("����� "+avg);
		scanner.close();
		
		String fruits[] = {"apple","orange","banana","kiwi"};
		for(String item : fruits) {
			System.out.print(item+"==");
		}
	}
}



