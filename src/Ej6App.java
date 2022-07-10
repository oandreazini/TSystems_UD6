import javax.swing.JOptionPane;

/*
 * Oriol Anmdreazini
 */
public class Ej6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Llamamos al método binario para que lo ejecute
		contadorCifras(0);
	}
	
	public static int contadorCifras(int num1) {
		
		int cifras = 0;
		
		String entrada = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(entrada);
		
		/*Con el if else comprovamos que el número introducido por teclado sea mayor a 0
		 *positivo, y con el while operamos para obtener el número de cifras
		 */
		
		if(num1>0){
			
			while(num1!=0) {
				num1 = num1/10;
				cifras ++;		
			}
			
			JOptionPane.showMessageDialog(null, "El numero " +entrada+ " tiene " +cifras+ " cifras");
			
		}else {
			JOptionPane.showMessageDialog(null, "El numero " +entrada+ " es negativo");
		}
		return cifras;
	}
}
