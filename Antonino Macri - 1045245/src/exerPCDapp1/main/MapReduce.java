package exerPCDapp1.main;

import java.io.IOException;

/**
 * A singleton MapReduce job used to compute the word frequency given a dataset of words. 
 */
public class MapReduce {
	
	/** 
	 * Private (!) noarg constructor
	 */
	private MapReduce() {}
	
	/** 
	 * 
	 */
    public static synchronized MapReduce getInstance(){
    	throw new UnsupportedOperationException("");
    }
	
	/** 
	 * Initializes this object to the current configuration provided in input
	 * 
	 * @param args Parameters needed to setup and initialize the MapReduce jon
	 */
	public void init(String[] args) throws Exception {
    	throw new UnsupportedOperationException("");
	}

	/** 
	 * Setter method used to configure the InputFormat for this job (refer to input.*)
	 * 
	 * @param inputFormat Class type of the InputFormat used to feed the data for this job
	 */
	public <T> void setInputFormat(Class<T> inputFormat) {
    	throw new UnsupportedOperationException("");
	}
	
	/** 
	 * Getter method used to configure the OutputFormat for this job (refer to output.*)
	 * 
	 * @param outputFormat Class type of the OutputFormat used to persist the output of this job
	 */
	public <T> void setOutputFormat(Class<T> outputFormat) {
    	throw new UnsupportedOperationException("");
	}
	
	/** 
	 * Implements the logic of the word frequency computation. It is a blocking method 
	 * whose output is fed to the OutputFormat of this job.
	 * XXX: the produced output is ordered by key. Consider the running example:
	 * Inpout dataset: B A A 
	 * Persisted Output:
	 * 					A:2 
	 * 					B:1
	 */					
	public void awaitActivityTermination() throws IOException {
    	throw new UnsupportedOperationException("");
	}
}