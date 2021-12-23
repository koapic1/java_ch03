package lecture;

public class NumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum[] = {"23","12","3.14","100"};
		//3.14가 오류가 발생하지 않도록 try catch 로 처리해보기
		int i=0;
		try {
			for(i=0;i<strNum.length;i++) {
				int num = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 바뀐 값은=="+num);
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(strNum[i]+"는 정수로 변환이 되지 않습니다.");
			//e.printStackTrace();
		}
	}

}
