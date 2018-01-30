public class SelectionSortExample{

	public static int [] selectionSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			int min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[min])
					min=j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]=temp;
		}
		return arr;
	}
	public static void printArray(int[] arr){
		for(int a: arr){
			System.out.print(a + " ");
		}
	}
	public static void main(String args[]){
		int [] array = {1,5,2,7,3,8,4};
		printArray(selectionSort(array));
	}
}

