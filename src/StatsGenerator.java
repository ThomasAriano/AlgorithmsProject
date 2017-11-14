import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StatsGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file read name:");
		String file_read_name = input.nextLine();
		System.out.println("Enter a file write name:");
		String file_write_name = input.nextLine();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file_read_name));
			PrintWriter writer = new PrintWriter(new File(file_write_name));
			for(int i=0;i<10;i++) {
				int[] data_array = Arrays.stream(reader.readLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
				reader.readLine();
				
				
				//writer.println("Dataset "+(i+1)+":");
				
				System.out.println("Running bubble "+(i+1)+"...");
				//writer.println("\tBubblesort: " + BubbleSort.sort(Arrays.copyOf(data_array, data_array.length)));
				writer.println("B: " + BubbleSort.sort(Arrays.copyOf(data_array, data_array.length)));
				
				System.out.println("Running selection "+(i+1)+"...");
				//writer.println("\tSelectionSort: " + SelectionSort.sort(Arrays.copyOf(data_array, data_array.length)));
				writer.println("S: " + SelectionSort.sort(Arrays.copyOf(data_array, data_array.length)));
				
				System.out.println("Running insertion "+(i+1)+"...");
				//writer.println("\tInsertionSort: " + InsertionSort.sort(Arrays.copyOf(data_array, data_array.length)));
				writer.println("I: " + InsertionSort.sort(Arrays.copyOf(data_array, data_array.length)));
				
				System.out.println("Running quick "+(i+1)+"...");
				//writer.println("\tQuickSort: " + QuickSort.sort(Arrays.copyOf(data_array, data_array.length)));
				writer.println("Q: " + QuickSort.sort(Arrays.copyOf(data_array, data_array.length)));
				
				System.out.println("Running merge "+(i+1)+"...");
				//writer.println("\tMergeSort: " + MergeSort.sort(Arrays.copyOf(data_array, data_array.length)));
				writer.println("M: " + MergeSort.sort(Arrays.copyOf(data_array, data_array.length)));
				
				System.out.println("Running merge2 "+(i+1)+"...");
				//writer.println("\tMergeSort2: " +  MergeSort.sort2(Arrays.copyOf(data_array, data_array.length)));
				writer.println("M2: " +  MergeSort.sort2(Arrays.copyOf(data_array, data_array.length)));
				
				//writer.println("----------------------------");
				writer.println();
				
				System.out.println("----------------------------");
			}
			reader.close();
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
