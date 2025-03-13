package com.jdc.mkt.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BFileInputStreamTest {

	private static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void fileIOTest() {
		writeFile("Hello Java");
		readFile();
	}

	private void readFile() {
		try (FileInputStream in = new FileInputStream(file)) {			
			for(byte b : in.readAllBytes()) {
				char c = (char) b; 
				System.out.println(c);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void writeFile(String message) {
		try (FileOutputStream out = new FileOutputStream(file)) {
			byte[] bytes = message.getBytes();
			out.write(bytes);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
