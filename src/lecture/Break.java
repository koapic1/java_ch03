package lecture;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String txt = scanner.next();  /// 이어진 글자만 인식
		while(true) {
			System.out.println(">>");
			String txt = scanner.nextLine();  /// 한줄 인식
			if(txt.equals("exit")) break;
		}
		System.out.println("종료합니다.");
		
		scanner.close();
//		int num = 10;
//		String txt = "장성호";
//		if(txt.equals("장성호")) {
//			
//		}
	}

}
