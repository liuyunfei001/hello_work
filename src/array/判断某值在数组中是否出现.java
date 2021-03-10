package array;

import java.util.Scanner;

public class 判断某值在数组中是否出现 {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   int ary[]={2,4,7,6,10,90};
	   System.out.println("请输入查找的数:"); //3
	   int selMath=input.nextInt();
	   
	   //循环比较
	   boolean flag=false; //标识符  表示没有相同的
	   int pos=-1;
	   for (int i = 0; i < ary.length; i++) {
		  if(ary[i]==selMath){
			 // System.out.println("存在");
			  flag=true;
			   pos=i;
			  break;
			 
		  }
	  }
	   
	   if(flag){
		   System.out.println("存在");
	   }else{
		   System.out.println("不存在");
	   }
	   
	 
	 
}
}
