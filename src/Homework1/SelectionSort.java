package Homework1;

import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

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
	
		for (int i=0;i<data.length-1;i++) {
			int min=i;
			for (int j=i+1;j<=data.length-1;j++) {
				if(data[min]>data[j]) {
				min=j;
				
				}
				
			}
			int temp =data[i];
			data[i]=data[min];
			data[min]=temp;
			System.out.print("第"+(i+1)+"次排序");
			for (int k=0;k<data.length;k++) {
				System.out.print(data[k]+" ");
			}
			System.out.println("");
		}
		
		
	}
}
