package com;

public class 二重循环 {

	/**
	 * 理解二重循环
	 */
	public static void main(String[] args) {
	    for (int i = 1; i <=3; i++) {  //外层循环
	    	for(int j=1;j<=3;j++){  //内层循环
				System.out.println("hello");
				//break;
			}
		}
		
	}

}
