package wordCount.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.grepVisitor;
import wordCount.visitors.WordCountVisitor;


import wordCount.treesForStrings.TreeBuilder;
import wordCount.visitors.TreeProcessingVisitorI;

public class Driver{
    
    public static void main(String args[]) throws Exception{
        if(args.length != 4){
            System.err.println("Invalid number of arguments");
            System.err.println("Must be in the format <input filename> " +
                               "<output filename> <numIterations> <searchString>");
            System.exit(1);
        }
        
        try{
            File infile = new File(args[0]);
            File outFile = new File(args[1]);
            final int numIterations = Integer.parseInt(args[2]);
            String searchString = args[3];
            //final int UPDATE_VALUE = Integer.parseInt(args[1]);
            System.out.println("Search string is: " + searchString);
            InputStream is;
            is = new FileInputStream(infile);
            TreeBuilder tb = new TreeBuilder();
           	TreeProcessingVisitorI populateVisitor = new PopulateTreeVisitor(is);
            TreeProcessingVisitorI grepVisitor = new grepVisitor(searchString);
            TreeProcessingVisitorI wordVisitor = new WordCountVisitor();

            tb.accept(populateVisitor);
            tb.accept(grepVisitor);
            tb.accept(wordVisitor);

            
            
            
            
        } catch (NumberFormatException nfe){
            System.err.println("Please make sure there is a valid integer argument for numIterations");
            nfe.printStackTrace();
            System.exit(1);
        } catch (FileNotFoundException fnfe){
            System.err.println("The input file doesn't exist.  Please pass in a valid file name");
            fnfe.printStackTrace();
            System.exit(1);
        } catch (Exception e){
            System.err.println("Please double check your arguments." +
                               "Make sure the file exists and there are the right number of arguments");
            e.printStackTrace();
            System.exit(1);
        }
    }
}