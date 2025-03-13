package com.jdc.mkt.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DBufferedReadWriteTest {

	private static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void bufferIOTest() {
		writeFile("Hello Java");
		readFile();
	}

	private void readFile() {
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {			
			
			while(in.ready()) {
				System.out.println(in.readLine());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void writeFile(String message) {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
			
			out.write(message);
			out.newLine();
			out.write(message);
			out.append(" Developer");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
