package whiledemo;

public class WhileDemo2 {
 public static void main(String[] args) {
	 //理解循环
	  //输出 1－10的数
	 /*
	  int i=10;
	  while(i>=1){
		  System.out.println(i);
		  i--;
	  }*/ 
	 /*
	  int i=1;
	  while(i<=10){
		  
		  System.out.println(i);
		  
		  i++;
	  }*/
	 
	 //输出1-10的奇数
	 int i=1;
	  while(i<=100){
		  /* 
		  if(i%2!=0)
		  {
			  System.out.println(i);
		  }
		  */
		  System.out.println(i);
		  
		  //i++;
		  i=i+2;  //等价  i+=2;  i-=2; i*=2; i/=2;
	  }
}
}
