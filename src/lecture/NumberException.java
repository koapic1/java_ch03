package lecture;

public class NumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum[] = {"23","12","3.14","100"};
		//3.14�� ������ �߻����� �ʵ��� try catch �� ó���غ���
		int i=0;
		try {
			for(i=0;i<strNum.length;i++) {
				int num = Integer.parseInt(strNum[i]);
				System.out.println("���ڷ� �ٲ� ����=="+num);
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(strNum[i]+"�� ������ ��ȯ�� ���� �ʽ��ϴ�.");
			//e.printStackTrace();
		}
	}

}
