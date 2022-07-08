import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ej3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(numPrimo(0) == true) {
			JOptionPane.showMessageDialog(null,  " El número introducido es primo");
		}else {
			JOptionPane.showMessageDialog(null,  " El número introducido no es primo");
		}
	}
	
	public static boolean numPrimo ( int num) {
	
		String entrada = JOptionPane.showInputDialog("Introduce un número:");
		num = Integer.parseInt(entrada);
		
		/*
		 * Se comprueva el número introducido es primo o no, con el bucle for buscamos otro
		 * número que nos de como resto 0, si llegamos al número introducido sin encontrar 
		 * ninguna división con resto 0 salimos del for y devolvemos un booleano true
		 */
		
		for(int i=2; i<num; i++){
			if(num%i==0)
				return false;
			}
		return true;
	}
}
