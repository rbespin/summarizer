/**
* Name: Robert Espinoza
*/

import junit.framework.TestCase;
import java.util.*;
import java.io.*;

/**
 * jUnit tests for Summarizer
 *
 * @author Robert Espinoza
 */

public class SummarizerTester extends TestCase{


   public void setUp(){
   }

   public void testCanSummarizeException() throws IOException{
	  try{
		 Summarizer.canSummarize((43));
		 fail("should have thrown an exception");
	  } catch(IllegalArgumentException e){}
   }



}
