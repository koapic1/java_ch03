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
		System.out.println("숫자 "+total+"개를 입력하시오.");
		for(int i=0;i<total;i++) {
			arr03[i] = scanner.nextInt();
			if(arr03[i] > max) {
				max = arr03[i]; 
			}
		}
		System.out.println(arr03[2]); // 세번째 수 출력하기....
		System.out.println(max); // 제일 큰 수 출력하기....
		//int arr03[10];
	}
	//정수 5개를 입력받아서 배열로 만들어 보기...
	//세번째꺼 출력하기...
}
