package wbs.jdbc.dao;

public class PersistenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PersistenceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PersistenceException(String message) {
		System.out.println(message);
	}

	public PersistenceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PersistenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
}
