package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaBm extends JFrame {

    private PanelBm pBm;
    private PanelTexto pTexto;
 
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
    }
    public void inicializarComponentes() {

        pBm =new PanelBm();
        pBm.setBounds(0, 2, 350, 565);
        getContentPane().add(pBm);
        
        pTexto = new PanelTexto();
        pTexto.setBounds(350, 2, 550, 565);
        getContentPane().add(pTexto);
  
    }

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
