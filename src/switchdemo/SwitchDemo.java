package switchdemo;
import java.util.Scanner;


public class SwitchDemo {
  public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("请输入名次:");
	 int temp=input.nextInt();
	 
	 //处理
	 //多重if语句
	 /*
	 if(temp==1){
		 System.out.println("1个月的旅游");
	 }else if(temp==2){
		 System.out.println("电脑一台");
	 }else if(temp==3){
		 System.out.println("硬盘一个");
	 }else{
		 System.out.println("无…………");
	 }*/
	 
	 String res="";
	 //使用switch  特点:等值判断
	 switch(temp){
		case 1:
			 //System.out.println("1个月的旅游");
			res="1个月的旅游";
			break;
		case 2:
		case 3:
			// System.out.println("电脑一台");
			res= "电脑一台";
			break;
		case 4:
		case 5:
			res="硬盘一个";
			 //System.out.println("硬盘一个");
			 break;
		default:
			res="无…………"; // System.out.println("无…………");
			break;
	 }
	 
	 System.out.println("结果是:"+res);
}
}
