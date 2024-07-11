package com.myapp.oops.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// java.util.stream.Stream
// java.io.InputStream
public class TestReadcsvUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path= Path.of("products.csv");
		
		List<String> products= null;
		
		try (Stream<String> lines= Files.lines(path)){
			// java functional programming
			// java lambda functions
			
			// java functional programming & streams
			
		Predicate<String> predicate = line -> !line.startsWith("#");
			
		products= 	lines.filter(predicate).collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(products);

	}

}

// what is an interface


