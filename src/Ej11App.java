import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * Oriol Andreazini
 */
	
	public class Ej11App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Inicializamos los dos arrays y llamamos a los métodos
			int []array1 = aleatorioArray1();			

			int [] array2 = new int [array1.length]; 
			
			aleatorioArray2(array2);
			
			multiArrays(array1, array2);
		}
		
		public static int[] aleatorioArray1(){
			
			int min =0;
			int max=10;
			
			String entrada1 = JOptionPane.showInputDialog("Introduce el número de posiciones del primer array");
			int valor1 = Integer.parseInt(entrada1);
		
			int[]array1 = new int [valor1];
			
			String entrada2 = JOptionPane.showInputDialog("Introduce el número de posiciones del segundo array");
			int valor2 = Integer.parseInt(entrada2);
		
			int [] array2 = new int [valor2];
			
			//Recorremos el array y con la clase Math.random 
			//introduce los numeros aleatorios al primer array
			for(int i=0; i<valor1; i++) {
				array1[i] = (int)(Math.random()*(max-min)+min);
				}
			//Clonamos el array1 con el array2
			array2 = array1.clone();
			
			JOptionPane.showMessageDialog(null,  "El segundo array es igual que el primero: " +Arrays.toString(array2));
		
			return array1;
		}
		
		public static void aleatorioArray2(int array1[]) {
			int min =0;
			int max=10;
			
			int[]array2 = array1;
			
			//Recorremos el array2 que es igual al array1
			//y con la clase Math.random introduce los números aleatorios al array2
			for(int i=0; i<array2.length; i++) {
				array2[i] = (int)(Math.random()*(max-min)+min);
				}
			JOptionPane.showMessageDialog(null,  "La sequencia aleatoria del segundo array es: " +Arrays.toString(array2));
		}
		
		public static void multiArrays(int array1[], int array2[]){
			
			//Creamos un nuevo array, para introducir el resultado de la multiplicacaión de arrays
			//con el .length les decimos la longitud del array
			int multiarray[]= new int [array1.length];
			
			//Recorremos el array1 y multiplicamos las dos posiciones iguales de array 1 y array2
			for(int i=0; i<array1.length; i++) {
				multiarray[i] = array1[i] * array2[i];
			}
			JOptionPane.showMessageDialog(null,  "El resultado de la multiplicación de los dos arrays: " +Arrays.toString(multiarray));
		}

	}
