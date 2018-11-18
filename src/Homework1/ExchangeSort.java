package Homework1;

public class ExchangeSort {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			int data[] = { 90, 5, 16, 31, 77, 13};
			
			for (int i=0; i<data.length-1; i++){
				for (int j=i+1; j<data.length; j++){
		
					if (data[i] > data[j]){
						int tmp = data[i];
						data[i] = data[j];
						data[j] = tmp;
					}
				}
			}
			for (int i=0;i<data.length;i++){
				System.out.print(data[i] + " ");
			}
		}
	
	}

