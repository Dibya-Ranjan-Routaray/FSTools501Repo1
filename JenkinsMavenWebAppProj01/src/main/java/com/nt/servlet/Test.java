package com.nt.servlet;

interface Animal {
	

	  
	 default void getAmimalDetails() {
		System.out.println("Animal has 4 legs");
	}
	public abstract void run();
}

class Lion implements Animal {
	
    
	
	@Override
	public  void getAmimalDetails() {
		Animal.super.getAmimalDetails();
		System.out.println("--------------");
	}

	@Override
	public void run() {
		System.out.println("Lion is running");
	}
}

public class Test {

	public static void main(String[] args) {
		Animal animal=new Lion();
		animal.getAmimalDetails();;
		animal.run();
	}

}
