package com;

import java.util.Scanner;

public class 二重循环输出图形 {

	/**
	 * 输出矩阵图形
	 */
	public static void main(String[] args) {
	   /*
	   for(int i=1;i<=5;i++)  //外层循环控制行
	   {
		   for(int j=1;j<=5;j++)  //内层循环控制列
		   {
		    System.out.print("*");  //单元格内容
		   }
		   System.out.println("");  //换行
	   }*/
		
		
		/*输出直角三形*/
		 /*for(int i=1;i<=4;i++)  //外层循环控制行
		   {
			   for(int j=1;j<=2*i-1;j++)  //内层循环控制列
			   {
			    System.out.print("*");  //单元格内容
			   }
			   System.out.println("");  //换行
		   }*/
		
		 
		 /*输出倒三角*/
		 /*for(int i=1;i<=5;i++){
			 for(int j=1;j<=6-i;j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }*/
	    Scanner input=new Scanner(System.in);
	    System.out.println("请输入行数:");
		int row=input.nextInt();  //5
		for(int i=1;i<=row;i++){  //行数
			//循环控制空格
			for(int j=1;j<=row-i;j++){
				System.out.print(" ");
			}
			
			//循环控制*号
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
