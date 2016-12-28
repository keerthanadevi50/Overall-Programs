package com.over;

public class Director extends Employee
{
	private String business_name;
public Director(int employee_id, String employee_name, String employee_Social_Security_Number,
			double employee_salary,String business_name) {
	super(employee_id, employee_name, employee_Social_Security_Number, employee_salary);
	this.business_name=business_name;
}
	String getbusiness_name() {
		// TODO Auto-generated method stub
		return null;
	}
	@override
	public String toString()
	{
	return super.toString() +"\nbusinessname:  " + getbusiness_name();

}

}


