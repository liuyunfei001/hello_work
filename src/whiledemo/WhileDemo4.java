package whiledemo;
import java.util.Scanner;


public class WhileDemo4 {
 public static void main(String[] args) {
	 //不确定次数的循环
	 Scanner input=new Scanner(System.in);
	 System.out.println("能参加跑圈:(y|n)");
	 String str=input.next();
	 while(str.equals("y")){
		 System.out.println("跑完一圈....");
		 
		 System.out.println("还能继续跑吗（y｜n）?");
		 str=input.next(); 
	 }
	
 }
}
