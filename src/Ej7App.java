import javax.swing.JOptionPane;

/*
 * Oriol Anmdreazini
 */

public class Ej7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Llamamos al método cambioMoneda para que lo ejecute des del main
		int a=0;
		String resultado="a";
		cambioMoneda(a,resultado);
	}

	public static void cambioMoneda (double moneda, String tipo) {
		
		String entrada = JOptionPane.showInputDialog("Introduce la cantidad de euros a convertir: ");
		moneda = Double.parseDouble(entrada);
		
		tipo = JOptionPane.showInputDialog("Introduce el tipo de moneda (dolares, yenes o libras): "); 
		
		switch (tipo) {
		case "dolares":
			moneda = moneda*1.28611;
			JOptionPane.showMessageDialog(null,  moneda);
			break;
		case "yenes":
			moneda = moneda*129.852;
			JOptionPane.showMessageDialog(null,  moneda);
			break;
		case "libras":
			moneda = moneda*0.86;	
			JOptionPane.showMessageDialog(null,  moneda);
			break;
		default:
			JOptionPane.showMessageDialog(null,  "Entrada incorrecta");
		}
	}
}
