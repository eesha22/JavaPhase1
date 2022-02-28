package Assignments;

class ExtThread {  
	class Multi extends Thread{  
		public void run(){  
		System.out.println("extended thread is running...");  
		} 
	}
	class Multi3 implements Runnable{  
		public void run(){  
		System.out.println("Runnable thread is running...");  
		} 
	}  
	public static void main(String args[]){  
		ExtThread.Multi et=new ExtThread().new Multi();  
		et.start();  
		ExtThread.Multi3 m1=new ExtThread().new Multi3();  
		Thread t1 =new Thread(m1);   
		t1.start(); 
	}   
}