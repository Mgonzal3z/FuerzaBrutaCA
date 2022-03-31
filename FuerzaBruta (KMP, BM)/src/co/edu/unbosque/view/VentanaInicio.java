package co.edu.unbosque.view;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaInicio extends JFrame {

    private PanelInicio pInicio;

    public VentanaInicio() {
        setTitle("FuerzaBruta");
        setSize(300,300);
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
        pInicio.setBounds(3, 4, 278, 255);
        getContentPane().add(pInicio);

    }
    public PanelInicio getPanelInicio() {
        return pInicio;
    }
    public void setPanelInicio(PanelInicio panelInicio) {
        this.pInicio = panelInicio;
    }
}
