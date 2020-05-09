/*
 * Cassie Schaaf
 * Object Oriented Programming
 * Lab X Problem 1
 * Find thous
 */

package problem1;

import java.io.*;
import java.util.Scanner;

public class FindText {

	public static void main(String[] args) throws Exception {
		//define file
		java.io.File file = new java.io.File(args[1]);

		//instantiate variables
		int numberOfPieces = 0;
		Scanner input = new Scanner(file);
		File text = new File(args[0]);
		
		//Exception handling
		if (args.length != 2){
			System.out.println("Useage: java FindText sourceFile not found");
			System.exit(0);
		}
		
		//find thou's
		while (input.hasNext()){

		}

	}
}