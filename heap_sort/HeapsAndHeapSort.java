package heap_sort;

public class HeapsAndHeapSort {
	
	public static void main(String[] args) {
		int[] arr = {2,9,7,6,5,8, 10, 13, 1};
		arr = Heapify(arr, arr.length);
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println();

		arr = heapSort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	static int[] heapSort(int[] arr) {
		
		arr = Heapify(arr, arr.length);
		int temp;
		
		for(int i = 0; i<arr.length; i++) {
			//swap max and last element 
			temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[0];
			arr[0] = temp;
			
			//heapify until certain place in array exlcuding sorted elements
			arr = Heapify(arr, arr.length-1-i);
		}
		
		
		return arr;
	}
	
	static boolean isHeap(int[] arr) {
		
		for(int i = 1; i<=arr.length/2; i++) {
			if(arr[i-1] < arr[2*i-1] || (arr[i-1] < arr[2*i]))
					return false;
		}
		
		return true;
	}
	
	static int[] Heapify(int[] arr, int max) {
		
		for(int i =max/2; i>=1; i--) {
			//start at rightmost parental node = n/2
			
			int k = i;
			
			boolean heap = false;
			
			while(!heap && 2*k<=max) {
				
				int j = 2*k;
				
				if((2*k)+1 <= max) {
					//there are 2 children
					
					if(arr[j-1] < arr[j]) 
						//set j equal to the largest child
						j++;
				}
				//if not j stays the same as the first left child
				
				if(arr[k-1] < arr[j-1]) {
					//swap parent with largest child if not a heap
					int temp = arr[j-1];
					arr[j-1] = arr[k-1];
					arr[k-1] = temp;
					k = j; //this makes sure it goes back through the array after swapping elements
							//if k = 1 j = 2 or 3 so it moves to the next parent (the one it swapped with)
				}
				else
					heap = true;
				}
	
			}
	
		return arr;
	}
	
	static int[] removeMaxElement(int[] arr) {
		int[] newarr = new int[arr.length-1];
		newarr[0] = arr[arr.length-1];
		for(int i =1; i<newarr.length; i++)
			newarr[i] = arr[i];
		newarr = Heapify(newarr, arr.length);
		return newarr;
	}

}
