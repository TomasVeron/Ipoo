package tp5.eje1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class FasesLunaresSwing implements Observer {
    private FasesLunares fase = new FasesLunares();
    private JTextField dia = new JTextField(5);
    private JTextField mes = new JTextField(5);
    private JTextField anio = new JTextField(5);
    private JButton calcular = new JButton("calcular");
    private JLabel imagen = new JLabel();
    private ImageIcon[] imagenes = new ImageIcon[8];

    public FasesLunaresSwing() {
        components();
    }

    public JFrame components() {
        for (int i = 0; i < imagenes.length; i++) {
            imagenes[i] = new ImageIcon("C:\\Users\\agust_\\Desktop\\FACULTAD\\2DO ANIO\\2DO CUATRIMESTRE\\IPOO\\Practica\\TrabajoPractico1\\src\\tp5\\eje1\\imagenes\\imagen" + i + ".jpg");
        }

        JFrame frame = new JFrame("Fases lunares");
        frame.setPreferredSize(new Dimension(250, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(getPanel());
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fase.action(ParseFecha(dia.getText() + "/" + mes.getText() + "/" + anio.getText()));
                } catch (NullPointerException ex) {
                    JDialog er = new JDialog(frame, "Error");
                    er.setLayout(new BorderLayout());
                    er.add(new JLabel("Error al ingresar la fecha. Vuelve a intentarlo"), BorderLayout.CENTER);
                    er.pack();
                    er.setVisible(true);
                }
            }
        });
        fase.addObserver(this);
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("INGRESE FECHA"));
        panel.add(getPanelDatos());
        panel.add(getPanelImagen());
        return panel;
    }

    public JPanel getPanelDatos() {
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(0, 2));
        panelDatos.add(new JLabel("dia"));
        panelDatos.add(dia);
        panelDatos.add(new JLabel("mes"));
        panelDatos.add(mes);
        panelDatos.add(new JLabel("anio"));
        panelDatos.add(anio);
        panelDatos.add(calcular);
        return panelDatos;
    }

    public JPanel getPanelImagen() {
        JPanel panelImagen = new JPanel();
        panelImagen.setLayout(new BorderLayout());
        panelImagen.add(new JLabel("fase"), BorderLayout.NORTH);
        panelImagen.add(getImagen(), BorderLayout.CENTER);
        return panelImagen;
    }

    @Override
    public void update(Observable o, Object arg) {
        FasesLunares o1 = (FasesLunares) o;
        getImagen().setIcon(imagenes[o1.getFase().getFase()]);
    }


    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public static void main(String[] args) {
        FasesLunaresSwing f1 = new FasesLunaresSwing();
        System.out.println();

    }
}

