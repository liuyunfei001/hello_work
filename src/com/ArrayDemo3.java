package com;  /*声明包*/


import java.util.Arrays;
import java.util.Scanner;


public class ArrayDemo3 {
  public static void main(String args[]) {
	 int ary[]={12,22,99,8,15,10};
	 System.out.println("没有排序前:");
	 for (int i = 0; i < ary.length; i++) {
		System.out.print(ary[i]+"\t");
	 }
	 
	 //使用Arrays类的sort方法对数组排序
	// Arrays.sort(数组);
	 Arrays.sort(ary);  //升序
	 
	 System.out.println("\n排序后的结果");
	 /*for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+"\t");
	 }*/
	 for (int i = ary.length-1; i >=0; i--) {
		 System.out.print(ary[i]+"\t");
	}
	 
	 System.out.println("最小值:"+ary[0]);
	 System.out.println("最大值:"+ary[ary.length-1]);
	 
	 //数组复制
	 /*
	 int ary2[]=new int[6];
	 //数组复制
	 for (int i = 0; i < ary.length; i++) {
		  ary2[i]=ary[i]; //复制
	 }
	 */
	
	 //使用Arrays.copyof方法实现复制
	 int ary2[]=Arrays.copyOf(ary, 3);
	 //显示第二个数组
	 for (int i = 0; i < ary2.length; i++) {
		System.out.print(ary2[i]+"=");
	 }
	 
	 
  }
}
