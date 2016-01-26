package com.soni.queue;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee implements Comparable<Employee> {
	private Integer empId;
	private String empName;
	private Integer empAge;
	
	public Employee(int empId, String empName, int empAge){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		//System.out.println(this.empId + " "+ e2.empId);
		if(this.empId==e2.empId){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.empId*100;
	}
	
	@Override
	public String toString() {
		return this.getEmpId()+"-"+this.getEmpName()+"-"+this.getEmpAge();
	}

	@Override
	public int compareTo(Employee emp) {		
		// Natural ordering based on empId. 
		// As objects are sorted in ascending order of empId. So Employee object with smaller empId will have higher priority.
		return this.getEmpId().compareTo(emp.getEmpId());
	}
}
