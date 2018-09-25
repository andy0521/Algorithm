package Homework1;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	int data[] = { 10, 60, 5, 78, 12, 23 };

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		// TODO Auto-generated method stub

		System.out.print("未排序前:");
		s.showdata();
		System.out.println("");
		s.changedata();
	}

	 void showdata() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}
	void changedata() {
		int tmp;
		for (int i=0;i<data.length;i++) {
			for (int j=i+1;j<data.length;j++) {
				if(data[i]<data[j]) {
				tmp=data[i];
				data[i]=data [j];
				data[j]=tmp;
				}
			}
			System.out.print("第"+(i+1)+"次排序");
			for (int k=0;k<data.length;k++) {
				System.out.print(data[k]+" ");
			}
			System.out.println("");
		}
		
		
	}
}
