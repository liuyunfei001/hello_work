import java.util.Scanner;


public class IfDemo1 {
    /**
     * 理解if语句
     * @param args
     */
	public static void main(String[] args) {
	 //请输入语文成绩，判断是否通过考试
	  Scanner  input=new Scanner(System.in);
	  System.out.println("请输入语文成绩:");
	  int yuwen=input.nextInt();  //80
	  
	  //处理
	  if(yuwen>=60){  
		 System.out.println("通过考试"); 
	  }
	  else{
		  System.out.println("没有通过考试");
	  }
	  
	   System.out.println("程序结束");
	  
	  
   }
}
