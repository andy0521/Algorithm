package HW2;

import java.util.Scanner;

public class AckermannRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入兩個數字n,m，求 Ackermann 函數");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("m=");
		int a = sc1.nextInt();
		System.out.print("n=");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		System.out.println(Ackermann(a, b));
	}
	private static int Ackermann(int m,int n) {
		if(m==0) {
			return n+1;
		}else {
			if(m>0&&n==0) {
				return Ackermann(m-1, 1); 
			}else {
			return Ackermann(m-1,Ackermann(m,n-1));
			}
			
		}
	}
}

