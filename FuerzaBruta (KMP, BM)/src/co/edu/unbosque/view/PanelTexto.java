package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultHighlighter;

public class PanelTexto extends JPanel {
	
	private JTextArea texto;
	private JScrollPane scroll;
	private DefaultHighlighter.DefaultHighlightPainter highlight;

	public PanelTexto() {
		setLayout(null);
        inicializarComponentes();
        setVisible(true);
	}
	
	public void inicializarComponentes() {
	
		setBackground(Color.LIGHT_GRAY);
		setBorder(new TitledBorder("Archivo"));
		
		texto = new JTextArea();
		texto.setBounds(10, 30, 400, 560);
		add(texto);
		
		scroll = new JScrollPane(texto);
		scroll.setBounds(5, 20, 500, 555);
		add(scroll);

		highlight = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
			
	}
	public DefaultHighlighter.DefaultHighlightPainter getHighlight() {
		return highlight;
	}

	public void setHighlight(DefaultHighlighter.DefaultHighlightPainter highlight) {
		this.highlight = highlight;
	}

	public JTextArea getTexto() {
		return texto;
	}

	public void setTexto(JTextArea texto) {
		this.texto = texto;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

    
}
