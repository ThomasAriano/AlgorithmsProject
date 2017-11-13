import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		/*
		String[] file1_raw = getFileData("file1.txt");
		// Loop through all lines of file
		for(int i=0;i<file1_raw.length;i++) {
			String[] temp = file1_raw[i].split(",");
			int[] data = new int[temp.length];
			for(int j=0;j<temp.length;j++) {
				data[j] = Integer.parseInt(temp[j]);
			}
			// Use data for the current line stored in int[] data
			// ...
		}
		*/
		int[] arr = {1,5,4,3,7,9,2,7,3,5,4,3,11,19,55,234,76543,4,65,1,2,9};
		System.out.println("BubbleSort: " + BubbleSort.sort(arr));
		System.out.println("SelectionSort: " + SelectionSort.sort(arr));
		System.out.println("InsertionSort: " + InsertionSort.sort(arr));
		System.out.println("QuickSort: " + QuickSort.sort(arr));
		System.out.println("MergeSort: " + MergeSort.sort(arr));
		System.out.println("MergeSort2: " + MergeSort.sort2(arr));
	}

	public static String[] getFileData(String fileName) {
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(new File(fileName));
		} catch (FileNotFoundException e1) {
			System.out.println("File not found: " + e1.getMessage());
			System.exit(1);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			System.exit(2);
		}
		
		String[] data = new String[10];
		for(int i=0;fileReader.hasNext();i++) {
			data[i] = fileReader.nextLine();
		}
		
		return data;
		
	}
}
