package com.hospitalInnerclass;

public class ExceptionsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k=0;
	     int a[]=new int[4];
	     i=8;
	     j=0;
	     
	     try{
	         
	         for(int c=0;c<=4;c++){
	             a[c]=c+1;
	         }
	         for(int value:a){
	             System.out.println(value);
	         }
	         
	     }
	     catch(ArithmeticException  e){
	         System.out.println("cannot Divide by Zero "+e);
	         
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("maximum numbers can be 4 "+e);
	     } 

	}

}
