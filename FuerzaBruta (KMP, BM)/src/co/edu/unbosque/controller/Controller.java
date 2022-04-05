package co.edu.unbosque.controller;

import co.edu.unbosque.model.FileSelect;
import co.edu.unbosque.model.Kmp;
import co.edu.unbosque.view.VentanaKmp;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaBm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	
	private Kmp kmp;
	private VentanaKmp ventana_kmp;
	private VentanaBm ventana_bm;
	private VentanaBienvenido bienvenido;
    private FileSelect fi;
    private boolean arch=false;
    private String ruta="";

    public Controller(){
    	kmp = new Kmp();
    	bienvenido = new VentanaBienvenido();
        ventana_kmp = new VentanaKmp();
        ventana_bm = new VentanaBm();
        fi = new FileSelect();
        asignarOyentes();
    }

    private void asignarOyentes() {
    bienvenido.getBoton_kmp().addActionListener(this);
    bienvenido.getBoton_bm().addActionListener(this);
    ventana_kmp.getpInicio().getBoton_archivo().addActionListener(this);
    ventana_kmp.getpInicio().getBoton_siguiente().addActionListener(this);
    ventana_kmp.getpInicio().getBoton_atras().addActionListener(this);
    ventana_bm.getpBm().getBoton_archivoBm().addActionListener(this);
    ventana_bm.getpBm().getBoton_siguienteBm().addActionListener(this);
    ventana_bm.getpBm().getBoton_atrasBm().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	
    	if(e.getActionCommand().equals("KMP")) {
    		bienvenido.setVisible(false);
    		ventana_bm.setVisible(false);
    		ventana_kmp.setVisible(true);
    	
    	}else if(e.getActionCommand().equals("ARCHIVOSELE")) {
    		 	ruta = fi.escogerArchivo();
    		 	arch = true;
    	}else if(e.getActionCommand().equals("ARCHIVOSELEBM")) {
			ruta = fi.escogerArchivo();
			arch = true;
		}else if ((e.getActionCommand().equals("BUSCAR")) && (arch == true)&&(ruta!="1")) {
			String rut = fi.leerArchivo(ruta);
			String input = ventana_kmp.getpInicio().getInput().getText();
			//System.out.println(kmp.kmpBusqueda(input, rut));
			ventana_kmp.getpInicio().getEtiqueta_repetido().setText("Su busqueda se repite " + kmp.kmpBusqueda(input, rut)+ " veces");
    		ventana_kmp.getpTexto().getTexto().append(fi.leerArchivo(ruta));
    		System.out.println(kmp.kmpResaltar(input, rut));
    		
    	}else if ((e.getActionCommand().equals("BUSCARBM")) && (arch == true)&&(ruta!="1")) {
			ventana_bm.getpTexto().getTexto().append(fi.leerArchivo(ruta));

		}else if(e.getActionCommand().equals("ATRAS")) {
        		 ventana_kmp.setVisible(false);
        		 ventana_bm.setVisible(false);
        		 bienvenido.setVisible(true);
        } else if(e.getActionCommand().equals("ATRASBM")) {
			ventana_kmp.setVisible(false);
			ventana_bm.setVisible(false);
			bienvenido.setVisible(true);
		}
		else if(e.getActionCommand().equals("BM")) {
			bienvenido.setVisible(false);
			ventana_kmp.setVisible(false);
			ventana_bm.setVisible(true);
		}
    	
    	
	
	
    
    	
    
    	
//        if (e.getActionCommand().equals("archivoSelec")) {
//            ruta = fi.escogerArchivo();
//            arch = true;
//            }else if ((e.getActionCommand().equals("SIGUIENTE")) && (arch == true)&&(ruta!="1")) {
//            JTextArea textArea = new JTextArea(fi.leerArchivo(ruta));
//            JScrollPane scrollPane = new JScrollPane(textArea);
//            textArea.setLineWrap(true);
//            textArea.setWrapStyleWord(true);
//            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
//            JOptionPane.showMessageDialog(null, scrollPane, "Texto",JOptionPane.PLAIN_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
//            }
    	
    	
    }
}















