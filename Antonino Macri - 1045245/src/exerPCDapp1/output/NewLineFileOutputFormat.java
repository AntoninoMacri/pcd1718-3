package exerPCDapp1.output;

import java.io.IOException;
import java.util.Map;

/**
 * Class that saves the result of the computation in an output file.
 * Consider the following running example:
 * 	Input dataset: 	B, A, A
 *  Output file: 	
 *  				A:2
 *  				B:1
 */
public class NewLineFileOutputFormat implements OutputFormat {
	
	/**
	 * Sole constructor of the class.
	 * 
	 * @param outputFile	A String denoting the absolute filePath of the output file
	 */
	public NewLineFileOutputFormat(String outputFile) {}
			
	/**
	 * Dumps the resulting word frequency map in the output stream. Each entry stands in its own line.
	 * 
	 * @param wordCount The ordered (by key) map object of the dump operation.
	 */
	public void dumpWordCount(Map<String, Integer> wordCount) throws IOException {
    	throw new UnsupportedOperationException("");
	}

	
}
