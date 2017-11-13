import java.util.Arrays;

public class BubbleSort {
    public static long sort(int arr[])
    {
        int n = arr.length;
        long time_start, time_end;

        time_start = System.nanoTime();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
