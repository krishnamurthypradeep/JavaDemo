package com.myapp.oops.io;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPathNIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Path path1 = Paths.get("Documents","pradeep");
		Path path2 = Paths.get("/Documents/pradeep");
		
		URI uri = URI.create("file:///Documents/pradeep");
		
		Path path3 = Paths.get(uri);

	}

}
