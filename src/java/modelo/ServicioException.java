package modelo;
//captura las excepciones de forma particular
public class ServicioException extends Exception {

    public ServicioException(String message) {
        super(message);
    }

    public ServicioException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
