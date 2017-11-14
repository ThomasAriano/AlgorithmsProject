import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class DataGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a file name:");
		String file_name = input.nextLine();

		System.out.println("Enter a data size: ");
		int data_size = input.nextInt();
		data_size = (int) Math.pow(2, data_size);
		System.out.println("Generating file (" + file_name + ") with data sizes (" + data_size + ")");

		Random rand = new Random(69);

		//String output_string = "";

		try {
			PrintWriter fileWriter = new PrintWriter(new File(file_name));

			for (int count = 0; count < 10; count++) {
				String output_string = "";

				System.out.println("Line: " + (count + 1));
				for (int i = 0; i < data_size; i++) {
					output_string += (rand.nextInt(10000 + 1) + ", ");
				}
				output_string += ("\r\n\r\n");
				fileWriter.print(output_string);
			}
			
			fileWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("This should not happen, since we are creating the file...");
			e.printStackTrace();
		}

		System.out.println("Done.");
	}

}
