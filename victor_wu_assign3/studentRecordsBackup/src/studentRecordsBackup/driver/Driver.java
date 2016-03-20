package studentRecordsBackup.driver;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

//From package primeThreads
import studentRecordsBackup.util.BSTBuilder;
import studentRecordsBackup.bst.Node;
import studentRecordsBackup.util.FileProcessor;
import studentRecordsBackup.util.OddEvenFilterI;
import studentRecordsBackup.util.EvenFilterImpl;
import studentRecordsBackup.util.OddFilterImpl;

class Driver {
public static void main(String[] args) {
	for (String s : args)
		if (s.equals("--help") || s.equals("-h")) {
			System.out.println("Usage ./Driver [input file]");
			System.exit(0);
		}
	if (args.length != 2) {
		System.out.println("Invalid Arguments. Please use -h or --help flags for help");
		System.exit(-1);
	}

	FileProcessor myFileProcessor = new FileProcessor(args[0]);
	int UPDATE_VALUE = Integer.parseInt(args[1]);	

	BSTBuilder main_BSTBuilder = new BSTBuilder();
	BSTBuilder backup_1_BSTBuilder = new BSTBuilder();
	BSTBuilder backup_2_BSTBuilder = new BSTBuilder();
	main_BSTBuilder.createNewBSTProduct();
	backup_1_BSTBuilder.createNewBSTProduct();
	backup_2_BSTBuilder.createNewBSTProduct();



	int student_record;
	String line;
	OddEvenFilterI evenOddFilter = new OddEvenFilterI();
	EvenFilterImpl evenFilter = new EvenFilterImpl();
	OddFilterImpl oddFilter = new OddFilterImpl();
	while ((line = myFileProcessor.readLineFromFile()) != null) {
		student_record = Integer.parseInt(line);
		Node subject = main_BSTBuilder.buildNode(student_record);
		subject.registerObserver(backup_1_BSTBuilder.buildNode(student_record),evenFilter);
		subject.registerObserver(backup_2_BSTBuilder.buildNode(student_record),oddFilter);
	}
}
}
