package co.edu.unbosque.model;

import co.edu.unbosque.view.VentanaBm;

import java.util.ArrayList;
/**
 * Clase Bm consta  del método search, del método badCharHeuristic, del método max y del método veces.
 * implementación del algorimo Boyer Moore
 * @author Yilber Rojas
 * @author Miguel Gonzales
 */
public class Bm {
    /**
     * Objeto de tipo int
     */
    static int NO_OF_CHARS = 10000;
    /**
     * Método max de la clase Bm
     * @param a Número entero
     * @param b Número entero
     * @return Mayor de los números ingresados
     */
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Método badCharHeuristic de la clase Bm
     * @param str Arreglo de caracteres que contiene el texto a buscar
     * @param size Número entero que indica el tamaño de la cadena
     * @param badchar Arreglo de numeros enteros
     */
    public void badCharHeuristic(char[] str, int size, int badchar[]) {
        int i;
        for (i = 0; i < NO_OF_CHARS; i++)
            badchar[i] = -1;
        for (i = 0; i < size; i++)
            badchar[(int) str[i]] = i;
    }

    /**
     * Método buscar de la clase Bm, que devuelve las veces que aparece el pat
     * @param txt Arreglo de caracteres que contiene el texto donde se hace la busqueda
     * @param pat Arreglo de caracteres que contiene el texto a buscar
     */
    public int veces(char[] txt, char[] pat) {
        int m = pat.length;
        int n = txt.length;
        int badchar[] = new int[NO_OF_CHARS];
        int cont=0;
        badCharHeuristic(pat, m, badchar);
        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;
            while (j >= 0 && pat[j] == txt[s + j])
                j--;
            if (j < 0) {
                cont++;
                s += (s + m < n) ? m - badchar[txt[s + m]] : 1;
            } else
                s += max(1, j - badchar[txt[s + j]]);
        }
        return cont;
    }
    /**
     * Método buscar de la clase Bm, que devuelve las posiciones del pat
     * @param txt Arreglo de caracteres que contiene el texto donde se hace la busqueda
     * @param pat Arreglo de caracteres que contiene el texto a buscar
     */
    public ArrayList<Integer> search(char[] txt, char[] pat) {
        ArrayList<Integer> resul = new ArrayList<Integer>();
        int m = pat.length;
        int n = txt.length;
        int badchar[] = new int[NO_OF_CHARS];
        badCharHeuristic(pat, m, badchar);
        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;
            while (j >= 0 && pat[j] == txt[s + j])
                j--;
            if (j < 0) {
                resul.add(s);
                s += (s + m < n) ? m - badchar[txt[s + m]] : 1;
            } else
                s += max(1, j - badchar[txt[s + j]]);
        }
        return resul;
    }
}
