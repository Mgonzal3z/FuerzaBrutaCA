package co.edu.unbosque.view;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class VentanaKmp extends JFrame {

    private PanelKmp pInicio;
    private PanelTexto pTexto;
 
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
    public void inicializarComponentes() {

        pInicio =new PanelKmp();
        pInicio.setBounds(0, 2, 350, 565);
        getContentPane().add(pInicio);
        
        pTexto = new PanelTexto();
        pTexto.setBounds(350, 2, 550, 565);
        getContentPane().add(pTexto);
  
    }
    
    
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
