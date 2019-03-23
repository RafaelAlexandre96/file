package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;*/

public class Program {

	/*public static void main(String[] args) {
		String path = "c:\\tmp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e);
		} 
	}*/
	
	public static void main(String[] args) {
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "c:\\tmp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}