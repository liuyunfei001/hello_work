package array;

public class 冒泡排序的算法 {
	public static void main(String[] args) {
       int [] ary={7,2,9,6,5,8,22,1,49,99,55,33};
       
       //冒泡排序
       for(int i=1;i<ary.length;i++){  //控制查找的次数
    	  for(int j=0;j<ary.length-i;j++){
    		   //if(ary[j]<ary[j+1]){   //降序
    		    if(ary[j]>ary[j+1]){    //升序
    			   int temp=ary[j];
    			   ary[j]=ary[j+1];
    			   ary[j+1]=temp;
    		   }
    	  } 
       }
       
       //排取后的结果
       for (int i = 0; i < ary.length; i++) {
		 System.out.print(ary[i]+"=");
	   }
	}

}
