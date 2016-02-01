/**
 * CS442, Programming Design Patterns
 * FileOperations -- Perform File I/O operations, such as reading input files
 * @author	Victor Wu
 */ 

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

class FileProcessor
{
	InputStream inStream;
	InputStreamReader inStreamReader;
	BufferedReader in;
	/** 
	 * Default Constructor, and initializes file I/O stream
	 *
	 * @param fileName the name of the file to be read
	 */
	FileProcessor(String fileName) {
		try {
			inStream = new FileInputStream(fileName);
			inStreamReader = new InputStreamReader(inStream); //Using default charset
			in = new BufferedReader(inStreamReader);
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
