package com.jdc.mkt.file;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AFileTest {
	
	@Test
	void createFileWithURI() throws URISyntaxException {
		URI uri = new URI("file:///Users/MKT/Desktop/data/datas/test.txt");
		File file = new File(uri);
		assertTrue(file.exists());
		
		URI ur = file.toURI();
		System.out.println(ur.getPath());
		
	}
	
	@Test
	@Disabled
	void checkAndCreateDirFileTest() throws IOException {
		File dir = new File("/Users/MKT/Desktop/data");
		assertTrue(dir.isDirectory());
		assertFalse(dir.isFile());
		
		File newDir = new File(dir,"datas");
		//assertTrue(newDir.mkdir());
		
		File file = new File(newDir,"test.txt");
		file.createNewFile();
	}
	

	@Test
	@Disabled
	void createFileTest() throws IOException {
		File file = createFile("/Users/MKT/Desktop/data", "test.txt");
		assertFalse(file.exists());
		
		file.createNewFile();
		assertTrue(file.exists());
		
		//file.delete();
		file.deleteOnExit();
		assertTrue(file.exists());
		
	}
	
	private File createFile(String path,String name) {
//		return (null != path && !path.isEmpty()) 
//				? new File(path,name): new File(name);
		
		if(null != path && !path.isEmpty()) {
			File p = new File(path);
			return new File(p,name);
		}
		return new File(name);
	}
}





