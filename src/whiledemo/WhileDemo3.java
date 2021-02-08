package whiledemo;

public class WhileDemo3 {
 public static void main(String[] args) {
	 //应用循环
	 //求1+2+3+4+5....100的和
	 //分析:
	 /*
	 int sum=0;  //求和的====累加器
	 sum=sum+1;  
     sum=sum+2; 
     sum=sum+3;
     sum=sum+4;
     sum=sum+5;
     ....
     sum=sum+100;
     */
	 int sum=0; //累加器  (思想)
	 int i=1;
     while(i<=100){
    	 //System.out.println(i);
    	 //累加
    	 sum=sum+i;
    	 
    	 i++;
     }
     System.out.println("1-100的和为:"+sum);
 }
}
