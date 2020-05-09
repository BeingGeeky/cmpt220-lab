package labxi;

import java.io.*;
import java.util.*;

public class Splitter {
		public static void main(String[] args) throws Exception{
			/*
			System.out.println(args[0]);
			System.out.println(args[1]);

			try {
				
				if (args.length != 2){
					System.out.println("Useage: java FindText sourceFile not found");
					System.exit(0);
				}

				//instantiate variables
				int pieces = 0;
				int size = 0;
				int split = 0;
				int splitSize = 0;
				File file = new File (args[0]);
				BufferedInputStream input=null;
				FileInputStream inputStream=null;
			
				System.out.println("the file is " + file);
				System.out.println("the file size is " + size);
				//create buffer input
			
				System.out.println("input: " + input);
				System.out.println("inputStream: " + inputStream);
				
				inputStream = new FileInputStream (file);
				input = new BufferedInputStream(inputStream);
				System.out.println("input: " + input);
				System.out.println("inputStream: " + inputStream);
			
			//assign input values
			pieces = Integer.parseInt(args[1]);
			long fileSize = input.available();
			int splitFile = (int) Math.ceil(1.0 * fileSize / pieces);
			System.out.println("File size is: " + input.available() + " bytes.");
			
			//
			for (int i = 1; i <= pieces; i++){
				BufferedOutputStream output = new BufferedOutputStream (new FileOutputStream(new File (args[0] + "." + i)));
				int x = 0;
				int fileCount = 0;
				while (fileCount++ < splitSize && (x = input.read()) !=-1){
					output.write(x);
				}
				output.close();
			} 
			input.close();
			}
			catch (Exception e){
				System.out.println("Exception has occurred in the class. Program will exit.");
				System.exit(0);
			}*/
		}
}
