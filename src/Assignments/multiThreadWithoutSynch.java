package Assignments;
class Table11{  
void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread11 extends Thread{  
	Table11 t;  
	MyThread11(Table11 t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  
  
}  
class MyThread12 extends Thread{  
	Table11 t;  
	MyThread12(Table11 t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  
  
class multiThreadWithoutSynch{  
	public static void main(String args[]){  
		Table11 obj = new Table11();//only one object  
		MyThread11 t1=new MyThread11(obj);  
		MyThread12 t2=new MyThread12(obj);  
		t1.start();  
		t2.start();  
	}  
} 
