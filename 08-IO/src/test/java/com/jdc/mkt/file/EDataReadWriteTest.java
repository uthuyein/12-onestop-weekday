package com.jdc.mkt.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EDataReadWriteTest {

	private static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("data.dat");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void dataIOTest() {
		writeDataFile("Hello Java");
		readDataFile();
	}

	private void readDataFile() {
		try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {			
			
			System.out.println(in.readUTF());
			System.out.println(in.readInt());
			System.out.println(in.readBoolean());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void writeDataFile(String message) {
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
			
			out.writeUTF(message);
			out.writeInt(20);
			out.writeBoolean(true);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
