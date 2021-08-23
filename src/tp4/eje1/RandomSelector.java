package tp4.eje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector<T> {
    private List<T> elements;

    public RandomSelector(List<T> elements) {
        setElements(elements);
    }

    public RandomSelector() {
        setElements(new ArrayList<T>());
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public void addSelect(T obj) {
        getElements().add(obj);
    }

    public T selectNext() throws IndexOutOfBoundsException {
        if (getElements().isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        int rnint = new Random().nextInt(getElements().size());
        return getElements().get(rnint);
    }

    public static void main(String[] args) {
        RandomSelector<String> r = new RandomSelector<String>();
        try {
            System.out.println("numero al azar: " + r.selectNext());
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}
