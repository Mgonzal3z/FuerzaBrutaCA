package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * Clase VentanaBm, consta del método constructor, del método inicializarComponentes.
 * @autor Yilber Rojas
 * @autor Miguel Gonzales
 */
public class VentanaBm extends JFrame {
    /**
     * Objeto de PanelBm que permite acceder a sus atributos y métodos
     */
    private PanelBm pBm;
    /**
     * Objeto de PanelTexto que permite acceder a sus atributos y métodos
     */
    private PanelTexto pTexto;
    /**
     * Método Constructor de la clase VentanaBm
     */
    public VentanaBm() {
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
    }/**
     * Método inicializarComponentes de la clase VentanaBm
     */
    public void inicializarComponentes() {

        pBm =new PanelBm();
        pBm.setBounds(0, 2, 350, 565);
        getContentPane().add(pBm);
        
        pTexto = new PanelTexto();
        pTexto.setBounds(350, 2, 550, 565);
        getContentPane().add(pTexto);
  
    }
    //Getters and Setters
    public PanelBm getpBm() {
        return pBm;
    }

    public void setpBm(PanelBm pBm) {
        this.pBm = pBm;
    }

    public PanelTexto getpTexto() {
        return pTexto;
    }

    public void setpTexto(PanelTexto pTexto) {
        this.pTexto = pTexto;
    }
}
