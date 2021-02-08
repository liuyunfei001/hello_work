package com;

import java.util.Scanner;

public class DowhileDemo4 {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  int cardMoney=5000;
	  String flag;
	  do{
		  System.out.println("欢迎使用ATM一体机:\n1.存款  2.取款");
		  System.out.println("请选择功能:");
		  int control=input.nextInt();
		  switch (control) {
			case 1:  //以点代面思想
				System.out.println("实现存款功能...暂时");
				break;
			case 2:
				System.out.println("后期实现取款...");
				break;
			default:
				System.out.println("无此项功能");
				break;
		  }
		  System.out.println("想继续吗(Y|N)");
		  flag=input.next();
	  }while(flag.equals("y"));
  }
}