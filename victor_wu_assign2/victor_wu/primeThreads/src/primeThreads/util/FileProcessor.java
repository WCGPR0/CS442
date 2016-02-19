/**
 * CS442, Programming Design Patterns
 * FileOperations -- Perform File I/O operations, such as reading input files
 * @author	Victor Wu
 */ 

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
package primeThreads.util;

class FileProcessor
{
	private static final Logger LOGGER = new Logger();
	
	InputStream inStream;
	InputStreamReader inStreamReader;
	BufferedReader in;
	/** 
	 * Default Constructor, and initializes file I/O stream
	 *
	 * @param fileName the name of the file to be read
	 */
	FileProcessor(String fileName) {
	LOGGER.writeMessage("FileProcessor Constructed", Logger::DebugLevel::FOUR)
		try {
			Path path = Path.get(fileName);
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
	String readLineFromFile() {
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
