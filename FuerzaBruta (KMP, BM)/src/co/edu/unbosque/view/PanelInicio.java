package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PanelInicio extends JPanel {
    private  JLabel  etiqueta_tit;
    private JButton boton_archivo;
    private JButton boton_siguiente;

    public PanelInicio() {
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }

    private void inicializarComponentes() {

        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Seleccion archivo"));


        etiqueta_tit = new  JLabel ("<html><p>Debe seleccionar un</p><p>archivo para continuar</p></html>");
        etiqueta_tit.setBounds(80, 80, 180, 40);
        add(etiqueta_tit);

        boton_archivo = new JButton("<html><p>Seleccionar</p><p>archivo .Txt</p></html>");
        boton_archivo.setBounds(40, 160, 100, 40);
        boton_archivo.setBackground(Color.LIGHT_GRAY);
        boton_archivo.setActionCommand("archivoSelec");
        add(boton_archivo);

        boton_siguiente = new JButton("Siguiente");
        boton_siguiente.setBounds(150, 170, 100, 20);
        boton_siguiente.setBackground(Color.LIGHT_GRAY);
        boton_siguiente.setActionCommand("SIGUIENTE");
        add(boton_siguiente);

    }

    public  JLabel getEtiqueta_tit() {
        return etiqueta_tit;
    }

    public void setEtiqueta_tit( JLabel etiqueta_tit) {
        this.etiqueta_tit = etiqueta_tit;
    }

    public JButton getBoton_archivo() {
        return boton_archivo;
    }

    public void setBoton_archivo(JButton boton_archivo) {
        this.boton_archivo = boton_archivo;
    }

    public JButton getBoton_siguiente() {
        return boton_siguiente;
    }

    public void setBoton_siguiente(JButton boton_siguiente) {
        this.boton_siguiente = boton_siguiente;
    }
}
