/**
	<p>The natural ordering of objects/elements is specified by implementing Comparable interface.</p>
	A total ordering is specified by implementing Comparator interface.
	Comparable interface has only one method-
	int compareTo(E elt);
	It returns negative, Zero or a positive integer if the current object is less than, equal to, or greater than the specified object, based on the natural ordering.
	Objects implementing Comparable can be used as-
	<ul>
	<li> Elements in a sorted set.</li>
	<li> Keys in sorted map.</li>
	<li> Elements in the list that are sorted manually using the Collections.sort() method.</li>
	</ul>
	<p>
	Many of the standard classes in Java API, such as the primitive wrapper classes, String, Date, File implements Comparable.
	Natural ordering for String objects and Character objects is lexicographical ordering. i.e., their comparison is based on the Unicode Value of each character in the strings. Objects of String and Character classes will be lexicographically maintained as elements in a sorted set, or as keys in a sorted map that uses their natural ordering.
	The natural ordering for objects of numerical wrapper class is in ascending order of the values of corresponding numerical primitive type. As elements in a sorted set or as keys in sorted map that uses their natural ordering, the objects will be maintained in ascending order.
	According to natural ordering for the objects of the Boolean class, A Boolean object representing the value false is less than a Boolean object representing the value true.
	The compareTo() method must be consistent with equals() method. i.e. (obj1.compareTo(obj2)==0) == (obj1.equals(obj2)). This is recommended if elements has to be maintained inside sorted set or sorted maps.
	The functionality of equals() is a subset of functionality of compareTo() method. The equals() method implementation can call compareTo(). Example-
	</p>
	<code><pre>
	public boolean equals(Object other){
	……….
		return compareTo(other)==0;
	}
	</pre></code>
*/

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee implements Comparable<Employee> {
	Integer empId;
	String empName;
	
	public Employee(Integer empId, String empName){
		this.empId = empId;
		this.empName = empName;
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
		return this.getEmpId()+"-"+this.getEmpName();
	}
}


import java.util.TreeSet;
public class NaturalOrderingMain {
	public static void main(String[] args) {
		System.out.println("Sorting according to ascending empId.");
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(new Employee(1,"Ramya"));
		t.add(new Employee(5,"Lanka"));
		t.add(new Employee(7,"Soni"));
		t.add(new Employee(3,"Sachin"));
		t.add(new Employee(2,"Suyash"));
		t.add(new Employee(6,"Virat"));
		t.add(new Employee(4,"Akshar"));
		System.out.println("Sorted Treeset : "+t);
	}
}

/*OUTPUT
Sorting according to ascending empId.
Treeset : [1-Ramya, 2-Suyash, 3-Sachin, 4-Akshar, 5-Lanka, 6-Virat, 7-Soni]
*/