package tp4.eje6;

public class EmptyDataBagException extends Exception {

    @Override
    public String getMessage() {
        return "la bolsa esta vacia";
    }
}
