package Assignments;
import java.util.HashMap;
import java.util.Map;
public class Mapcode {	
	public void generic() {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"fries");  
		  map.put(101,"burger");  
		  map.put(102,"pizza");  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		   System.out.println();
	}	
	public void compareByKey() {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"fries");    
	      map.put(101,"burger");    
	      map.put(102,"pizza");   
	      map.entrySet()  
	      .stream()  
	      .sorted(Map.Entry.comparingByKey())  
	      .forEach(System.out::println);  
	      System.out.println();
	}	
	public void compareByValue() {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"fries");    
	      map.put(101,"burger");    
	      map.put(102,"pizza");    
	      map.entrySet()  
	      .stream()  
	      .sorted(Map.Entry.comparingByValue())  
	      .forEach(System.out::println);  
	      System.out.println();
	}
	public static void main(String[] args) {		
		Mapcode m = new Mapcode();
		System.out.println("Generic mapping");
		m.generic();
		System.out.println("compare by key");
		m.compareByKey();
		System.out.println("compare by value");
		m.compareByValue();
	}

}
