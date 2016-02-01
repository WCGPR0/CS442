/**
 * CS442, Programming Design Patterns
 * Driver -- Main Driver class executing main program
 * @author	Victor Wu
 */ 

public class Driver
{
	public static void main(String[] args)
	{
	if (args.length != 1) {
		System.err.println("Invalid amount of arguments. \n Try 'Driver --help' for more information");
		System.exit(1);
		} 
	else if (args[0].equals("--help")) {
		System.out.println("Usage: Driver [FILE]...\nFinds the most occuring word in the FILE (the current directory by default).");
		System.exit(0);
	}
	else {
		FileProcessor myFileProcessor = null;
		try {
			myFileProcessor = new FileProcessor(args[0]); //< Construction of the FileProcessor class
		} catch (Exception e) {
			System.err.println("Program terminated");
			System.exit(1);
		} 
		StringOperations myStringOperations = new StringOperations(); //< Construction of the StringOperation class
		String line;
		// Reads line by line through the FileProcessor, then manipulate it using StringOperation class
		while ((line = myFileProcessor.readLineFromFile()) != null)
			myStringOperations.add(line);
		myStringOperations.max(); //< Calculates the maximum value for the StringOperation class
		System.out.printf("The most frequently occuring element is ");
		Boolean flag = false; //< Flag in the event of more than one key with the same value
		for (String name : myStringOperations.getKeys()) {	
			if (flag == false) System.out.printf("%s", name);
			else System.out.printf(" and %s",name);
			flag = true;
		}
		System.out.printf(". It appears %d times.%n", myStringOperations.getValue());
		}
	}

	// To be implemented, when the need for debugging arises
	public String toString() {
		return super.toString();
	}
}
