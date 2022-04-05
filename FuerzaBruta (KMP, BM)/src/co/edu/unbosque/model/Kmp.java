package co.edu.unbosque.model;

import java.util.Arrays;

public class Kmp {
	
	public Kmp() {
		
	}
	
	public int kmpBusqueda(String input, String archivo) {
		
		int A = input.length();
		int B = archivo.length();
		int repetido = 0;
		int lps[] = new int[A];
		int j = 0;
		
		computeLPSArray(input, A, lps);
		
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
	
	public String kmpResaltar(String input, String archivo) {
		
		int A = input.length();
		int B = archivo.length();
		String resaltar = "";
		int repetido = 0;
		int lps[] = new int[A];
		int j = 0;
		
		computeLPSArray(input, A, lps);
		
		int i = 0;
		while(i < B) {
			if(input.charAt(j) == archivo.charAt(i)) {
				j++;
				i++;
			}
			if(j == A) {
				//System.out.println("Found pattern" + " at index"+ (i-j));
				repetido++;
				resaltar = "" + lps[repetido];
				j = lps[j-1];
			}
			
			else if(i < B && input.charAt(j) != archivo.charAt(i)) {
				if(j != 0)
					j = lps[j - 1];
				else
					i = i +1;
			}
		}
		return resaltar;
		
	}
	
	public void computeLPSArray(String input, int A, int lps[]) {
		
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
