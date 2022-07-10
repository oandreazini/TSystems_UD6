import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * Oriol Andreazini
 */

public class Ej8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Llamamos al método mostrar valores
		*donde imprimira los valores introducidos en el método rellenarValores
		*/
		
		mostrarValores();
	}
	
	public static int[] rellenarValores() {
		
		//Creamos el array y el número de posiciones
		int array [] = new int [10];
		
		//Con el bucle for recorremos el array e introducimos el número pedido por teclado
		for (int i=0; i<array.length; i++) {
			
		String entrada = JOptionPane.showInputDialog("Introduce el número que ira a la posición " + (i+1));
		int valor = Integer.parseInt(entrada);

		array[i]= valor;
		}
		return array;
	}
	
	public static void mostrarValores() {
		
		int array[] = rellenarValores();
		
		//Imprimimos el array indicando cada posición
		System.out.println("Posición 1: " + array[0]);
		System.out.println("Posición 2: " + array[1]);
		System.out.println("Posición 3: " + array[2]);
		System.out.println("Posición 4: " + array[3]);
		System.out.println("Posición 5: " + array[4]);
		System.out.println("Posición 6: " + array[5]);
		System.out.println("Posición 7: " + array[6]);
		System.out.println("Posición 8: " + array[7]);
		System.out.println("Posición 9: " + array[8]);
		System.out.println("Posición 10: " + array[9]);
	}
}
