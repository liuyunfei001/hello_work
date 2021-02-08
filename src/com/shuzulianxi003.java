package com;

public class shuzulianxi003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] abc=new int[6];
       abc[0]=3;
      abc [1]=5;
      abc [2]=7;
      abc [3]=9;
      abc [4]=11;
      abc[5]=abc[4];
      abc[4]=abc[3];
      abc[3]=abc[2];
      abc[2]=abc[1];
      abc[1]=20;
      for (int i = 0; i < abc.length; i++) {
    	  System.out.print("\t"+abc[i]);
	}
      


      
	}

}
