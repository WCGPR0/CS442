/**
 * CS442, Programming Design Patterns
 * FileOperations -- Perform File I/O operations, such as reading input files
 * @author	Victor Wu
 */ 

package genericCheckpointing.util.FileProcessor;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor
{	
	
	BufferedReader in;
	/** 
	 * Default Constructor, and initializes file I/O stream
	 *
	 * @param fileName the name of the file to be read
	 */
	public FileProcessor(String fileName) {
		try {
			Path path = Paths.get(fileName);
			in = Files.newBufferedReader(path);
		} catch (Exception e) {
			System.err.println("Exception error opening file " + e);
		}
	}
	/**
	 * Reads from the file by a single line
	 *
	 * @return	the line read from the file
	 */
	public synchronized String readLineFromFile() {
		String line = null;
		try {
			line = in.readLine();	
		} catch (Exception e) {
			System.err.println("Exception error while reading line from from file " + e);
		}
		return line;
	}

	/**
	 * Writes to the file by a single line
	 *
	 * @param line the String to be appended to the file
	 */
	public synchronized void writeLineToFile(String line) {
		Files.write(path, line, Charset.forName("UTF-8"));
	}
	
	// To be implemented, when the need for debugging arises
	public String toString() {
		return super.toString();
	}

	protect void finalize() throws Throwable {
		in.close();
		super.finalize();
	}
}
