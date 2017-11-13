import java.util.Arrays;

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    public static long sort(int arr[])
    {
        int n = arr.length;
        long time_start, time_end;

        time_start = System.nanoTime();
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        time_end = System.nanoTime();
        printArray(arr);
        return (time_end-time_start);
    }
 
    /* Prints the array for testing */
    static void printArray(int arr[])
    {
    	System.out.println(Arrays.toString(arr));
    }
}
