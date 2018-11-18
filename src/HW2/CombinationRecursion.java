package HW2;

import java.util.Scanner;

public class CombinationRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入兩個數字n,m，求組合");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("n=");
		int a = sc1.nextInt();
		System.out.print("m=");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		System.out.println(combination(a, b));
	}
	private static int factorial(int n) {  
		if(n==1) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	     
	}  
	public static int combination(int n,int m) {
		if(n==0||m==0||n==m) {
			return 1;
		}else {
			return factorial(n)/factorial(n-m)/factorial(m);
		}
	}

}
