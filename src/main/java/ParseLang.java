package parse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * parse : a class to parse csv files into a string list
 * 
 * @param args : args not used, user input is gathered via java.util.Scanner
 * 
 *             use: user enters es/en to choose which file to parse. The file is
 *             then parsed and stored in an array list.
 */
public class ParseLang {

	public static ArrayList<String> parseLang(String lang) throws FileNotFoundException, IOException {

		ArrayList<String> letters = new ArrayList<String>();// Create an ArrayList object

		// tryen to create a buffered reader for a file reader
		try (BufferedReader csv = new BufferedReader(new FileReader("/"+lang + ".csv"))) {

			// creating a temp String row for the row data
			String row;

			// creating a string array to hold the row data
			String[] data = null;

			// Read each line parse it into array split by comma
			while ((row = csv.readLine()) != null) {
				// System.out.println(row);
				data = row.split(",");
				for (String s : data) {
					letters.add(s);
				}
			}

		}
		return letters;
	}

	public static void main(String[] args) throws IOException {
		parseLang("en");
	}

}
