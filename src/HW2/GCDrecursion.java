package HW2;

import java.util.Scanner;

public class GCDrecursion {

	public static void main (String[] args) {
		
		System.out.println("請輸入兩個數字，求最大公因數");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		
		System.out.println("最大公因數為:"+gcd(a,b));
	}
	private static  int gcd (int a,int b){
		if(b ==0) {
			return a;
		}else {
			return gcd(b,a%b);
			
		}
		
	}
}
