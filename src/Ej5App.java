import javax.swing.JOptionPane;

public class Ej5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binario(0);
	}

	public static void binario(int num1) {
		
		String entrada = JOptionPane.showInputDialog("Introduce un número para convertir a binario");
		num1 = Integer.parseInt(entrada);
		
		String salidaBinario = Integer.toBinaryString(num1);
		
		JOptionPane.showMessageDialog(null, "El binario de " +num1+ " es " +salidaBinario);
		
	}
}
