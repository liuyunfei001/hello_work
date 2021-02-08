package com;

public class ArrayDemo1 {
  public static void main(String args[]) {
	//存三个人的姓名
	//使用数组
	//1.定义(声明)数组
	// 数据类型 [] 数组名;
	// String [] names;
	//2.分配数组空间
	// 数组名=new 数据类型[长度];
	// names=new String[3];
	//3.声明数组并分配存储空间
    //数据类型[]数组名=new 数据类型[长度];
	 // String []names=new String[3];
	//4.给数组赋值
	 // 数组名[索引位置]=值;  //注意索引位置从0开始
	//  names[0]="张三";
	///  names[1]="李四";
	//  names[2]="吴正禹";
	//5.获取数组的元素
	 // 数组名[索引位置];
	  /*
	  System.out.println(names[0]);
	  System.out.println(names[1]);
	  System.out.println(names[2]);
	 */
	  //7.定义数组并初始化
	  //String[] names=new String[]{"张三","李四","麻子"};
	  String[] names={"张三","李四","麻子"};
	  
	  //6.获取数组的长度
	  //数组名.length;
	  for(int i=0;i<names.length;i++){
		  System.out.println(names[i]); 
	  }
	  
}
}
