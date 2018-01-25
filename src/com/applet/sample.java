package com.applet;

public class sample {
	public static void main(String[] args){
		// entering comments for try block
		System.out.println("out of try block");
		try{
			System.out.println("Inside try block");
		}
		catch(Exception e){
			System.out.println("Inside Catch");
		}
				
		finally{
			System.out.println("In finally block");
		}
	}

}
