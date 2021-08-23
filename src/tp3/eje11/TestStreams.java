package tp3.eje11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {

    private List<String> l;

    public TestStreams(List<String> l) {
        setL(l);
    }

    public List<String> getL() {
        return l;
    }

    public void setL(List<String> l) {
        this.l = l;
    }

    public List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!filter.equals(line)) {
                result.add(line);
            }
        }
        return result;
    }

    public List<String> getFilterOutputStreams(List<String> lines, String filter) {
        return lines.stream()
                .filter(x -> !x.equals(filter))
                .collect(Collectors.toList());
    }


}
