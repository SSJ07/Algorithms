
/**
	Bubble sort
**/

public class BubbleSortExample {

	public static int[] bubbleSort(int[] arr){
		boolean flag=false;
		int totalIteration=0;
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j]>arr[j+1]){
					flag = true;
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
				totalIteration++;
			}
			if(!flag)
				break;
		}
		System.out.println("Total iteration done for sorting is :" + totalIteration);
		return arr;
	}
	public static void printArray(int[]arr){
		for(int a: arr){
			System.out.print(a + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]arr={5,3,2,6,1,8,4};
		printArray(bubbleSort(arr));
		int[]arr1={8,6,5,4,3,2,1};
		printArray(bubbleSort(arr1));
		int[]arr2={1,2,3,4,5,6,7};
		printArray(bubbleSort(arr2));
	}

}
