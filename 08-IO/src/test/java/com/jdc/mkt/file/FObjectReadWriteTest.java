package com.jdc.mkt.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.dto.Address;
import com.jdc.mkt.dto.Person;

public class FObjectReadWriteTest {

	private static File file;

	@BeforeAll
	static void init() throws IOException {
		file = new File("person.obj");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void dataIOTest() {
		writeObjectFile("Hello Java");
		readObjectFile();
	}

	private void readObjectFile() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {			
			Person p1 = (Person) in.readObject();
			System.out.println(p1.getName()+"\t"+p1.getAge());
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void writeObjectFile(String message) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
				Person p1 = new Person("Andrew", 10,new Address("Yangon"));
				out.writeObject(p1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}






