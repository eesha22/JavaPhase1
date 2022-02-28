package Assignments;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {
	
	public void listArray() {
		ArrayList<String> food = new ArrayList<String>();
		food.add("chicken");
		food.add("mutton");
		food.add("fish");
		food.add("vegetables");
		for (int i = 0; i < food.size(); i++) {
		      System.out.println(food.get(i));}
	}
	
	public void linklist() {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println("Getting the item at the beginning of the list");
	    System.out.println(cars.getFirst());
	    System.out.println("Get the item at the end of the list");
	    System.out.println(cars.getLast());
	    System.out.println("Remove an item from the beginning of the list.");
	    System.out.println(cars.removeFirst());
	    System.out.println("Remove an item from the end of the list");
	    System.out.println(cars.removeLast());
	    System.out.println("Adding \"Porsche\" to the beginning of the list.");
	    cars.addFirst("Porsche");
	    System.out.println(cars);
	    System.out.println("Adding \"Bugatti\" to the end of the list");
	    cars.addLast("Bugatti");
	    System.out.println(cars);
	    
	}
	
	public void vector() {
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}  
	}
	
	public void stack() {
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}
	
	public void queue() {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
	}
	
	public void dequeue() {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
	}
	
	public void hashSet() {
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}
	
	public void linkedHashSet() {
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	
	public void treeSet() {
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	
	public static void main(String[] args) {
		
		Collection c = new Collection();
		System.out.println("listArray\n");
		c.listArray();
		System.out.println("\nlinkedlist\n");
		c.linklist();
		System.out.println("\nvector\n");
		c.vector();
		System.out.println("\nstack\n");
		c.stack();
		System.out.println("\nqueue\n");
		c.queue();
		System.out.println("\ndequeue\n");
		c.dequeue();
		System.out.println("\nhashSet\n");
		c.hashSet();
		System.out.println("\nlinkedHashSet\n");
		c.linkedHashSet();
		System.out.println("\ntreeSet\n");
		c.treeSet();
		
	}

}
