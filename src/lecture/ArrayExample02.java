package lecture;

import java.util.Scanner;

public class ArrayExample02 {
	
	//배열을 5개짜리 배열을 입력받아서 만들고 평균 출력해보기.... 
	public static void main(String[] args) {
		int arr [] = new int[5];
		int sum = 0;
		int total = arr.length;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(total+"개의 점수를 입력하시오");
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
		System.out.println("평균은 "+avg);
		scanner.close();
		
		String fruits[] = {"apple","orange","banana","kiwi"};
		for(String item : fruits) {
			System.out.print(item+"==");
		}
	}
}



