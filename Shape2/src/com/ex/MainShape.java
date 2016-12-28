package com.ex;

public class MainShape {

	public static void main(String[] args) {
		Shape2 obj =  new Triangle();
		System.out.println("the area of Triangle:"+obj.area());
		obj=new Rectangle();
		System.out.println("the area of rectangle:"+obj.area());
		if(obj instanceof Rectangle)
		{
			System.out.println("obj is refering Rectangle Instance");
		}
		// TODO Auto-generated method stub

	}

}
