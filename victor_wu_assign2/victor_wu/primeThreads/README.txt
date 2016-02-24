CS542 Design Patterns
Spring 2016
PROJECT 2 README FILE

Due Date: Monday, February 29, 2016
Submission Date: Tuesday, February 23, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: FULL
Author(s): Victor Wu, and Matt Price
e-mail(s): vwu4@binghamton.edu, and mprice3@binghamton.edu


PURPOSE:

[
	In this project, we practiced good design principles practiced in class, and used various classes to avoid clustering the codebase. We created thread factory, created synchronized actions, and stalled until they all completed. We also used a static Logger to increase flexibility in debugging through flags by users. 
]

PERCENT COMPLETE:

[
	I believe I completed 100% of the Project based on my understanding of the projects, and the results obtained from my tests.
]

PARTS THAT ARE NOT COMPLETE:

[
	NONE at the moment. Would like to run more extensive testing.
]

BUGS:

[
	NONE at the moment.
]
FILES:

[
  Included with this project are 9 files:

  Driver.java, the main executing driver class
  Results.java, the file responsible for storing and printing out data
  StdoutDisplayInterface.class, the interface for printing out data inherited by Results.java
  CreateWorkers.java, the file responsible for creating worker threads
  WorkerThread.java, the worker threads responsible for reading input files
  FileProcessor.java, the file responsible for reading files
  IsPrime.java, a helper utility file for checking if a number is odd (misnomer)
  Logger.java, a utility file for logging and printing system messages given certain flags 
  README, the text file you are presently reading
]

SAMPLE OUTPUT:

[
  Copy and paste a recent CORRECT output from your test runs, ALONG with the
  command line. Cut it short if more than 10 lines. Here is a sample:

  remote07:~/CS442/victor_wu_assign2/victor_wu/primeThreads/BUILD/classes> java -ea primeThreads.driver.Driver ../../primes.txt 5 4
  The args[0] is: ../../primes.txt
  FileProcessor Constructed
  Results Constructed
  IsPrime Constructed  
  CreateWorkers Constructed  
  WorkerThread Constructed  
  WorkerThread Constructed
  WorkerThread Constructed 
  WorkerThread Constructed   
  The sum of all the prime numbers is:5115
]

TO COMPILE:

[
## To clean:
  ant -buildfile src/build.xml clean

## To compile: 
  ant -buildfile src/build.xml all

## To run by specifying arguments from command line [similarly for the 2nd argument and so on ...]
## We will use this to run your code
  ant -buildfile src/build.xml run -Darg0=firstarg 

## To run by specifying args in build.xml (just for debugging, not for submission)
  ant -buildfile src/build.xml run

## To create tarball for submission
  ant -buildfile src/build.xml tarzip

  Just extract the files and then do a "make".
]

TO RUN:

[
  To run, NOTE the -ea flags. It enables assertions, which, disabled by default, check if user arguments are valid.

  Please run as: java -ea <ARG1> <ARG2> <ARG3>
	Where ARG1 is FilePath, ARG2 is number of threads, ARG3 is debug level
  For example:   java -ea primeThreads.driver.Driver ../../primes.txt 4 4
]

SPACE/TIME COMPLEXITY:

[
We decided to use a Stack data structure for our Results file. The reasoning behind this is that insertion for Stack is O(1), and deletion is O(1). Since we only need to push everything on stack, this will be O(n); and we just need to pop everything on stack, this will also be O(n). The resulting O(2n) is equivalently bounded by O(n), hence most optimal for this problem, in terms of worst time complexity.

If we looked at average time complexity, skip lists and trees are options, but we decided worst case will be our main priority. Of course, there are other data structures that will have the same worst time complexity such as linked lists. But we felt the deciding notion to use Stack because it has less overhead (less functionality), while in theory Stack and Linked Lists both have O(n) space complexity.

Since we only need the properties of a Stack, using a LinkedList would be an overkill - not to mention, the extra functionalities takes up memory.

]

EXTRA CREDIT:

[
	N/A
]


BIBLIOGRAPHY:

Victor Wu
Matt Price

[
	{SOURCES}
]

ACKNOWLEDGEMENT:

[
	Special shoutout to Professor Madhusudhan Govindaraju for this fun assignment.
]
