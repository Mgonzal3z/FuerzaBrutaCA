package co.edu.unbosque.model;

import javax.swing.*;
import java.io.*;


public class FileSelect {

    void FileSelect(){

    }
    public String escogerArchivo() {
        JFileChooser j=new JFileChooser();
        j.showSaveDialog(j);
        String ruta = j.getSelectedFile().getAbsolutePath();
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
