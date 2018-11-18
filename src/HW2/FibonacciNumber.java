package HW2;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入數字，求費氏級數");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		System.out.println(Fibonac(num));
	}
	private static int Fibonac(int n) {
		if (n==1||n==0) {
			return n;
		}else {
			return Fibonac(n-1)+Fibonac(n-2);
			
		}
		
		
	
	}

}
