/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.external;

/**
 * @author s0700260
 *
 */
public class RequestError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4997918928319576733L;

	/**
	 * 
	 */
	public RequestError() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public RequestError(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public RequestError(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public RequestError(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
