package co.edu.unbosque.model;

import co.edu.unbosque.view.VentanaBm;

import java.util.ArrayList;

public class Bm {
    private VentanaBm ventana_bm;

    static int NO_OF_CHARS = 10000;
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public Bm(){
        ventana_bm = new VentanaBm();
    }

    public void badCharHeuristic(char[] str, int size, int badchar[]) {
        int i;
        for (i = 0; i < NO_OF_CHARS; i++)
            badchar[i] = -1;
        for (i = 0; i < size; i++)
            badchar[(int) str[i]] = i;
    }

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


