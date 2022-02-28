package Assignments;

public class SelectionSort {
	public static void main(String[] args) {

	    int[] arr = {6,9,2,5,3,1,4};
	    System.out.println("The array is :- ");
        for (int element: arr) {
            System.out.print(element+" ");
        }
        System.out.println();
	    int length = arr.length;
	    selectionSort(arr);
	    System.out.println("The sorted elements are:");
	    for(int i:arr){

	        System.out.print(i+" ");
	         }
     }

	public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }
    }

}
