package app.rh.java.exceptions;

public class CandidatesNotFoundException extends RuntimeException{
    public CandidatesNotFoundException(String message) {
        super(message);
    }
}
