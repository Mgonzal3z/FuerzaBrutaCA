package co.edu.unbosque.controller;

import co.edu.unbosque.model.FileSelect;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller {
    private FileSelect e;
    private VentanaPrincipal v;
    public Controller(){
        e = new FileSelect();
        v = new VentanaPrincipal();
        funcionar();
    }

    private void funcionar() {
        v.escribirDato(e.leerArchivo(e.escogerArchivo()));
        System.exit(0);
    }
}
