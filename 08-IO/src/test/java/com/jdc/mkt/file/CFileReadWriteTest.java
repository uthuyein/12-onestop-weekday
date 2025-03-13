package com.jdc.mkt.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CFileReadWriteTest {

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
		try (FileReader in = new FileReader(file)) {			
			
			while(in.ready()) {
				System.out.print((char)in.read());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void writeFile(String message) {
		try (FileWriter out = new FileWriter(file)) {
			
			out.write(message);
			out.append("Developer !");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
