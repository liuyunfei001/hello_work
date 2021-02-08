import java.util.Scanner;


public class IfDemo3 {
    /**
     * 理解if语句
     * @param args
     */
	public static void main(String[] args) {
	 //请输入语文成绩，判断是否通过考试
	  Scanner  input=new Scanner(System.in);
	  System.out.println("请输入语文成绩:");
	  int yuwen=input.nextInt();  //80
	  System.out.println("请输入数学成绩:");
	  int math=input.nextInt();  //80
	  
	  //处理
	  if(yuwen>=60){
		   //语文过了
		   if(math>=60){
			  System.out.println("小伙子成绩还不错!");   
		   }else{
			  System.out.println("数学没有能过，等着补考吧！"); 
		   }
	  }else{
		  //语文没过
		  if(math>=60){
			  System.out.println("语文没有能过，等着补考吧！"); 	  
		  } 
		  else
		  {
			  System.out.println("活着真累...考试太烦啦..");
		  }
	  }
	  /*
	  if(yuwen>=60&&math>=60){
		  System.out.println("通过");
	  }
	  
	  
	  if(yuwen>=60&&math<60){
		  System.out.println("数学没有通过"); 
	  }
	  
	  
	  if(yuwen<60&&math>=60){
		  System.out.println("语文没有通过"); 
	  }
	  */	  
   }
}
