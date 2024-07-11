package com.myapp.oops.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestReadFile2 {

	public static void main(String[] args) {
		
		try (InputStream  reader=
				Files.newInputStream(Paths.get(args[0]), StandardOpenOption.READ);){
		
			
			int data =0;
			
			while((data = reader.read())!= -1) {
				System.out.print(data);
			}
			}
		
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		

	}

}

// InputStream 

// Reader 

// OutputStream

//Writer


// java.io
// java.nio

// Object Serialization
// Object Deserialization
// java nio

//NIO Provides
// bidirectional channels
// Buffers => where our data resides , CharBuffer, IntBuffer
// Channels => Where our data comes from
// Selector => Asynchronous Operations

