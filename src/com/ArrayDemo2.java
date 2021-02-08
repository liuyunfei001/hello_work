package com;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayDemo2 {
  public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	 //请输入五名学员的考试成绩，求平均分
	 //使用数组存五门课的成绩
	  int [] cjs=new int[5];
	 //接收循环输入数据并存入数组
     for (int i = 0; i < cjs.length; i++) {
	     System.out.print("请输入第"+(i+1)+"名学员的成绩:");
	    int cj=input.nextInt();
	     //存入数组
	     cjs[i]=cj;
	 }
     
     //排序
     Arrays.sort(cjs);//升序
     
     //显示所有成绩
     int sum=0;
     System.out.println("序号\t成绩");
     for (int i = 0; i < cjs.length; i++) { 
	  System.out.println((i+1)+"\t"+cjs[i]);
	  //累加
	  sum=sum+cjs[i];
	 }
     System.out.println("平均分\t"+sum*1.0/cjs.length);
     System.out.println("最低分\t"+cjs[0]);
     System.out.println("最高分\t"+cjs[cjs.length-1]);
	  
}
}
