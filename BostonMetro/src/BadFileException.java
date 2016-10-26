
public class BadFileException extends Exception {

	/**
	 * 
	 */
	
	private String message;
	private static final long serialVersionUID = 1L;

	public BadFileException(String errorMessage) {
		message = errorMessage;
		System.out.println("This is working");
	}

}
