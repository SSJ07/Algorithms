/**
 *
 * Insertion sort time complexity is :
 * 	Best case : O(n)
 * 	Worst case : O(n)2 When array is in reverse order
 *
 */
public class InsertionSortExample{
	
	public static int[] insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int value=arr[i];
			int min = i;
			while(min>0 && arr[min-1] > value){
				arr[min]=arr[min-1];
				min--;
			}
			arr[min]=value;
		}
		return arr;
	}
	public static void printArray(int[] arr){
		for(int a: arr){
			System.out.print(a + " ");
		}
	}
	public static void main(String args[]){
		int[] array= {6,2,4,5,1,7,3};
		printArray(insertionSort(array));
	}
}
