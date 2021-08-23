package tp4.eje10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Cronometro implements Observer {
    private Tiempo time = new Tiempo();
    private JButton button1 = new JButton("Start");
    private JLabel l1 = new JLabel("00:00:00");


    public Cronometro() {
        components();
    }

    public void components() {
        JFrame frame = new JFrame("Cronometro");
        frame.setPreferredSize(new Dimension(250, 100));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time.action();
            }
        });
        time.addObserver(this);
        frame.setContentPane(getPanel());
        frame.setVisible(true);
        frame.pack();
    }

    public JPanel getPanel() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(button1, BorderLayout.SOUTH);
        panel1.add(l1, BorderLayout.CENTER);

        return panel1;
    }

    @Override
    public void update(Observable o, Object arg) {
        Tiempo t = (Tiempo) o;
        button1.setText(t.isRunning() ? "Stop" : "Start");
        l1.setText(t.isRunning() ? "00:00:00" : time.toString());
    }

    public static void main(String[] args) {
        Cronometro c1 = new Cronometro();
        System.out.println();
    }
}
