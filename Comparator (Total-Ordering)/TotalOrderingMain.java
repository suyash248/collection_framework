/**
	<p>Comparator is used to define the total ordering of elements. Comparator interface has following single method-</p>
	<code>public int compare(E ob1, E ob2);</code>

	<p>
	compare() method returns negative, zero, or a positive integer if the first object is less than, equal to, or greater than the second object. i.e. it’s contract is equivalent to compareTo() method of Comparable interface.
	</p>
	<p>
	It’s strongly recommended that it’s implementation does not contradict the semantics of equals() method.
	An alternative ordering to the default natural ordering can be specified by passing a Comparator to the constructor when the sorted set or map is created. The Collections & Arrays classes provide utility methods for sorting which take Comparator.</p>
*/

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Employee implements Comparable<Employee> {
	Integer empId;
	String empName;
	Integer empAge;
	
	public Employee(Integer empId, String empName, Integer empAge){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	@Override
	public int compareTo(Employee otherEmp) {
		return this.getEmpId().compareTo(otherEmp.getEmpId());
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
}


import java.util.Comparator;
import java.util.TreeSet;
public class TotalOrderingMain {
	public static void main(String[] args) {
		TreeSet<Employee> t = new TreeSet<Employee>(
				new Comparator<Employee>() {
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getEmpAge().compareTo(e2.getEmpAge());
					}
				}
		);
		System.out.println("Sorting according to ascending empAge.");
		t.add(new Employee(1,"Ramya", 32));
		t.add(new Employee(5,"Lanka", 64));
		t.add(new Employee(7,"Soni", 44));
		t.add(new Employee(3,"Sachin", 42));
		t.add(new Employee(2,"Suyash", 22));
		t.add(new Employee(6,"Virat", 26));
		t.add(new Employee(4,"Akshar", 21));
		System.out.println("Sorted Treeset : "+t);
	}
}

/*OUTPUT
Sorting according to ascending empAge.
Sorted Treeset : [4-Akshar-21, 2-Suyash-22, 6-Virat-26, 1-Ramya-32, 3-Sachin-42, 7-Soni-44, 5-Lanka-64]
*/