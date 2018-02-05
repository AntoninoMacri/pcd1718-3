package exerPCDapp1.input;

import java.io.IOException;
import java.util.stream.Stream;

/**
 * Class that produces a Stream<String> from an input read from a Stream Socket. 
 * The Socket Stream is comprised of space separated bag of words representing our dataset.
 */
public class NetworkSpaceSepInputFormat implements InputFormat {

	/**
	 * Sole constructor of the class
	 * 
	 *  @param addr A String representing the address of the remote end-point feeding the data
	 *  @param port A char (unsigned 16b) representing the port of the remote end-point feeding the data
	 */
	public NetworkSpaceSepInputFormat(String addr, char port) {}
	
	/**
	 * Produces a finite Stream<String> from the underlying dataset assuming 
	 * it can fit entirely on memory.
	 * 
	 * @return A Stream<String> representing the contents of the dataset
	 */
	public Stream<String> getResourceAsStream() throws IOException {
		throw new UnsupportedOperationException("");
	}

	
}
