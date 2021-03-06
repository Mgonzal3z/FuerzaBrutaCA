package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
/**
 * Clase panelKmp, consta del método inicializarComponentes y del constructor
 * @autor Yilber Rojas
 * @autor Miguel Gonzales
 */
public class PanelKmp extends JPanel {
	/**
	 * Objeto de JLabel
	 */
    private JLabel  etiqueta_tit;
	/**
	 * Objeto de JLabel
	 */
   	private JLabel etiqueta_texto;
	/**
	 * Objeto de JLabel
	 */
   	private JLabel etiqueta_repetido;
	/**
	 * Objeto de JTextField
	 */
    private JTextField input;
	/**
	 * Objeto de JButton
	 */
	private JButton boton_archivo;
	/**
	 * Objeto de JButton
	 */
	private JButton boton_siguiente;
	/**
	 * Objeto de JButton
	 */
	private JButton boton_atras;
	/**
	 * Método constructor de la clase PanelKmp
	 */
    public PanelKmp() {
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }

	/**
	 * Método inicializar componentes de la clase panelKmp
	 */
    private void inicializarComponentes() {

        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Seleccion archivo"));
  
  		etiqueta_tit = new  JLabel ("<html><p>Debe seleccionar un</p><p>archivo para continuar</p></html>");
  		etiqueta_tit.setBounds(40, 40, 180, 40);
  		add(etiqueta_tit);
          
      	boton_archivo = new JButton("<html><p>Seleccionar</p><p>archivo .Txt</p></html>");
        boton_archivo.setBounds(40, 100, 100, 40);
        boton_archivo.setBackground(Color.LIGHT_GRAY);
        boton_archivo.setActionCommand("ARCHIVOSELE");
        add(boton_archivo);

        boton_siguiente = new JButton("Buscar");
        boton_siguiente.setBounds(40, 250, 100, 30);
        boton_siguiente.setBackground(Color.LIGHT_GRAY);
        boton_siguiente.setActionCommand("BUSCAR");
        add(boton_siguiente);
        
        input = new JTextField();
        input.setBounds(40, 200, 140, 30);
        add(input);
        
        etiqueta_texto = new JLabel("Digite el texto a buscar");
        etiqueta_texto.setBounds(40, 160, 140, 30);
        add(etiqueta_texto);
        
        etiqueta_repetido = new JLabel("");
        etiqueta_repetido.setBounds(40, 300, 300, 30);
        add(etiqueta_repetido);
          
        boton_atras = new JButton("Atras");
        boton_atras.setBounds(40, 500, 100, 30);
        boton_atras.setBackground(Color.LIGHT_GRAY);
        boton_atras.setActionCommand("ATRAS");
        add(boton_atras);

    }
    //getters and setters

	public JLabel getEtiqueta_tit() {
		return etiqueta_tit;
	}

	public void setEtiqueta_tit(JLabel etiqueta_tit) {
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

	public JLabel getEtiqueta_texto() {
		return etiqueta_texto;
	}

	public void setEtiqueta_texto(JLabel etiqueta_texto) {
		this.etiqueta_texto = etiqueta_texto;
	}

	public JTextField getInput() {
		return input;
	}

	public void setInput(JTextField input) {
		this.input = input;
	}

	public JButton getBoton_atras() {
		return boton_atras;
	}

	public void setBoton_atras(JButton boton_atras) {
		this.boton_atras = boton_atras;
	}

	public JLabel getEtiqueta_repetido() {
		return etiqueta_repetido;
	}

	public void setEtiqueta_repetido(JLabel etiqueta_repetido) {
		this.etiqueta_repetido = etiqueta_repetido;
	}
	
	
    
    

 
}
