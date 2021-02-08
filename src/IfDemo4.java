import java.util.Scanner;


public class IfDemo4 {
    /**
     * 理解if语句
     * @param args
     */
	public static void main(String[] args) {
	 //请输入语文成绩，判断是否通过考试
	  Scanner  input=new Scanner(System.in);
	  System.out.println("请输入星期数:");
	  int weekday=input.nextInt();  //
	
	  if(weekday==1){
		  System.out.println("星期一");
	  }else if(weekday==2){
		  System.out.println("星期二");
	  }else if(weekday==3){
		  System.out.println("星期三");
	  }else if(weekday==4){
		  System.out.println("星期四");
	  }	
	  
	  
	  
   }
}
