package br.com.mgoficina.exception;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidationException(String msg) {
		super(msg);
	}
	
	public ValidationException(String errorMsg, Throwable err) {
        super(errorMsg, err);
    }
}
