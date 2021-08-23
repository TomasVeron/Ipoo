package tp4.eje9;

import javax.swing.*;
import java.awt.*;

public class HolaMundo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HolaMundo");
        JPanel p1 = new JPanel();
        frame.getContentPane().add(new Label("hola mundo"));
        frame.pack();
        frame.setVisible(true);
    }

}
