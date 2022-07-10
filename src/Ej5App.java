import javax.swing.JOptionPane;

/*
 * Oriol Anmdreazini
 */

public class Ej5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Llamamos al método binario para que lo ejecute
		binario(0);
	}

	public static String binario(int num1) {
		
		String entrada = JOptionPane.showInputDialog("Introduce un número para convertir a binario");
		num1 = Integer.parseInt(entrada);
		
		//Utilizamos el método toBinaryString para convertir un número a binario
		String salidaBinario = Integer.toBinaryString(num1);
		
		JOptionPane.showMessageDialog(null, "El binario de " +num1+ " es " +salidaBinario);
		
		return salidaBinario;
	}
}
