package Assignments;

public class DimensionalArray {
	
	public void singleDimension() {
		int a[]={33,34,45,56};  
		for(int i=0;i<a.length;i++) { 
		System.out.println(a[i]); 
		}
	}
	
	public void multidimensional() {
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
	}

	public static void main(String[] args) {
		
		DimensionalArray da = new DimensionalArray();
		System.out.println("single-dimensional array"); 
		da.singleDimension();
		System.out.println("\nmultidimensional array"); 
		da.multidimensional();
		
	}
}
