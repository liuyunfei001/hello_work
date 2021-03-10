package com;

import java.util.Scanner;

public class 二重循环示例一 {

	/**
	 * 控制三个班级各4名学生的平均分
	 */
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   for(int j=1;j<=3;j++){  //控制班级
		 //控制4名学员的成绩
		   int sum=0;
			for(int i=1;i<=4;i++){  //控制班级人数
				System.out.print("请输入第"+i+"个学员的成绩:");
				int cj=input.nextInt();
				sum=sum+cj;
			}
			int avg=sum/4;
			System.out.println("平均分是:"+avg);	   	
	   }
	}
}
