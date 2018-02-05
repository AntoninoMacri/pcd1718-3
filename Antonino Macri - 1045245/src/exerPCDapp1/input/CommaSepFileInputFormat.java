package exerPCDapp1.input;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * Class that produces a Stream<String> from an input comma separated dataset of words.
 */
public class CommaSepFileInputFormat implements InputFormat {

	String dataset;

	/**
	 * Sole constructor of the class.
	 * 
	 * @param dataset A String denoting the absolute path of the dataset
	 */
	public CommaSepFileInputFormat(String dataset) {
	    this.dataset=dataset;
    }
	
	/**
	 * Produces a finite Stream<String> form the underlying dataset assuming
	 * it can fit entirely on memory.
	 * 
	 * @return A Stream<String> representing the contents of the dataset
	 */
	public Stream<String> getResourceAsStream() throws IOException {
		throw new UnsupportedOperationException();
	}
}
