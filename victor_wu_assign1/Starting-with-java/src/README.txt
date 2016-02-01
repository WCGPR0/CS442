# Starting With Java
## Victor Wu
## CS442, Programming Design Patterns under Professor Madhusudhan Govindaraju

----------------------
Setup
----------------------
All files must be within the same (sub)directory:
 - Driver.java
 - FileProcessor.java
 - StringOperations.java

Use the command javac *.java to compile the project.

----------------------
Command Line Arguments
----------------------

Example:  java Driver XMLfile.xml

--help
  (optional) Additional help on command line usage.

-------------------------
Design Decisions & Issues
-------------------------
In this project, I used a hashtable for finding the most reoccuring names in the XML file. Space complexity was only a secondary concern, whereas speed and was primarily.
Outlined below is the big O for the average and worst case:

	Average	Worst case
Space	O(n)	O(n)
Search	O(1)	O(n)
Insert	O(1)	O(n)
Delete	O(1)	O(n)

Source: https://en.wikipedia.org/wiki/Hash_table

Since we had to iterate through the hashtable to find the most frequently occuring key based on the highest value, we can say that this will be O(n) - but since it's bounded by O(n) at worst case, I believe this to be the most efficient.

