import java.util.Scanner;
public class Demo4 {
   /**
    * 使用输入
    * @param args
    */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入姓名:");
		String str=input.next();  //接收输入字符串
		
		System.out.println("姓名是:"+str);
	
}
}
