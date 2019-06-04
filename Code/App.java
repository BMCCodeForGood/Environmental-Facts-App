/*
 * File    = App.java
 * Purpose = To create a web app that displays environmental facts
 * Date    = Thursday, March 7, 2019
 * Written by Nisha Choudhary, Marilyn Harbert, and Sarah Golobish
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		// This takes a sample text file, parse it into our facts array and 
		// then prints a random String from the facts array. 
		
		// Make sure to change out the file to be the file path you want. 
		File file = new File("src/EnviroFacts.txt");
		BufferedReader br;
		String st;
		int index = 0;
		
		// make sure to change out the 4 for the number of lines in the file
		String[] facts = new String[4];
		try {
			br = new BufferedReader(new FileReader(file));
			try {
				while((st = br.readLine()) != null) {
					facts[index] = st;
					index++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int rand =  (int) ((int) (facts.length)*(Math.random()));
		String fact = facts[rand];
		System.out.println("This is a fact " + fact);
	}
}
