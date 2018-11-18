package HW2;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,min,max;
	      int a[]={88,45,25,47,98}; 

	      min=max=a[0];
	      System.out.print("陣列數值為 ");
	      for(i=0;i< a.length;i++)
	      {
	         System.out.print(a[i]+"  ");
	         if(a[i]> max)           
	            max=a[i];
	         if(a[i]< min)            
	            min=a[i];
	      }
	      System.out.println("");
	      System.out.println("Max is "+max); 
	      System.out.println("Min is "+min);    
	   }
	}


