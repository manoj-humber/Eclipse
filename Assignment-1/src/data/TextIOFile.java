package data;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TextIOFile {

	private static File myFile = new File("record.txt");
	
	public static void writeRecord(String date, String city, int cases, int deaths, int recovered) throws IOException {
		try (PrintWriter writer = new PrintWriter(new FileWriter(myFile,true))){
		writer.println(date+","+city+","+cases+","+deaths+","+recovered);
		} 
	}
		
	public static  Object[] findAll() throws IOException{
		Scanner scanner=new Scanner(myFile);
	ArrayList<String> records=new ArrayList<String>();
	while(scanner.hasNext()) {
		String record =scanner.nextLine();
		records.add(record);
	}
	scanner.close();
	return records.toArray();
	}
	
	
}


