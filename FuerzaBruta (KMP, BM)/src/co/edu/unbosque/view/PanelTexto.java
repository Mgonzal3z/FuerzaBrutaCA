package co.edu.unbosque.view;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultHighlighter;
/**
 * Clase PanelTexto,consta del método constructor y del método inicializarComponentes.
 * @autor Yilber Rojas
 * @autor Miguel Gonzales
 */
public class PanelTexto extends JPanel {
	/**
	 * Objeto de JTextArea
	 */
	private JTextArea texto;
	/**
	 * Objeto de JScrollPane
	 */
	private JScrollPane scroll;
	/**
	 * Objeto de highlight
	 */
	private DefaultHighlighter.DefaultHighlightPainter highlight;
	/**
	 * Método constructor de la clase PanelTexto
	 */
	public PanelTexto() {
		setLayout(null);
        inicializarComponentes();
        setVisible(true);
	}
	/**
	 * Método inicializar componentes de la clase panelTexto
	 */
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
	//Getters and Setters
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