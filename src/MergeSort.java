import java.util.Arrays;

public class MergeSort {
	public static long sort(int[] a) {
		int[] from = a, to = new int[a.length];

		long time_start, time_end;

		time_start = System.nanoTime();
		for (int blockSize = 1; blockSize < a.length; blockSize *= 2) {
			for (int start = 0; start < a.length; start += 2 * blockSize)
				mergeWithoutCopy(from, to, start, start + blockSize, start + 2 * blockSize);
			int[] temp = from;
			from = to;
			to = temp;
		}
		if (a != from)
			// copy back
			for (int k = 0; k < a.length; k++)
				a[k] = from[k];

		time_end = System.nanoTime();
		//printArray(a);
		return (time_end - time_start);
	}

	private static void mergeWithoutCopy(int[] from, int[] to, int lo, int mid, int hi) {
		// DK: cannot just return if mid >= a.length, but must still copy remaining
		// elements!
		// DK: add two tests to first verify "mid" and "hi" are in range
		if (mid > from.length)
			mid = from.length;
		if (hi > from.length)
			hi = from.length;
		int i = lo, j = mid;
		for (int k = lo; k < hi; k++) {
			if (i == mid)
				to[k] = from[j++];
			else if (j == hi)
				to[k] = from[i++];
			else if (from[j] < from[i])
				to[k] = from[j++];
			else
				to[k] = from[i++];
		}
	}

	
	
	
	public static long sort2(int[] a) {
		int[] aux = new int[a.length];
		long time_start, time_end;

		time_start = System.nanoTime();
		for (int blockSize = 1; blockSize < a.length; blockSize *= 2)
			for (int start = 0; start < a.length; start += 2 * blockSize)
				merge(a, aux, start, start + blockSize, start + 2 * blockSize);

		time_end = System.nanoTime();		
		//printArray(a);
		return (time_end - time_start);
	}

	private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
		// DK: add two tests to first verify "mid" and "hi" are in range
		if (mid >= a.length)
			return;
		if (hi > a.length)
			hi = a.length;
		int i = lo, j = mid;
		for (int k = lo; k < hi; k++) {
			if (i == mid)
				aux[k] = a[j++];
			else if (j == hi)
				aux[k] = a[i++];
			else if (a[j] < a[i])
				aux[k] = a[j++];
			else
				aux[k] = a[i++];
		}
		// copy back
		for (int k = lo; k < hi; k++)
			a[k] = aux[k];
	}
	
	
	
    static void printArray(int arr[])
    {
    	System.out.println(Arrays.toString(arr));
    }
}
