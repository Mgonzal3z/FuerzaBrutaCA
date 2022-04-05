package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Clase VentanaBienvenido, consta del método constructor, del método inicializarComponentes.
 * @autor Yilber Rojas
 * @autor Miguel Gonzales
 */
public class VentanaBienvenido extends JFrame {
	/**
	 * Objeto de PanelImagen que permite acceder a sus atributos y métodos
	 */
	private PanelImagen pim;
	/**
	 * Objeto de ImageIcon que permite acceder a sus atributos y métodos
	 */
	private ImageIcon ImagenBienvenida;
	/**
	 * Objeto de JLabel
	 */
	private JLabel bienvenida;
	/**
	 * Objeto de JButton
	 */
	private JButton boton_kmp;
	/**
	 * Objeto de JButton
	 */
	private JButton boton_bm;

	/**
	 * Método Constructor de la clase VentanaBienvenido
	 */
	public VentanaBienvenido() {
		setTitle("Bienvenido");
        setSize(400,450);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/data/logo.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
	/**
	 * Método inicializarComponentes de la clase VentanaBienvenido
	 */
	public void inicializarComponentes() {
        	
		boton_kmp = new JButton("Kmp");
		boton_kmp.setBounds(140, 200, 100, 25);
		boton_kmp.setBackground(Color.LIGHT_GRAY);
		boton_kmp.setActionCommand("KMP");
		boton_kmp.setVisible(true);
		add(boton_kmp);
		
		boton_bm = new JButton("Bm");
		boton_bm.setBounds(140, 250, 100, 25);
		boton_bm.setBackground(Color.LIGHT_GRAY);
		boton_bm.setActionCommand("BM");
		boton_bm.setVisible(true);
		add(boton_bm);
		
		pim = new PanelImagen();
		pim.setBounds(0, 0, 390, 410);
		pim.setOpaque(true);
		add(pim);

    }
	//getters and setters
	public ImageIcon getImagenBienvenida() {
		return ImagenBienvenida;
	}
	public void setImagenBienvenida(ImageIcon imagenBienvenida) {
		ImagenBienvenida = imagenBienvenida;
	}
	public JLabel getBienvenida() {
		return bienvenida;
	}
	public void setBienvenida(JLabel bienvenida) {
		this.bienvenida = bienvenida;
	}
	public JButton getBoton_kmp() {
		return boton_kmp;
	}
	public void setBoton_kmp(JButton boton_kmp) {
		this.boton_kmp = boton_kmp;
	}
	public JButton getBoton_bm() {
		return boton_bm;
	}
	public void setBoton_bm(JButton boton_bm) {
		this.boton_bm = boton_bm;
	}

	

		
	}


