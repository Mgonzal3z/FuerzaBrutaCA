package co.edu.unbosque.view;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
/**
 * Clase VentanaKmp, consta del método constructor, del método inicializarComponentes.
 * @autor Yilber Rojas
 * @autor Miguel Gonzales
 */
public class VentanaKmp extends JFrame {
    /**
     * Objeto de PanelKmp que permite acceder a sus atributos y métodos
     */
    private PanelKmp pInicio;
    /**
     * Objeto de PanelTexto que permite acceder a sus atributos y métodos
     */
    private PanelTexto pTexto;
    /**
     * Método Constructor de la clase VentanaKmp
     */
    public VentanaKmp() {
        setTitle("FuerzaBruta");
        setSize(900,600);
        setIconImage(new ImageIcon(getClass().getResource("/data/logo.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        getContentPane().setLayout(null);

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }
    /**
     * Método inicializarComponentes de la clase VentanaKmp
     */
    public void inicializarComponentes() {

        pInicio =new PanelKmp();
        pInicio.setBounds(0, 2, 350, 565);
        getContentPane().add(pInicio);
        
        pTexto = new PanelTexto();
        pTexto.setBounds(350, 2, 550, 565);
        getContentPane().add(pTexto);
  
    }
    
    //Getters and Setters
	public PanelKmp getpInicio() {
		return pInicio;
	}
	public void setpInicio(PanelKmp pInicio) {
		this.pInicio = pInicio;
	}
	public PanelTexto getpTexto() {
		return pTexto;
	}
	public void setpTexto(PanelTexto pTexto) {
		this.pTexto = pTexto;
	}
}
