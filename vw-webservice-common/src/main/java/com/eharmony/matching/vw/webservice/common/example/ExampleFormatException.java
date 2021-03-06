/**
 * 
 */
package com.eharmony.matching.vw.webservice.common.example;

/**
 * @author vrahimtoola
 * 
 *         Exception indicating that the format of an example isn't valid.
 *         Examples must be in the proper VW format, after all. I'm making this
 *         a subclass of RuntimeException as it indicates a programmer error,
 *         similar to NumberFormatException.
 */
public class ExampleFormatException extends IllegalArgumentException {

	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = -6238484930971388916L;

	private long exampleNumber = Long.MIN_VALUE;

	public ExampleFormatException() {
		super();
	}

	public ExampleFormatException(String message) {
		super(message);
	}

	public ExampleFormatException(Throwable cause) {
		super(cause);
	}

	public ExampleFormatException(String message, Throwable cause) {
		super(message, cause);
	}

	public long getExampleNumber() {
		return exampleNumber;
	}

	public ExampleFormatException(long exampleNumber) {
		super();
		this.exampleNumber = exampleNumber;
	}

	public ExampleFormatException(long exampleNumber, String message) {
		super(message);
		this.exampleNumber = exampleNumber;
	}

	public ExampleFormatException(long exampleNumber, Throwable cause) {
		super(cause);
		this.exampleNumber = exampleNumber;
	}

	public ExampleFormatException(long exampleNumber, String message, Throwable cause) {
		super(message, cause);
		this.exampleNumber = exampleNumber;
	}

	public void setExampleNumber(long exampleNumber) {
		this.exampleNumber = exampleNumber;
	}
}
