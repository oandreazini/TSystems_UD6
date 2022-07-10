import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * Oriol Andreazini
 */

public class Ej10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numPrimo();
	}
	
	public static int[] rellenarArray() {
		
		int min =100;
		int max=200;
		
		String entrada = JOptionPane.showInputDialog("Introduce el número de posiciones para el array");
		int valor = Integer.parseInt(entrada);
	
		int array [] = new int [valor];
		
		//Recorremos el array y con la clase Math.random introduce los numeros aleatorios
		for(int i=0; i<valor; i++) {
			array[i] = (int)(Math.random()*(max-min)+min);
			}
		
		//Imprimimos el array, pasando a String			
		JOptionPane.showMessageDialog(null,  " La sequencia aleatoria es: " +Arrays.toString(array));
		return array;
	}
	
	public static int mostrarMayor() {
		
		int array[] = rellenarArray();
		int mayor= array[0];
		
		//Recorremos el array y con el bucle for para encontrar el mayor numero dentro el array
		for (int i=0; i<array.length; i++) {
			if (array[i] > mayor){
				mayor = array[i];
			}
		}
		JOptionPane.showMessageDialog(null,  " El número mayor dentro del array es: " +mayor);
		return mayor;
	}
	
	public static void numPrimo () {
		
		int num = mostrarMayor();
		boolean primo = true;
		
		/*
		 * Se comprueva el número introducido es primo o no, con el bucle for buscamos otro
		 * número que nos de como resto 0, si llegamos al número introducido sin encontrar 
		 * ninguna división con resto 0 salimos del for y devolvemos un booleano true
		 */
		
		for(int i=2; i<num; i++){
			if(num%i==0)
				primo = false;
			}
		
		if(primo == true) {
		JOptionPane.showMessageDialog(null,  " El número mayor es primo");
		}else{
		JOptionPane.showMessageDialog(null,  " El número mayor es compuesto");
		}
	}
}
