package tp4.eje2;

public class Divicion {

    public float dividir(int a, int b) {
        float div = 0;
        try {
            div = a / b;
        } catch (ArithmeticException ex) {
            div = 0;
            System.out.println("error: " + ex.getMessage());
        } finally {
            return div;
        }
    }
}
