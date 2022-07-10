import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * Oriol Andreazini
 */

public class Ej9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarValores();
	}
	
	public static int[] rellenarArray(int min, int max) {
		
		min =0;
		max=9;
		
		String entrada = JOptionPane.showInputDialog("Introduce el número de posiciones para el array");
		int valor = Integer.parseInt(entrada);
		
		int array [] = new int [valor];
		
		//Recorremos el array y con la clase Math.random introduce los numeros aleatorios
		for(int i=0; i<valor; i++) {
			array[i] = (int)(Math.random()*(max-min)+min);
				}
		
		return array;
	}
	
	public static void mostrarValores() {
		
		int min =0;
		int max =0;
		int suma= 0;
		
		int array[] = rellenarArray(min,max);
		
		for (int i=0; i<array.length; i++) {
			
			suma+=array[i];
		}
			
		//Imprimimos el array, pasando a String			
		JOptionPane.showMessageDialog(null,  " La sequencia aleatoria es: " +Arrays.toString(array));
		JOptionPane.showMessageDialog(null,  " La suma del array es: " +suma); 
	}

}
