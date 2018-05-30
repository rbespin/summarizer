/**
 * @author Robert Espinoza
 * The purpose of this program is to summarize articles
 */
import java.util.*;
import java.io.*;

public class Summarizer{

   /**
	* canSummarize determines whether or not the input string can be
	* summarized.
	* @param text - The string of text testing summarizability
	* @return Returns whether or not string can be summarized
	* @throws IllegalArgumentException if input string is not a valid text
	* file or string
	*/
   public static boolean canSummarize(String input) throws IOException{
	  if(!(input instanceof String)){
		 File file = new File(input);

		 if(file.exists()){
			Scanner scanner = new Scanner(file);
			if(!scanner.hasNext()){
			   return false;
			}
			if(!(scanner.next() instanceof String)){
			   return false;
			}
			else{
			   return true;
			}
		 }
		 else{
			return false;
		 }
	  }
	  return false;
   }

   public ArrayList<E> wordCount(String input){




   public static void main(String[] args) throws IOException{
	  if((args.length != 1) || !(args[0] instanceof String)){
		 System.err.println("Usage: java Summarizer [input text file or " +
			   "input text string]");
	  }
	  System.out.println(args[0]);


   }

}

/*
   Game plan: 
   1) Divide article into sentenves
   2) Calculate the word frequency in article
   3) Calculate sentence values relative to word frequencies
   4) Output summarized article

Usage: java Summarizer [input text file]

 */
