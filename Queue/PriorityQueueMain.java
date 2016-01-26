package com.soni.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMain {
	public static void main(String[] args) {
		Employee empArr[] = {new Employee(2, "Suyash", 22), new Employee(4, "Ramya", 32), new Employee(1, "Soni", 44), new Employee(3, "Lanka", 64)};
		naturalOrdering(empArr);
		orderingUsingComparator(empArr);
	}
	
	/**
	 * <p>Elements(instances of <code>Employee</code>) will be ordered and processed 
	 * naturally(i.e. In accordance with the sorting logic provided using <code>Comparable#compareTo()</code> )<p>
	 * In this case elements will be processed in the ascending order of <code>empId</code>. Hence <Code>Employee</code> object
	 * with <b>lower</b> <code>empId</code> will have <b>higher</b> priority.
	 * 
	 * @param empArr - Array containing <code>Employee</code> instances.
	 */
	public static void naturalOrdering(Employee[] empArr) {
		System.out.println("\n----------------------- NATURAL ORDERING --------------------------\n");
		
		// Creating PriorityQueue with natural ordering.
		PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>();
		for(Employee e : empArr){
			pQueue.add(e);	// Inserting all the employees in PriorityQueue.
		}
		
		// Textual representation of priority queue does NOT show it's elements in priority order, So here employees will NOT be printed in priority order.
		System.out.println("Priority queue before processing : "+pQueue);
		
		// Will print the employee with highest priority(i.e. employee present at the HEAD.);
		System.out.println("Head : "+pQueue.peek());
		
		// Processing
		// Task will be processed in natural ordering(i.e. Ascending order of empId)
		System.out.println("Processing..........................................");
		while(!pQueue.isEmpty()){
			Employee emp = pQueue.poll();
			System.out.print(emp+" ");
		}
		System.out.println("\n\n*******************************************************************");
	}
	
	
	/**
	 * <p>Elements(instances of <code>Employee</code>) will be ordered and processed in a order provided by using 
	 * <code>Comparator#compare()</code> <p>
	 * In this case elements will be processed in the ascending order of <code>empAge</code>. Hence <Code>Employee</code> object
	 * with <b>lower</b> <code>empAge</code> will have <b>higher</b> priority.
	 * 
	 * @param empArr - Array containing <code>Employee</code> instances.
	 */
	public static void orderingUsingComparator(Employee[] empArr) {
		System.out.println("\n----------------------- ORDERING USING COMPARATOR --------------------------\n");
		
		// Creating PriorityQueue with ordering provided using Comparator.
		PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(
			new Comparator<Employee>(){
				@Override
				public int compare(Employee e1, Employee e2) {
					return e1.getEmpAge().compareTo(e2.getEmpAge());
				}
			}
		);
		for(Employee e : empArr){
			pQueue.add(e);	// Inserting all the employees in PriorityQueue.
		}
		
		// Textual representation of priority queue does NOT show it's elements in priority order, So here employees will NOT be printed in priority order.
		System.out.println("Priority queue before processing : "+pQueue);
		
		// Will print the employee with highest priority(i.e. employee present at the HEAD.);
		System.out.println("Head : "+pQueue.peek());
		
		// Processing
		// Task will be processed in natural ordering(i.e. Ascending order of empId)
		System.out.println("Processing..........................................");
		while(!pQueue.isEmpty()){
			Employee emp = pQueue.poll();
			System.out.print(emp+" ");
		}
		System.out.println("\n\n*******************************************************************");
	}
}

/* OUTPUT - 
 * ----------------------- NATURAL ORDERING --------------------------

Priority queue before processing : [1-Soni-44, 3-Lanka-64, 2-Suyash-22, 4-Ramya-32]
Head : 1-Soni-44
Processing..........................................
1-Soni-44 2-Suyash-22 3-Lanka-64 4-Ramya-32 

*******************************************************************

----------------------- ORDERING USING COMPARATOR --------------------------

Priority queue before processing : [2-Suyash-22, 4-Ramya-32, 1-Soni-44, 3-Lanka-64]
Head : 2-Suyash-22
Processing..........................................
2-Suyash-22 4-Ramya-32 1-Soni-44 3-Lanka-64 

*******************************************************************
*/
