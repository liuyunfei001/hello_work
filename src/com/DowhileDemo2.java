package com;

import java.util.Scanner;

public class DowhileDemo2 {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	    //do...while循环跑圈
	   String temp;
	   do{
		  System.out.println("跑完一圈……");
		  
		  System.out.println("能继续跑吗?y|n");
		  temp=input.next();  //y｜n
		   
	   }while(temp.equals("y"));
	
}
}
