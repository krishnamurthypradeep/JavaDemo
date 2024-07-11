package com.myapp.oops.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestWriteFile2 {

	public static void main(String[] args) {
		try (BufferedWriter writer=
				Files.newBufferedWriter(Paths.get(args[0]), StandardOpenOption.CREATE,
						StandardOpenOption.WRITE);){
			
			//writer.write("Welcome To  World Of Java3 Welcome To  World Of Java3");
			
			PrintWriter pw =new PrintWriter(writer);
			pw.printf("%d %o 0x%04x\n",12,8,248);
			
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
