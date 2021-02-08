

//1.导入scanner类
import java.util.Scanner;  //*代表所有类import java.util.*;  


public class Demo3 {
	/**
	 * 运算符
	 * @param args
	 */
	public static void main(String[] args) {
		//2.创建输入对象
		 Scanner input=new Scanner(System.in); 
		//3.接收输入
		 System.out.println("请输入圆的半径:");
		// int r=input.nextInt(); //接收输入整数
		double r=input.nextDouble(); //接收输入小数
		  
	   //请输入圆的半径，求圆的面积
		//int r=3;
		
		//处理
		double res=3.14*r*r;
		
		//输出
		System.out.println("圆的面积是:"+res);
	}

}
