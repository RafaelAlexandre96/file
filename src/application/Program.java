package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void notMain(String[] args) {
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
	}
	
	public static void notMainToo(String[] args) {
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		
		for(File folder : folders)
			System.out.println(folder);
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES:");
		
		for(File file : files)
			System.out.println(file);
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}
}