package lecture;

import java.util.Scanner;

public class Continue {
	//���� �ټ����� �Է¹޾Ƽ� �� ���ϱ�....
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 5���� �Է��Ͻø� ����� �� �� ���ص帳�ϴ�. ");
		
		int sum = 0;
		for(int i=0;i<5;i++) {
			int num = scanner.nextInt();
			if(num<=0) continue; // break �� �ݺ��� ���� ���ǳ�����... // continue�� �ǳʶٱ�...
			sum+=num;
		}
		System.out.println(sum);
	}
}
