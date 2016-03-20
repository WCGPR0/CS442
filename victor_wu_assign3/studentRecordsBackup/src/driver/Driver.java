package studentRecordsBackup.driver;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

//From package primeThreads
import studentRecordsBackup.util.Logger;
import studentRecordsBackup.util.BSTBuilder;
import studentRecordsBackup.bst.Node;
import studentRecordsBackup.util.FileProcessor;

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
	int UPDATE_VALUE = args[1];	

	BSTBuilder main_BSTBuilder = new BSTBuilder();
	BSTBuilder backup_1_BSTBuilder = new BSTBuilder();
	BSTBuilder backup_2_BSTBUilder = new BSTBuilder();
	main_BSTBuilder.createNewBSTProduct();
	backup_1_BSTBuilder.createNewBSTProduct();
	backup_2_BSTBuilder.createNewBSTProduct();



	int student_record;
	String line;
	while (line = myFileProcessor.readLineFromFile()) {
		student_record = Integer.parseInt(line);
		Node subject = main_BSTBuilder.buildNode(student_record);
		subject.addObservers(backup_1.buildNode(student_record));
		subject.addObservers(backup_2.buildNode(student_record));
	}
}
}
