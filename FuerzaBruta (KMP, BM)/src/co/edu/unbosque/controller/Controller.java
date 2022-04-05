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
import javax.swing.text.Highlighter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Controller implements ActionListener {

	private Kmp kmp;
	private VentanaKmp ventana_kmp;
	private VentanaBm ventana_bm;
	private VentanaBienvenido bienvenido;
    private FileSelect fi;
    private boolean arch=false;
    private String ruta="";
	private Bm bm;

    public Controller(){
    	kmp = new Kmp();
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
			String input = ventana_kmp.getpInicio().getInput().getText();
			ventana_kmp.getpInicio().getEtiqueta_repetido().setText("Su busqueda se repite " + kmp.kmpRepetido(input, txt)+ " veces");
			ventana_kmp.getpTexto().getTexto().append(fi.leerArchivo(ruta));
		} else if ((e.getActionCommand().equals("BUSCARBM")) && (arch == true) && (ruta != "1")) {
			char txt[] = (fi.leerArchivo(ruta)).toLowerCase().toCharArray();
			char pat[] = (ventana_bm.getpBm().getInput2().getText()).toLowerCase().toCharArray();
			ventana_bm.getpBm().getEtiqueta_bm().setText(bm.veces(txt, pat) + "");
			ventana_bm.getpTexto().getTexto().append(fi.leerArchivo(ruta));

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








//        if (e.getActionCommand().equals("archivoSelec")) {
//            ruta = fi.escogerArchivo();
//            arch = true;
//            }else if ((e.getActionCommand().equals("SIGUIENTE")) && (arch == true)&&(ruta!="1")) {
//            JTextArea textArea = new JTextArea(fi.leerArchivo(ruta));
//            JScrollPane scrollPane = new JScrollPane(textArea);
//            textArea.setLineWrap(true);
//            textArea.setWrapStyleWord(true);
//            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
//            JOptionPane.showMessageDialog(null, scrollPane, "Texto",JOptionPane.PLAIN_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
//            }


    }
	}

    
//    public void resaltar() {
//    	String input = ventana_kmp.getpTexto().getTexto().toString();
//    	ArrayList<Integer> coincide = new ArrayList<Integer>();
//    	coincide = kmp.kmpBusqueda(input, ruta);
//    	//Highlighter.HighlightPainter resaltar = new DefaultHighlighter.DefaultHighlightPainter(Color.BLACK);
//    	Highlighter color = ventana_kmp.getpTexto().getHighlighter();
//    	int inicio, end;
//    	for(int i = 0; i < coincide.size(); i++) {
//    		inicio = coincide.get(i);
//    		end = coincide.get(i) + input.length();
//    		if(inicio != 1) {
//    			ventana_kmp.getpTexto().resaltar(inicio, end, color);
//    		}
//    				
//    	}
//    }















