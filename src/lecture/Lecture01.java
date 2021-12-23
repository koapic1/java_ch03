package lecture;

public class Lecture01 {

	public static void main(String[] args) {
		// System.out.println("Hello World");
		// int num= 10; , double = 10.0; , char= 'a', boolean, String = "fdsfds"
		int sum = 0;
		// 1+2+3+4+5+6+7+8+9+10 = 55;
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			sum = sum + i; // 1, 3, 6 , 10, 15, 21,
			System.out.print(i);
			if (i == 10) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
		}
		System.out.print(sum);
	}
}
