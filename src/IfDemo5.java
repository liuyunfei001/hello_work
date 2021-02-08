import java.util.Scanner;


public class IfDemo5 {
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
	  if(yuwen>=80){
		  System.out.println("成绩优秀");
	  }else if(yuwen<80 && yuwen>=60){
		  System.out.println("成绩良好");
	  }else{
		  System.out.println("还过的去吧....");
	  }
	  
	  
   }
}
