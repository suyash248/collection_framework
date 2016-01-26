public class Employee {//Create a Class Employee which contains empid and name as details of employee
	 int empId;
	 String empName;
	 
	 public Employee(int empId, String empName){
	  this.empId = empId;
	  this.empName = empName;
	 }
	/*
	we are overriding the equals method here because we want to consider the condition
	that looking at empID, if we have an object is already in map as key, then dont duplicate the object but
	update the value of exisiting object in map
	*/
	 
	 @Override
	 public boolean equals(Object obj) {
	  Employee e2 = (Employee) obj;
	  //System.out.println(this.empId + " "+ e2.empId);
	  if(this.empId==e2.empId){
	   return true;
	  }
	  return false;
	 }
	
	/*
	we are overriding the hash code method, because we want to put the objects having same empID (ID specific) in same bucket
	so that equals method checks whether the inserting object is already avaialbe in bucket and updates it instead of duplicating.
	So, in below method, we are making return type of hashcode as empid dependant so that, all objects of same empid goes into
	same bucket and equals method checks the equality of objects on the basis of their eid.
	*/
	 
	 @Override
	 public int hashCode() {
	  return this.empId*100;
	 }
	}