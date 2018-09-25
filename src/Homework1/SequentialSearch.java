package Homework1;

import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		 int i;
		 int data[] =new int [100];
			for (i=0;i<10;i++) {
				data [i]= (int )(Math.random()*100+1);
				System.out.print(data[i]+"、");
			}
		while (num !=-1) {
			int find =0;
		
		System.out.println("請輸入要找到的數字(1-100),輸入-1離開");
		Scanner sc1 = new Scanner(System.in);
		String line = sc1.nextLine();
		 num = Integer.parseInt(line);
	for (i=0;i<10;i++) {
		if (data[i]==num) {
			System.out.println("找到了!在第"+(i+1)+"個的位置");
			find++;
		}
		
	}
		if(find==0 &&num!=-1 ) {
			System.out.println("沒找到");
			
		}
		
		
		}
}}
	