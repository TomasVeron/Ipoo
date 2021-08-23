package tp4.eje6;

import java.util.ArrayList;
import java.util.List;

public class DataBag<T> {

    private int size;
    private List<T> elements;

    public DataBag(int size) {
        setSize(size);
        setElements(new ArrayList<T>(size));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(ArrayList<T> elements) {
        this.elements = elements;
    }

    public void add(T element) throws FullDataBagException {
        if (getElements().size() == getSize()) {
            throw new FullDataBagException();
        } else {
            getElements().add(element);
        }
    }

    public void remove(T element) throws EmptyDataBagException {
        if (getElements().isEmpty()) {
            throw new EmptyDataBagException();
        } else {
            getElements().remove(element);
        }
    }

    public static void main(String[] args) {
        DataBag<String> b1 = new DataBag<>(10);
        try {
            b1.add("hola");
            b1.add("q");
            b1.add("w");
            b1.add("e");
            b1.add("r");
            b1.add("hola");
            b1.add("hola");
            b1.add("hola");
            b1.add("hola");
            b1.add("hola");
            b1.add("hola");

        } catch (FullDataBagException ex) {
            ex.printStackTrace();
        }
    }
}



