package Homework1;

public class TwoDimensionalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		int array2[][] = { { 5, 8, 9 }, { 6, 5, 4 }, { 4, 5, 6 } };
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++)
				System.out.print(array1[i][j] + " ");
			System.out.println();
		}
		System.out.println(" ");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++)
				System.out.print(array2[i][j] + " ");
			System.out.println("\t ");
		}

		System.out.println();

		int array3[][] = new int[array1.length][array2.length];
		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2[0].length; j++) {
				int tmp = 0;
				for (int k = 0; k < array2.length; k++) {
					tmp += array1[i][k] * array2[k][j];

				}
				array3[i][j] = tmp;

			}
		}

		System.out.println("相乘後");
		for (int i = 0; i < array1.length; i++) {

			{
				for (int j = 0; j < array2[0].length; j++) {
					System.out.print(array3[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
	}
}
