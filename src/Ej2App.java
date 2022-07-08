import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ej2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxMin(0,0);
		
		}
	
	public static void maxMin (int max, int min) {
		
		String minimo = JOptionPane.showInputDialog("Introduce el número más pequeño dentro del rango");
		min = Integer.parseInt(minimo);
		
		String maximo = JOptionPane.showInputDialog("Introduce el número más grande dentro del rango");
		max = Integer.parseInt(maximo);
		
		String cantidad = JOptionPane.showInputDialog("Introduce el numero de digitos aleatorios");
		int numCantidad = Integer.parseInt(cantidad);
		
		//Creamos el array y el numero de posiciones respescto a la variable numCantidad
		int array[]= new int [numCantidad];
		
		//Recorremos el array y con la clase Math.random introduce los numeros aleatorios
		for(int i=0; i<numCantidad; i++) {
			array[i] = (int)(Math.random()*(max-min)+min);
		}
		//Imprimimos el array, pasando a String			
		JOptionPane.showMessageDialog(null,  " La sequencia aleatoria es: " +Arrays.toString(array));
	}
}
