package com;

public class ContinueDemo {

	public static void main(String[] args) {
      /*
		for (int i = 1; i <= 5; i++) {
	
			if(i%2==0)
			{
				continue;   //退出本次循环，继续下一次
			}
			
			System.out.println(i);  
			
		}*/
		int sum=0;
		for(int i=1;i<=100;i++){
			//System.out.println(i);
			if(i%2==0)
				continue;
			
			sum+=i;
		}
		System.out.println("和是:"+sum);

	}

}
