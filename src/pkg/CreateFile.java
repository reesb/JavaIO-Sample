package pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String args[]) throws IOException {

		try {
			File file = new File("file.txt");
			file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < 1000; i++) {
				writer.write("Sample text here" + System.lineSeparator());
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
