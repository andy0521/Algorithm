package Homework1;

import java.util.Scanner;

public class BinarySearch {
	int data[] = { 78, 60, 23, 12, 10, 5 };

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.showdata();
		bs.searchdata();
		// TODO Auto-generated method stub

	}

	void showdata() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			
		}
		System.out.println(" ");
	}

	void searchdata() {
		int num=0,end=data.length,start=0;
		System.out.println("請輸入要找到的數字(1-100),輸入-1離開");
		Scanner sc1 = new Scanner(System.in);
		 int search=sc1.nextInt();
		 int mid=(start+end)/2;
		while ( data[mid]!=num&&num!=-1){
			mid=(start+end)/2;
		 if(search==data[mid]) {
			 System.out.println("找到了，在第"+(mid+1)+"格找到"+search);
			 break;
		 }
		 if(search>data[mid]) {
			 end=mid-1;
			 
		 }else {
		 start=mid+1;
		}
		 if(start>end) {
			 System.out.println("not found");
			 num=-1;
			 break;
		 }
		 
		 
	}
}
}