package com;  /*声明包*/


import java.util.Arrays;
import java.util.Scanner;


public class ArrayDemo4 {
  public static void main(String args[]) {
	 
	  
	  
	  
	 int ary[]=new int[6];
	 ary[0]=3;
	 ary[1]=5;
	 ary[2]=7;
	 ary[3]=9;
	 ary[4]=11;
	 //插入算法实现(移位置)
	 int pos=5;//定义插入位置的变量
	 for(int i=ary.length-1;i>pos;i--){
		 ary[i]=ary[i-1];		         
	 }
	 //在指定位置插入值
	 ary[pos]=20;
	 
	 //显示内容
	 for (int i = 0; i < ary.length; i++) {
	System.out.print(ary[i]+"\t");	
	}
  }
}
