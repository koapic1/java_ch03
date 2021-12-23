package lecture;

public class ArrayExample03 {

	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		int arr02[][] = {{10,20,30},{100,200,300}};
		
		System.out.println(arr02[0][1]);
		arr[0][0]=100;
		arr[0][1]=200;
		arr[0][2]=300;
		
		arr[1][0]=2000;
		arr[1][1]=3000;
		arr[1][2]=4000;
		
		//System.out.println(arr[0][0]);
		//System.out.println(arr[0][1]);
		//System.out.println(arr[0][2]);
		
		double score[][] = {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
		double sum = 0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];
			}
		}
		System.out.println(sum/(score.length*score[0].length));
		// 졸업 평점
		
		int stepArray[][];
		stepArray= new int[4][];
		stepArray[0] = new int[1];
		stepArray[1] = new int[2];
		stepArray[2] = new int[3];
		stepArray[3] = new int[4];
		
		stepArray[0][0] =0;
		stepArray[1][0] =1;
		stepArray[1][1] =2;
		stepArray[2][0] =3;
		stepArray[2][1] =4;
		stepArray[2][2] =5;
		stepArray[3][0] =6;
		stepArray[3][1] =7;
		stepArray[3][2] =8;
		stepArray[3][3] =9;
		
		
		int stepArray02[][] = {{0},{1,2},{3,4,5},{6,7,8,9}};
		for(int i=0;i<stepArray02.length;i++) {
			for(int j=0;j<stepArray02[i].length;j++) {
				System.out.print(stepArray02[i][j]+",");
			}
			System.out.println();
		}
		//만들어서
		
//		10,11,12
//		20,21
//		30,31,32
//		40,41
		int irregualArray[][] = new int[4][];
		irregualArray[0] = new int[3];
		irregualArray[1] = new int[2];
		irregualArray[2] = new int[3];
		irregualArray[3] = new int[2];
		
		for(int i=0;i<irregualArray.length;i++) {
			for(int j=0;j<irregualArray[i].length;j++) {
				irregualArray[i][j] = (i+1)*10+j;
			}
		}
		for(int i=0;i<irregualArray.length;i++) {
			for(int j=0;j<irregualArray[i].length;j++) {
				System.out.print(irregualArray[i][j]+",");
			}
			System.out.println();
		}
	}
}




