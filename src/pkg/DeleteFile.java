package pkg;

import java.io.File;

public class DeleteFile {
	public static void main(String args[]) {

		File file = new File("C:/Users/Rees/sandbox/JavaIO/file.txt");
		file.delete();

	}
}
