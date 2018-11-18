package HW2;

public class RandomSort {
	
	 public static void randomsort(String[] array) {
		for(int i=0;i<array.length;i++) {
		int s=(int)(Math.random()*(array.length));
		String temp=array[s];
		array[s]=array[i];
		array[i]=temp;
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] array= {"5", "4", "9", "11","13"}; 	
	RandomSort.randomsort(array);
	for (int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	}

}
