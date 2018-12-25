package pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditFile {
	public static void main(String args[]) throws IOException {
		try {
			String oldString = "here";
			String newString = "there";

			File file = new File("C:/Users/Rees/sandbox/JavaIO/file.txt");
			String oldContent = "";
			BufferedReader reader = new BufferedReader(new FileReader(file));

			String line = reader.readLine();
			while (line != null) {
				oldContent += line + System.lineSeparator();
				line = reader.readLine();
			}

			String newContent = oldContent.replaceAll(oldString, newString);

			FileWriter writer = new FileWriter(file);
			writer.write(newContent);

			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
