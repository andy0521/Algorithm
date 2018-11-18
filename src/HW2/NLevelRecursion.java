package HW2;

import java.util.Scanner;

public class NLevelRecursion {
		
		public static void main(String[] args) 
	  {
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
	    System.out.println(num+"! = " + factorial(num));
	  }
	 
	   private static int factorial(int n){
	    if (n == 1)  {  
	      return 1;
	    } else {
	      return n * factorial(n -1 );
	      
	      
	    }
	  }
	}

