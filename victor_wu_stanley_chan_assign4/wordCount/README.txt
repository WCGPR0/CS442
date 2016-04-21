CS442 Design Patterns
Spring 2016
PROJECT 4 README FILE

Due Date: Thursday, April 21, 2016
Submission Date: Tuesday, February 23, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: FULL
Author(s): Victor Wu, and Matt Price
e-mail(s): vwu4@binghamton.edu, and mprice3@binghamton.edu


PURPOSE:

[
	
]

PERCENT COMPLETE:

[

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
  Node.java, the file responsible for encapsulating a node object
  TreeBuilder.java, the file responsible for creating nodes and forming a tree
  grepVisitor.java, the file responsible for finding/searching nodes
  PopulateTreeVisitor.java, the file responsible for populating the tree
  TreeProcessingVisitorI.java, the interface for PopulateTreeVisitor
  WordCountVisitor.java, the file responsible for counting words operations in the tree 
  README, the text file you are presently reading
]

SAMPLE OUTPUT:

[


]

TO COMPILE:

[
## To clean:
  ant -buildfile src/build.xml clean

## To compile: 
  ant -buildfile src/build.xml all
]

TO RUN:

[
## To run:
  ant -buildfile src/build.xml run -Darg0=<ARG1> -Darg1=<ARG2> -Darg2=<ARG3>
	Where ARG1 is FilePath (input), ARG2 is FilePath (output), ARG3 is performance loops, ARG4 is searched string
  For example:   ant -buildfile src/build.xml -Darg0=input.txt -Darg1=output.txt -Darg2=2 -Darg3="Hello"

## To run by Java Jar standalone file:
  Please run as: java -jar BUILD/jar/primeThreads.jar <ARG1> <ARG2> <ARG3>
	Where ARG1 is FilePath (input), ARG2 FilePath (output), ARG3 is performance loops, ARG4 is searched string
  For example:   java -jar BUILD/jar/primeThreads.jar input.txt output.txt 2 "Hello"

## To run by Java classes:
  Please run as: java -ea wordCount.driver.Driver <ARG1> <ARG2> <ARG3> <ARG4>
	Where ARG1 is FilePath (input), ARG2 is FilePath (output), ARG3 is performance loops, ARG4 is searched string
  For example:   java -ea primeThreads.driver.Driver input.txt output.txt 2 "Hello"
TO TAR:

[
  ## To create tarball for submission
  ant -buildfile src/build.xml tarzip
]

  Just extract the files and then do a "make".

SPACE/TIME COMPLEXITY:

[
]

EXTRA CREDIT:

[
	N/A
]


BIBLIOGRAPHY:

Victor Wu
Stanley Chan

[
	{SOURCES}
]

ACKNOWLEDGEMENT:

[
	Special shoutout to Professor Madhusudhan Govindaraju for this fun assignment,
	and Gourav Rattihalli for grading this assignment!
]
