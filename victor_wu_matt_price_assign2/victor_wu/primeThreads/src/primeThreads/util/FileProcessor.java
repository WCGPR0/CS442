/**
 * CS442, Programming Design Patterns
 * FileOperations -- Perform File I/O operations, such as reading input files
 * @author	Victor Wu
 */ 

package primeThreads.util;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * FileProcessor class has a method readLineFromFile that reads line
 * by line input from a file
 * also has a toString method for debugging purposes
 */ 
public class FileProcessor
{
	private static final Logger LOGGER = new Logger();
	
	BufferedReader in = null;
	/** 
	 * Default Constructor, and initializes file I/O stream
	 *
	 * @param fileName the name of the file to be read
	 */
	public FileProcessor(String fileName) {
	Logger.writeMessage("FileProcessor Constructed", Logger.DebugLevel.CONSTRUCTOR);
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
	public String readLineFromFile() {
		String line = null;
		try {
			line = in.readLine();	
		} catch (Exception e) {
			System.err.println("Exception error while reading line from from file " + e);
		}
		return line;
	}
	
	// To be implemented, when the need for debugging arises
	public String toString() {
		return super.toString();
	}
}
