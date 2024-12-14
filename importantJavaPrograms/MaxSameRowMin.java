package importantJavaPrograms;

public class MaxSameRowMin {
//Find Maximum number from the row of minimum number in array 
	public static void main(String[] args) {        //  2   4   5
		int[][] abc = new int[3][3];                //  3   2   10
		abc[0][0] = 2;                              //  1   2   0
		abc[0][1] = 4;                              
		abc[0][2] = 5;
		abc[1][0] = 3;
		abc[1][1] = 2;      //int[][] abc ={‌{2,4,5},{3,2,10},{1,2,0}};
		abc[1][1] = 10;
		abc[2][0] = 1;
		abc[2][1] = 2;
		abc[2][2] = 0;
		int min = abc[0][0];
		int mincoloumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min)// 2
				{
					min = abc[i][j];
					mincoloumn = j;
					System.out.println(min);
				}
			} }
		int max = abc[0][mincoloumn];
		int k = 0;
		while (k < 3) {
			if (abc[k][mincoloumn] > max) {
				max = abc[k][mincoloumn];
			}
			k++; }
System.out.println(max);
	}
}