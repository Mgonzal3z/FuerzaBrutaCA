package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Clase Kmp consta  del método kmpRpetido, del método kmpBusqueda, del método y del método lpsArray.
 * @author Yilber Rojas
 * @author Miguel Gonzales
 */
public class Kmp {
	
	public Kmp() {
		
	}
	/**
	 * Método kmpRepetido de la clase Kmp
	 * @param archivo Arreglo de caracteres que contiene el texto donde se hace la busqueda
	 * @param input Arreglo de caracteres que contiene el texto a buscar
	 */
	public int kmpRepetido(String input, String archivo) {
		
		int A = input.length();
		int B = archivo.length();
		int repetido = 0;
		int lps[] = new int[A];
		int j = 0;
		
		lpsArray(input, A, lps);
		
		int i = 0;
		while(i < B) {
			if(input.charAt(j) == archivo.charAt(i)) {
				j++;
				i++;
			}
			if(j == A) {
				//System.out.println("Found pattern" + " at index"+ (i-j));
				repetido++;
				j = lps[j-1];
			}
			
			else if(i < B && input.charAt(j) != archivo.charAt(i)) {
				if(j != 0)
					j = lps[j - 1];
				else
					i = i +1;
			}
		}
		
		return repetido;
		
	}
	/**
	 * Método buscar de la clase Kmp, que devuelve las posiciones del pat
	 * @param archivo Arreglo de caracteres que contiene el texto donde se hace la busqueda
	 * @param input Arreglo de caracteres que contiene el texto a buscar
	 */
	public ArrayList<Integer> kmpPos(String input, String archivo) {
		int A = input.length();
		int B = archivo.length();
		ArrayList<Integer> resul = new ArrayList<>();
		int lps[] = new int[A];
		int j = 0;
		lpsArray(input, A, lps);
		int i = 0;
		while(i < B) {
			if(input.charAt(j) == archivo.charAt(i)) {
				j++;
				i++;
			}
			if(j == A) {
				resul.add(i-j);
				j = lps[j-1];
			}

			else if(i < B && input.charAt(j) != archivo.charAt(i)) {
				if(j != 0)
					j = lps[j - 1];
				else
					i = i +1;
			}
		}

		return resul;

	}
	

	/**
	 * Calcula el "sufijo de prefijo más alto"
	 * para luego pre-procesar el patron con el resultado más cercano.
	 * @param input el patron que se está usando.
	 * @param A la longitud del patron.
	 * @param lps el LPS a calcular.
	 */
	public void lpsArray(String input, int A, int lps[]) {
		
		int len = 0;
		int i = 1;
		lps[0] = 0;
		
		while(i < A) {
			if(input.charAt(i) == input.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len != 0) {
					len = lps[len-1];
				}
				else {
					lps[i] = len;
					i++;
				}
			}
		}
		
	}
	
	
}
