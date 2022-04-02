package co.edu.unbosque.view;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicio extends JFrame {

    private PanelInicio pInicio;
    private PanelImagen pim;

    public VentanaInicio() {
        setTitle("FuerzaBruta");
        setSize(900,600);
        setIconImage(new ImageIcon(getClass().getResource("/data/logo.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        getContentPane().setLayout(null);

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void inicializarComponentes() {

        pInicio =new PanelInicio();
        pInicio.setBounds(3, 4, 900, 565);
        getContentPane().add(pInicio);
        
        pim = new PanelImagen();
		pim.setBounds(0, 0, 400, 565);
		pim.setOpaque(false);
		getLayeredPane().add(pim, new Integer(0), 0);

    }
    public PanelInicio getPanelInicio() {
        return pInicio;
    }
    public void setPanelInicio(PanelInicio panelInicio) {
        this.pInicio = panelInicio;
    }
}
