import java.util.Scanner;


public class 练习一 {

	/**
	 *  输入会员卡号和随机数比较中奖
	 */
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
		//获取0-1的随机数
       int math=(int)(Math.random()*10);
       System.out.println("随机数是:"+math);
        //输入卡号 
       System.out.println("请输入会员卡号:");
       int temp=input.nextInt();  //2345
        //获取百位数
       int baiwei=temp/100%10;  //??
      // System.out.println(baiwei);
       
       //判断
       if(math==baiwei){
    	   System.out.println("中奖啦....");
       }
       else{
    	   System.out.println("下次再来....");
       }
       
	}

}
