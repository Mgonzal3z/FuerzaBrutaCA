package co.edu.unbosque.controller;

import co.edu.unbosque.model.FileSelect;
import co.edu.unbosque.view.VentanaInicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	
	private VentanaInicio inicio;
    private FileSelect fi;
    private boolean arch=false;
    private String ruta="";

    public Controller(){
        inicio = new VentanaInicio();
        fi = new FileSelect();
        asignarOyentes();
    }

    private void asignarOyentes() {
    inicio.getPanelInicio().getBoton_archivo().addActionListener(this);
    inicio.getPanelInicio().getBoton_siguiente().addActionListener(this);
//    getBoton_kmp().addActionListener(this);
//    getBoton_bm().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
        if (e.getActionCommand().equals("archivoSelec")) {
            ruta = fi.escogerArchivo();
            arch = true;
            }else if ((e.getActionCommand().equals("SIGUIENTE")) && (arch == true)&&(ruta!="1")) {
            JTextArea textArea = new JTextArea(fi.leerArchivo(ruta));
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
            //inicio.getPanelInicio().add(scrollPane);
            JOptionPane.showMessageDialog(null, scrollPane, "Texto",JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
            }
    }
}





























