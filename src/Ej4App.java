/*
 * Oriol Anmdreazini
 */

import javax.swing.JOptionPane;

public class Ej4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Llamamos al método binario para que lo ejecute
		factorial(0);
	}

	public static void factorial (int num1) {
		
		int num2 = 1;
		
		String entrada = JOptionPane.showInputDialog("Introduce un número para calcular el factorial");
		num1 = Integer.parseInt(entrada);
		
		/* Multiplicamos el número introducido por el num2, y con el bucle while vamos multiplicando
		 * el resultado por un número menos
		 * */
		while(num1!=0) {
			num2=num1*num2;
			num1--;
		}
		JOptionPane.showMessageDialog(null,"El resultado es: " +num2);
	}
}
