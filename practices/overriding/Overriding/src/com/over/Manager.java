package com.over;

public class Manager extends Employee {
	private String DeptName;
	public Manager(int employee_id, String employee_name, String employee_Social_Security_Number,
			double employee_salary, String DeptName) {
		super(employee_id, employee_name, employee_Social_Security_Number, employee_salary);
		this.DeptName=DeptName;
		// TODO Auto-generated constructor stub
	}
	private String getDeptName() {
		// TODO Auto-generated method stub
		return DeptName;
	}
	
	
	@override
	public String toString()
	{
	return super.toString() +"\nDepartment:  " + getDeptName();

}

	
}
	