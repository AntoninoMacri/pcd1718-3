package exerPCDapp1.main;

import exerPCDapp1.input.CommaSepFileInputFormat;
import exerPCDapp1.output.NewLineFileOutputFormat;
import exerPCDapp1.util.GenerateCommaSeparatedDataset;

import java.io.IOException;

public class WordCountJob {

	/**
	 * A sample main consisting of job configuration and launch.
	 **/
	public static void main(String args[]) {
				
		GenerateCommaSeparatedDataset.generate();
		args = new String[]{GenerateCommaSeparatedDataset.dataset, "pathToOut"};				
		
		if(args == null || args.length < 2) {
			System.err.println("Missing the (1) dataset filepath (2) output directory");
			System.exit(-1);
		}
					
		/** 1. Initialize context */
		MapReduce mapReduce  = MapReduce.getInstance();

		/** 2. Set In/Out Format*/
		mapReduce.setInputFormat(CommaSepFileInputFormat.class);
		mapReduce.setOutputFormat(NewLineFileOutputFormat.class);
		
		/** 3. Initialize the features */
		try {
			mapReduce.init(args);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		/** 4. Initialize the features */
		try {
			mapReduce.awaitActivityTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
