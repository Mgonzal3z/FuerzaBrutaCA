package co.edu.unbosque.view;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
/**
 * Clase PanelBm, consta del método constructor, del método inicializarComponentes.
 * @autor Yilber Rojas
 * @autor Miguel Gonzales
 */
public class PanelBm extends JPanel {
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
    private JLabel  etiqueta_vecesBm;
    /**
     * Objeto de JLabel
     */
    private JLabel etiqueta_bm;
    /**
     * Objeto de JTextField
     */
    private JTextField input2;
    /**
     * Objeto de JButton
     */
    private JButton boton_archivoBm;
    /**
     * Objeto de JButton
     */
    private JButton boton_siguienteBm;
    /**
     * Objeto de JButton
     */
    private JButton boton_atrasBm;
    /**
     * Método constructor de la clase PanelKmp
     */
    public PanelBm() {
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }
    /**
     * Método inicializar componentes de la clase panelBm
     */
    private void inicializarComponentes() {
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Seleccion archivo"));
        etiqueta_tit = new  JLabel ("<html><p>Debe seleccionar un</p><p>archivo para continuar</p></html>");
        etiqueta_tit.setBounds(40, 40, 180, 40);
        add(etiqueta_tit);
        boton_archivoBm = new JButton("<html><p>Seleccionar</p><p>archivo .Txt</p></html>");
        boton_archivoBm.setBounds(40, 100, 100, 40);
        boton_archivoBm.setBackground(Color.LIGHT_GRAY);
        boton_archivoBm.setActionCommand("ARCHIVOSELEBM");
        add(boton_archivoBm);
        boton_siguienteBm = new JButton("Buscar");
        boton_siguienteBm.setBounds(40, 250, 100, 30);
        boton_siguienteBm.setBackground(Color.LIGHT_GRAY);
        boton_siguienteBm.setActionCommand("BUSCARBM");
        add(boton_siguienteBm);
        input2 = new JTextField();
        input2.setBounds(40, 200, 140, 30);
        add(input2);
        etiqueta_texto = new JLabel("Digite el texto a buscar");
        etiqueta_texto.setBounds(40, 160, 140, 30);
        add(etiqueta_texto);

        etiqueta_vecesBm = new JLabel("La palabra se repite: ");
        etiqueta_vecesBm.setBounds(40, 300, 140, 30);
        add(etiqueta_vecesBm);

        etiqueta_bm = new JLabel("");
        etiqueta_bm.setBounds(200, 300, 140, 30);
        add(etiqueta_bm);

        boton_atrasBm = new JButton("Atras");
        boton_atrasBm.setBounds(40, 500, 100, 30);
        boton_atrasBm.setBackground(Color.LIGHT_GRAY);
        boton_atrasBm.setActionCommand("ATRASBM");
        add(boton_atrasBm);
    }
    //Getters and Setters

    public JLabel getEtiqueta_tit() {
        return etiqueta_tit;
    }

    public JLabel getEtiqueta_vecesBm() {
        return etiqueta_vecesBm;
    }

    public void setEtiqueta_vecesBm(JLabel etiqueta_vecesBm) {
        this.etiqueta_vecesBm = etiqueta_vecesBm;
    }

    public JLabel getEtiqueta_bm() {
        return etiqueta_bm;
    }

    public void setEtiqueta_bm(JLabel etiqueta_bm) {
        this.etiqueta_bm = etiqueta_bm;
    }

    public void setEtiqueta_tit(JLabel etiqueta_tit) {
        this.etiqueta_tit = etiqueta_tit;
    }
    public JLabel getEtiqueta_texto() {
        return etiqueta_texto;
    }
    public void setEtiqueta_texto(JLabel etiqueta_texto) {
        this.etiqueta_texto = etiqueta_texto;
    }
    public JTextField getInput2() {
        return input2;
    }
    public void setInput2(JTextField input2) {
        this.input2 = input2;
    }
    public JButton getBoton_archivoBm() {
        return boton_archivoBm;
    }
    public void setBoton_archivoBm(JButton boton_archivoBm) {
        this.boton_archivoBm = boton_archivoBm;
    }
    public JButton getBoton_siguienteBm() {
        return boton_siguienteBm;
    }
    public void setBoton_siguienteBm(JButton boton_siguienteBm) {
        this.boton_siguienteBm = boton_siguienteBm;
    }
    public JButton getBoton_atrasBm() {
        return boton_atrasBm;
    }
    public void setBoton_atrasBm(JButton boton_atrasBm) {
        this.boton_atrasBm = boton_atrasBm;
    }
}