
/**
 * 
 * @author Shri
 * 
 * Merge sort algorithm example
 *
 */
public class MergeSortExample {
	
	public static void merge(int arr[], int left, int middle, int right){
		int i, j, k;
		int n1 = middle-left+1;
		int n2 = right-middle;
		
		int [] firstArray = new int[n1];
		int [] secondArray = new int[n2];
		for(i=0; i<n1; i++){
			firstArray[i] = arr[left+i];
		}
		for(j=0; j<n2; j++){
			secondArray[j] = arr[middle+j+1];
		}
		
		i=0;
		j=0;
		k=left;
		while(i<n1 && j<n2){
			if(firstArray[i] <= secondArray[j]){
				arr[k] = firstArray[i];
				i++;
			}else{
				arr[k] = secondArray[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k]=firstArray[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=secondArray[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int [] arr, int left, int right){
		if(left < right){
			int middle = (left + right)/2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			merge(arr, left, middle, right);
		}
	}
	
	public static void printArray(int[] arr){
		for(int a :arr){
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
	 
	    printArray(arr);
	 
	    mergeSort(arr, 0, arr.length - 1);
	 
	    System.out.println("\nSorted array is \n");
	    printArray(arr);
	}

}
