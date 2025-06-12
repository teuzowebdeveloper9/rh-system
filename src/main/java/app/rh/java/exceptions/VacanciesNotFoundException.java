package app.rh.java.exceptions;

public class VacanciesNotFoundException extends  RuntimeException{
    public VacanciesNotFoundException(String message) {
        super(message);
    }
}
