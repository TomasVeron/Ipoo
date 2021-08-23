package tp5.eje2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class ConversorSwing implements Observer {
    Conversor c1 = new Conversor();
    JTextArea moneyToConvert = new JTextArea();
    JTextArea moneyConverted = new JTextArea();
    JComboBox toConvert = new JComboBox();
    JComboBox converted = new JComboBox();
    JButton calculateConv = new JButton("Convert");
    JButton clean = new JButton("Clean");
    JButton recharge = new JButton("Recharge");

    public ConversorSwing() {
        components();
    }

    public JFrame components() {
        JFrame frame = new JFrame("conversor of money");
        frame.setContentPane(getPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        actionListener();
        c1.addObserver(this);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    public void actionListener() {
        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moneyConverted.setText("");
                moneyToConvert.setText("");
            }
        });
        calculateConv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    c1.action((Money) toConvert.getSelectedItem(), (Money) converted.getSelectedItem(), Double.parseDouble(moneyToConvert.getText()));
                } catch (NumberFormatException ex) {
                    moneyConverted.setText("No se a registrado un saldo inicial, vuelve a intentarlo.");
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPrincipal() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0, 1));
        panel1.add(moneyToConvert);
        panel1.add(getPanelEntrada());
        panel1.add(moneyConverted);
        panel1.add(getPanelSalida());
        return panel1;
    }

    public JPanel getPanelEntrada() {
        JPanel panel = new JPanel();
        toConvert.addItem(Money.Dolar);
        toConvert.addItem(Money.Pesos);
        toConvert.addItem(Money.Euro);
        converted.addItem(Money.Dolar);
        converted.addItem(Money.Pesos);
        converted.addItem(Money.Euro);
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("from"));
        panel.add(toConvert);
        panel.add(new JLabel("to"));
        panel.add(converted);
        return panel;
    }

    public JPanel getPanelSalida() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(calculateConv);
        panel.add(clean);
        panel.add(recharge);
        return panel;
    }

    public static void main(String[] args) {
        ConversorSwing c1 = new ConversorSwing();
    }

    @Override
    public void update(Observable o, Object arg) {
        Conversor o1 = (Conversor) o;
        moneyConverted.setText(String.valueOf(o1.getDineroFinal()));
    }
}
