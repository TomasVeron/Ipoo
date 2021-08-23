package tp5.eje4.WeatherUI.App;


import ar.edu.unnoba.model.City;
import tp5.eje4.WeatherUI.Modelo.Clima;
import tp5.eje4.WeatherUI.Modelo.EstacionMetereologica;
import tp5.eje4.WeatherUI.Modelo.Localidad;
import tp5.eje4.WeatherUI.Modelo.Temperatura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;


public class WeatherApp implements Observer {

    private final EstacionMetereologica estacion = new EstacionMetereologica(new Localidad(String.valueOf(City.Junin), "Buenos Aires", "Argentina"));
    private final JLabel tempActual = new JLabel();
    private final JLabel iconClima = new JLabel();
    private final JButton ordenarTemp = new JButton("Temperatura");
    private final JButton ordenarFecha = new JButton("Fecha");
    private final JButton Limpiar = new JButton("Limpiar");
    private final JFrame frame = new JFrame("Weather UI");
    private final JList<Clima> historial = new JList<>();
    private final DefaultListModel<Clima> modelo = new DefaultListModel<>();
    private final JLabel tipoOrdenacion = new JLabel("Llegada");

    public WeatherApp() {
        components();
    }


    private void components() {
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(getTempActualPnl(), BorderLayout.NORTH);
        frame.getContentPane().add(getControlPnl(), BorderLayout.WEST);
        frame.getContentPane().add(getHistorialPnl(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                estacion.detenerServicio();
            }
        });
        actionListener();
        estacion.iniciarServicio();
        estacion.addObserver(this);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel getTempActualPnl() { //panel donde se muestra la temperatura actual
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 80));
        panel.setBorder(BorderFactory.createTitledBorder("Temperatura actual"));
        panel.setLayout(new GridBagLayout());
        ImageIcon cargando = new ImageIcon("src/tp5/eje4/WeatherUI/App/Resource/loading.gif");
        tempActual.setIcon(cargando);
        panel.add(iconClima);
        panel.add(tempActual);
        return panel;
    }

    private JPanel getControlPnl() { // panel de botones
        JPanel panelPL = new JPanel();
        JPanel ordenarPnl = new JPanel();
        JPanel tipoOrd = new JPanel();
        ordenarPnl.setBorder(BorderFactory.createTitledBorder("Panel de Control"));
        ordenarPnl.setLayout(new GridLayout(3, 1, 10, 10));
        ordenarPnl.add(ordenarTemp);
        ordenarPnl.add(ordenarFecha);
        ordenarPnl.add(Limpiar);
        tipoOrd.setLayout(new BorderLayout());
        tipoOrd.setPreferredSize(new Dimension(50, 50));
        tipoOrd.add(tipoOrdenacion);
        tipoOrd.setBorder(BorderFactory.createTitledBorder("Ordenado por:"));
        panelPL.setLayout(new BorderLayout());
        panelPL.add(ordenarPnl, BorderLayout.NORTH);
        panelPL.add(tipoOrd, BorderLayout.SOUTH);
        return panelPL;
    }

    private JPanel getHistorialPnl() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Historial"));
        panel.setLayout(new BorderLayout());
        historial.setModel(modelo);
        historial.setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            JPanel panel1 = new JPanel();
            panel1.setBackground(Color.white);

            if (isSelected) {
                panel1.setBackground(Color.decode("#8BD6F5"));
            }
            panel1.setLayout(new FlowLayout());
            Date fecha = value.getUltimaActualizacion();
            JLabel fechalbl = new JLabel(fecha.toLocaleString());
            Localidad localidad = value.getLocalidad();
            JLabel localidadlbl = new JLabel(localidad.getCiudad() + ", " + localidad.getProvincia() + ", " + localidad.getPais());
            Temperatura temp = value.getTemperaturaActual();
            JLabel tempActlbl = new JLabel((int) temp.getValor() + "ºC");
            JLabel estadolbl = new JLabel(value.getEstado());

            panel1.add(fechalbl);
            panel1.add(localidadlbl);
            panel1.add(tempActlbl);
            panel1.add(estadolbl);

            return panel1;
        });
        JScrollPane scrollPane = new JScrollPane(historial);
        panel.add(scrollPane, BorderLayout.CENTER);
        return panel;
    }

    private void actionListener() {
        Limpiar.addActionListener(e -> {
            estacion.limpiarHistorial();
            estacion.setOrdenarPorTemperatura(false);
            estacion.setOrdenarPorFecha(false);
            tipoOrdenacion.setText("Llegada");
        });
        ordenarFecha.addActionListener(e -> {
            estacion.ordenarClimaPorFecha();
            estacion.setOrdenarPorTemperatura(false);
            estacion.setOrdenarPorFecha(true);
            tipoOrdenacion.setText("Fecha");
        });
        ordenarTemp.addActionListener(e -> {
            estacion.ordenarClimaTemperatura();
            estacion.setOrdenarPorTemperatura(true);
            estacion.setOrdenarPorFecha(false);
            tipoOrdenacion.setText("Temperatura");
        });
        historial.addMouseListener(new MouseAdapter() {//muestra la informacion de la temperatura seleccionada al hacer doble click.
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getClickCount() == 2) {
                    mostrarInfoClima(frame);
                }
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        EstacionMetereologica est = (EstacionMetereologica) o;
        try {
            iconClima.setIcon(est.iconClima()); //cambia el icono del label de la temperatura actual
        } catch (IOException e) {
            e.printStackTrace();
        }
        tempActual.setIcon(null);
        tempActual.setText(est.mostrarClimaActual());
        modelo.clear();
        est.getHistorial().forEach(modelo::addElement);
    }

    private void mostrarInfoClima(JFrame fr) {
        JDialog mostrarinfo = new JDialog(fr, "Informacion");
        mostrarinfo.setPreferredSize(new Dimension(500, 500));
        mostrarinfo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Font fuente = new Font("Dialog", Font.BOLD, 22);
        JTextArea info = new JTextArea();
        info.setBorder(BorderFactory.createTitledBorder("Informacion Completa del clima"));
        info.setFont(fuente);
        Clima c = historial.getSelectedValue();
        info.setText(c.informacionCompleta());
        mostrarinfo.add(info);
        mostrarinfo.pack();
        mostrarinfo.setVisible(true);
    }


    public static void main(String[] args) {
        new WeatherApp();
    }

}
