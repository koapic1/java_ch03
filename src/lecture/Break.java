package lecture;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String txt = scanner.next();  /// �̾��� ���ڸ� �ν�
		while(true) {
			System.out.println(">>");
			String txt = scanner.nextLine();  /// ���� �ν�
			if(txt.equals("exit")) break;
		}
		System.out.println("�����մϴ�.");
		
		scanner.close();
//		int num = 10;
//		String txt = "�强ȣ";
//		if(txt.equals("�强ȣ")) {
//			
//		}
	}

}
