package co.edu.unbosque.model;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;


public class FileSelect {

    void FileSelect(){

    }
    public String escogerArchivo() {
        String ruta="";	
        JFileChooser j=new JFileChooser();
        j.setAcceptAllFileFilterUsed(false);
        j.addChoosableFileFilter(new FileNameExtensionFilter("Archivo de Texto", "txt"));
        j.showSaveDialog(j);
        if((j.getSelectedFile())==null) {
            return "1";
        }else{
            ruta = j.getSelectedFile().getAbsolutePath();
        }
        return ruta;

    }

    public String leerArchivo(String ruta) {
        String linea = "";
        String cadena = "";
        File f = new File(ruta);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while(linea!=null){
                cadena += linea+"\n";
                linea = br.readLine();
            }
            fr.close();
        } catch (IOException e) {
            return null;
        }
        return cadena;
    }
}
