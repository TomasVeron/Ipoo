package tp4.eje6;

public class FullDataBagException extends Exception {

    @Override
    public String getMessage() {
        return "la bolsa esta llena";
    }
}
