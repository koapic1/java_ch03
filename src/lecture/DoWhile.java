package lecture;

public class DoWhile {

	public static void main(String[] args) {
		//a~z
		char ch = 'a';
		do {
			//System.out.println("���� dowhile�Դϴ�. �켱 �ѹ� �����մϴ�. �׸��� ������ ������ �ݺ����� �����մϴ�.");
			System.out.print(ch);
			ch = (char)(ch+1);
		} while(ch <= 'z');
	}
}
