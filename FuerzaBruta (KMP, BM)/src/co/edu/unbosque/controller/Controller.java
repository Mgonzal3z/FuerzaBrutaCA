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
/**
 * Clase Controller, consta del método constructor y de los métodos asignarOyentes y actionPerformed
 * Relaciona las clases de la carpeta model con las clases de la carpeta view y controla las interacciones entre ellas
 * @author Yilber Rojas
 * @author Miguel Gonzales
 */
public class Controller implements ActionListener {

	/**
	 * Objeto de VentantaKmp que permite acceder a sus atributos y métodos
	 */
	private VentanaKmp ventana_kmp;
	/**
	 * Objeto de VentantaBm que permite acceder a sus atributos y métodos
	 */
	private VentanaBm ventana_bm;
	/**
	 * Objeto de VentantaBienvenido que permite acceder a sus atributos y métodos
	 */
	private VentanaBienvenido bienvenido;
	/**
	 * Objeto de FileSelect que permite acceder a sus atributos y métodos
	 */
	private FileSelect fi;
	/**
	 * Objeto de Bm que permite acceder a sus atributos y métodos
	 */
	private Bm bm;
	/**
	 * Objeto de Kmp que permite acceder a sus atributos y métodos
	 */
	private Kmp kmp;
	/**
	 * Objeto de boolean
	 */
    private boolean arch=false;
	/**
	 * Objeto de String
	 */
    private String ruta="";

	/**
	 * Método Constuctor de la clase Controller
	 */
    public Controller(){
    	bienvenido = new VentanaBienvenido();
        ventana_kmp = new VentanaKmp();
        ventana_bm = new VentanaBm();
        fi = new FileSelect();
		bm = new Bm();
		kmp = new Kmp();
        asignarOyentes();
    }
	/**
	 * Método asignarOyentes de la clase Controller
	 * Añade actionListener a los botones de view
	 */
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
	/**
	 * Método actionPerformed de la clase Controller
	 * Se invoca cuando ocurre una acción
	 * @param e Objeto a procesar de la clase ActionEvent
	 */
    @Override
    public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("KMP")) {
			bienvenido.setVisible(false);
			ventana_bm.setVisible(false);
			ventana_kmp.setVisible(true);
		} else if (e.getActionCommand().equals("ARCHIVOSELE")) {
			ruta = fi.escogerArchivo();
			arch = true;
			ventana_kmp.getpTexto().getTexto().setText("");
			ventana_kmp.getpTexto().getTexto().append(fi.leerArchivo(ruta));
		} else if (e.getActionCommand().equals("ARCHIVOSELEBM")) {
			ruta = fi.escogerArchivo();
			arch = true;
			ventana_bm.getpTexto().getTexto().setText("");
			ventana_bm.getpTexto().getTexto().append(fi.leerArchivo(ruta));
		} else if ((e.getActionCommand().equals("BUSCAR")) && (arch == true) && (ruta != "1")) {
			ventana_kmp.getpTexto().getTexto().getHighlighter().removeAllHighlights();
			String txt = fi.leerArchivo(ruta).toLowerCase();
			String input = ventana_kmp.getpInicio().getInput().getText().toLowerCase();
			ventana_kmp.getpInicio().getEtiqueta_repetido().setText("Su busqueda se repite " + kmp.kmpRepetido(input, txt)+ " veces");
			ArrayList<Integer> array= new ArrayList<>();
			array= (ArrayList<Integer>) kmp.kmpPos(input, txt).clone();
			for(int i=0;i<array.size();i++){
				try {
					ventana_kmp.getpTexto().getTexto().getHighlighter().addHighlight(array.get(i),input.length()+array.get(i),new DefaultHighlighter.DefaultHighlightPainter(Color.red));
				} catch (BadLocationException ex) {
					ex.printStackTrace();
				}
			}
		} else if ((e.getActionCommand().equals("BUSCARBM")) && (arch == true) && (ruta != "1")) {
			char txt[] = (fi.leerArchivo(ruta)).toLowerCase().toCharArray();
			char pat[] = (ventana_bm.getpBm().getInput2().getText()).toLowerCase().toCharArray();
			ventana_bm.getpTexto().getTexto().getHighlighter().removeAllHighlights();
			ventana_bm.getpBm().getEtiqueta_bm().setText(bm.veces(txt, pat) + "");
			ArrayList<Integer> array= new ArrayList<>();
			array= (ArrayList<Integer>) bm.search(txt, pat).clone();
			for(int i=0;i<array.size();i++){
				try {
					ventana_bm.getpTexto().getTexto().getHighlighter().addHighlight(array.get(i),ventana_bm.getpBm().getInput2().getText().length()+array.get(i),new DefaultHighlighter.DefaultHighlightPainter(Color.red));
				} catch (BadLocationException ex) {
					ex.printStackTrace();
				}
			}

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















