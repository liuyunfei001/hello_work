package com;

public class BreakDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			if(i==3)
			{
				break;  //退出循环
			}
			System.out.println(i);  
		}

	}

}
