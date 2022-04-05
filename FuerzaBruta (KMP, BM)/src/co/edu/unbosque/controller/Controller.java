package co.edu.unbosque.controller;

import co.edu.unbosque.model.Bm;
import co.edu.unbosque.model.FileSelect;
import co.edu.unbosque.model.Kmp;
import co.edu.unbosque.view.VentanaKmp;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaBm;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Controller implements ActionListener {
	
	private VentanaKmp ventana_kmp;
	private VentanaBm ventana_bm;
	private VentanaBienvenido bienvenido;
    private FileSelect fi;
    private boolean arch=false;
    private String ruta="";
	private Bm bm;
	private Kmp kmp;

    public Controller(){
    	bienvenido = new VentanaBienvenido();
        ventana_kmp = new VentanaKmp();
        ventana_bm = new VentanaBm();
        fi = new FileSelect();
		bm = new Bm();
		kmp = new Kmp();
        asignarOyentes();
    }

    private void asignarOyentes() {
    bienvenido.getBoton_kmp().addActionListener(this);
    bienvenido.getBoton_bm().addActionListener(this);
    ventana_kmp.getpInicio().getBoton_archivo().addActionListener(this);
    ventana_kmp.getpInicio().getBoton_siguiente().addActionListener(this);
    ventana_kmp.getpInicio().getBoton_atras().addActionListener(this);
    ventana_bm.getpBm().getBoton_archivoBm().addActionListener(this);
    ventana_bm.getpBm().getBoton_siguienteBm().addActionListener(this);
    ventana_bm.getpBm().getBoton_atrasBm().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


		if (e.getActionCommand().equals("KMP")) {
			bienvenido.setVisible(false);
			ventana_bm.setVisible(false);
			ventana_kmp.setVisible(true);

		} else if (e.getActionCommand().equals("ARCHIVOSELE")) {
			ruta = fi.escogerArchivo();
			arch = true;
		} else if (e.getActionCommand().equals("ARCHIVOSELEBM")) {
			ruta = fi.escogerArchivo();
			arch = true;
		} else if ((e.getActionCommand().equals("BUSCAR")) && (arch == true) && (ruta != "1")) {
			String txt = fi.leerArchivo(ruta);

		} else if ((e.getActionCommand().equals("BUSCARBM")) && (arch == true) && (ruta != "1")) {
			char txt[] = (fi.leerArchivo(ruta)).toLowerCase().toCharArray();
			char pat[] = (ventana_bm.getpBm().getInput2().getText()).toLowerCase().toCharArray();
			ventana_bm.getpBm().getEtiqueta_bm().setText(bm.veces(txt, pat) + "");

		} else if (e.getActionCommand().equals("ATRAS")) {
			ventana_kmp.setVisible(false);
			ventana_bm.setVisible(false);
			bienvenido.setVisible(true);
		} else if (e.getActionCommand().equals("ATRASBM")) {
			ventana_kmp.setVisible(false);
			ventana_bm.setVisible(false);
			bienvenido.setVisible(true);
		} else if (e.getActionCommand().equals("BM")) {
			bienvenido.setVisible(false);
			ventana_kmp.setVisible(false);
			ventana_bm.setVisible(true);
		}
	}
}















