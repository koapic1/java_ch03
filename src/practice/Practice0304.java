package practice;

import java.util.Scanner;

public class Practice0304 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��� �ּ���.");
		String str = scanner.next();
		char ch =  str.charAt(0);
		//System.out.println(ch);
		for(char i = ch;i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
