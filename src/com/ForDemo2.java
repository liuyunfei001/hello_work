package com;

import java.util.Scanner;

public class ForDemo2 {
  public static void main(String[] args) {
	  //循环输入五门课的成绩表求平均分
	  Scanner input=new Scanner(System.in);
	  int count=4;  //存放几门课
	  //累加器
	  int sum=0;
	  
	  for(int i=1;i<=count;i++){
		  System.out.println("请输入第"+i+"门课的成绩:");
		  int cj=input.nextInt();
	   
		  sum=sum+cj;  //累加
	  }
      //求平均分
	  int avg=sum/count;
	  System.out.println("平均分为:"+avg);
  }
}  
