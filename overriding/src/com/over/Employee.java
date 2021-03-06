package com.over;

public class Employee {
	
	private int Employee_id;
	private String Employee_name;
	private String Employee_Social_Security_Number;
	private double Employee_salary;
 
	public Employee(int employee_id, String employee_name, String employee_Social_Security_Number,
			double employee_salary) {
		
		Employee_id = employee_id;
		Employee_name = employee_name;
		Employee_Social_Security_Number = employee_Social_Security_Number;
		Employee_salary = employee_salary;
	}


	public int getEmployee_id() {
		return Employee_id;
	}
	
	
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	
	
	public String getEmployee_Social_Security_Number() {
		return Employee_Social_Security_Number;
	}
	
	
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}


	public void setEmployee_Social_Security_Number(String employee_Social_Security_Number) {
		Employee_Social_Security_Number = employee_Social_Security_Number;
	}


	public void setEmployee_salary(double employee_salary) {
		Employee_salary = employee_salary;
	}


	public double getEmployee_salary() {
		return Employee_salary;
	}
	
	public void raiseSalary(double increase)
	{
		Employee_salary += increase;
	}
public String toString(){
	return "Employee Id:"+getEmployee_id()+"Employee name:"+getEmployee_name()+"Employee Social Security Number:"+getEmployee_Social_Security_Number()+"Employee salary:"+getEmployee_salary()+"";
}

 }

