package com;

public class DowhileDemo1 {
  public static void main(String[] args) {
	 //输出1-100的能被3和5整除的所有数之和
	  //累加器
	  int sum=0;
	  //求个数
	  int count=0;
      int i=1;
	  do{
		  //循环体
		  if(i%3==0&&i%5==0)
		  {
			 // System.out.println(i);
			  sum=sum+i; //实现累加
			  
			  count=count+1;  //实现个数累加
		  }
		  
		  i++;
	  }while(i<=100);
	  System.out.println("和为:"+sum);
	  System.out.println("个数为:"+count);
	
}
}
