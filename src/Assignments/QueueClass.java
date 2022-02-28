package Assignments;

import java.util.*;
public class QueueClass 
{
	public static void main(String[] args) 
	{
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Kolkata");
		locationsQueue.add("Patna");
		locationsQueue.add("Delhi");
		locationsQueue.add("Gurgaon");
		locationsQueue.add("Noida");
		System.out.println("Queue is : " + locationsQueue+"\n");
		System.out.println("Head of Queue : " + locationsQueue.peek()+"\n");
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue+"\n");
		System.out.println("Size of Queue : " + locationsQueue.size());
    }
}