import java.util.Arrays;

public class SelectionSort {
	public static long sort(int arr[])
    {
        int n = arr.length;
        long time_start, time_end;

        time_start = System.nanoTime();
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        time_end = System.nanoTime();
        //printArray(arr);
        return (time_end-time_start);
    }
 
	/* Prints the array for testing */
    static void printArray(int arr[])
    {
    	System.out.println(Arrays.toString(arr));
    }
}
