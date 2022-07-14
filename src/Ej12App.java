import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayNumeros();

	}
	
	public static void arrayNumeros() {
		
		int min =1;
		int max=300;
		
		String entrada = JOptionPane.showInputDialog("Introduce el número de posiciones para el array");
		int valor = Integer.parseInt(entrada);
	
		int array [] = new int [valor];
		
		//Recorremos el array y con la clase Math.random introduce los números aleatorios
		for(int i=0; i<valor; i++) {
			array[i] = (int)(Math.random()*(max-min)+min);
			}

		String digito = JOptionPane.showInputDialog("Introduce un digito:");
		int dig = Integer.parseInt(digito);
		
		//Ponemos la condición de que sea superior a 0 y inferior o igual 9
		//sinó se cumple vuelve a pedir el digito
		//Recorremos el array y utilizamos el %10 porque coja solamente el ultimo digito 
		//si concide lo añadimos al arrayList
		
		while(dig<0 || dig>9) {
			JOptionPane.showMessageDialog(null, "El número introducido es incorrecto");
			digito = JOptionPane.showInputDialog("Introduce un digito:");
			dig = Integer.parseInt(digito);
			}	
		
		//Creamos un arrayList para introducir los valores que terminen con el digito introducido
		ArrayList<Integer> array1 = new ArrayList<>();
		
			for(int i=0; i<array.length; i++) {
				if(array[i]%10 == dig) {
					array1.add(array[i]);	
					}
				}
			JOptionPane.showMessageDialog(null,"Los números del array que terminan en: " +dig+ " son: " +array1);
		}
}	
		

