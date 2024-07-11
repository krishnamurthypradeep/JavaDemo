package com.myapp.oops.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWriteFile {

	public static void main(String[] args) {
		try (BufferedWriter writer=
				new BufferedWriter(new FileWriter(args[0]));){
			
			writer.write("Welcome To Another World Of Java ˳§¶̐°™™™");
			
//			PrintWriter pw =new PrintWriter(writer);
//			pw.println("Welcome To World Of Java ˳§¶̐°™™™");
			
			}

			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
