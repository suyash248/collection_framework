package com.soni.deque;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeMain {
	public static void main(String[] args) {
		String[] empArr = {"Suyash", "Ramya", "Soni", "Lanka"};
		
		arrayDequeAsStackLIFO(empArr);
		arrayDequeAsQueueFIFO(empArr);
	}
	
	// Stack : LIFO ;  Insert and remove from tail.
	public static void arrayDequeAsStackLIFO(String [] empArr){
		System.out.println("----------------- STACK : LIFO -----------------");
		System.out.println("Array elements : "+Arrays.toString(empArr));
		
		ArrayDeque<String> stack = new ArrayDeque<String>();
		for(String empStr : empArr){
			stack.push(empStr);
		}
		System.out.println("Stack: TOP->"+stack);
		System.out.print("Popping stack : ");
		while(!stack.isEmpty()){
			String poppedElt = stack.pop();
			System.out.print(poppedElt+" ");
		}
		System.out.println("\n\n********************************************************\n");
	}
	
	// Queue : FIFO ; Insert at tail, remove from head
		public static void arrayDequeAsQueueFIFO(String [] empArr){
			System.out.println("----------------- QUEUE : FIFO -----------------");
			System.out.println("Array elements : "+Arrays.toString(empArr));
			
			ArrayDeque<String> queue = new ArrayDeque<String>();
			for(String empStr : empArr){
				queue.offerLast(empStr);
			}
			System.out.println("Queue: HEAD->"+queue+"<-TAIL");
			System.out.print("Polling queue : ");
			while(!queue.isEmpty()){
				String polledElt = queue.pollFirst();
				System.out.print(polledElt+" ");
			}
			System.out.println("\n\n********************************************************\n");
		}
}

/*
 * OUTPUT-
  ----------------- STACK : LIFO -----------------
Array elements : [Suyash, Ramya, Soni, Lanka]
Stack: TOP->[Lanka, Soni, Ramya, Suyash]
Popping stack : Lanka Soni Ramya Suyash 

********************************************************

----------------- QUEUE : FIFO -----------------
Array elements : [Suyash, Ramya, Soni, Lanka]
Queue: HEAD->[Suyash, Ramya, Soni, Lanka]<-TAIL
Polling queue : Suyash Ramya Soni Lanka 

********************************************************
 */