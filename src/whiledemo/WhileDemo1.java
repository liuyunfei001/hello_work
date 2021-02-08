package whiledemo;

public class WhileDemo1 {
 public static void main(String[] args) {
	 //理解循环
	 //死循环
	 /*
	 while(true)  
	 {
		 System.out.println("王建兵");
	 }*/
	 
	 //输出姓名五次
	 int i=1;  //记录循环的次数
	 while(i<=100){
		 System.out.println("第"+i+"次输入:王建兵"); 
		 i++;//i=i+1;  //自增
	 }
}
}
