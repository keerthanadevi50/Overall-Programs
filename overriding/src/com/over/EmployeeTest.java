package com.over;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Manager(1,"xxxx","dddd",34444.44,"cs");
		System.out.println(e);
	EmployeeStockPlan esp = new EmployeeStockPlan();
	System.out.println("Stock given:"+esp.grantStock(e));
		

	}

}
