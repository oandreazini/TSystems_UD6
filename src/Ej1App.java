/*
 * Oriol Anmdreazini
 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class Ej1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0, b=0, c=0;
		
		String figura = JOptionPane.showInputDialog("Introduce la figura para calcular el área - circulo - triangulo - cuadrado");
		
		//Hacemos un switch para seleccionar la figura y proceder a calcular el área
		switch (figura) {
			case "circulo":
				areaCirculo(a,b);
				break;
			case "triangulo":
				areaTriangulo(a,b,c);
				break;
			case "cuadrado":
				areaCuadrado(a,b,c);
				break;
			default:
				JOptionPane.showMessageDialog(null,  "Entrada incorrecta");
		}
}
	
	//Metodo para calcular el área del circulo
	public static double areaCirculo (double area, double numRadio) {
	
	String radio = JOptionPane.showInputDialog("Introduce el radio del circulo:");
	
	numRadio = Double.parseDouble(radio);
		
	area= Math.PI*(Math.pow(numRadio, 2));

	JOptionPane.showMessageDialog(null,  "La área del circulo es: " +String.format(java.util.Locale.US,"%.2f", area));

	return area;
	}
	
	//Metodo para calcular el área del triangulo
	public static double areaTriangulo (double area, double base, double altura) {
	
	String numBase = JOptionPane.showInputDialog("Introduce la base del triangulo:");
	
	base = Double.parseDouble(numBase);
	
	String numAltura = JOptionPane.showInputDialog("Introduce la altura del triangulo:");
	
	altura = Double.parseDouble(numAltura);
	
	area= (base * altura)/2;
	JOptionPane.showMessageDialog(null,  "La área del triangulo es: " +String.format(java.util.Locale.US,"%.2f", area));
	
	return area;
	}
	
	//Metodo para calcular el área del cuadrado
	public static double areaCuadrado (double area, double lado1, double lado2) {
	
	String primerLado = JOptionPane.showInputDialog("Introduce un lado del cuadrado");
	
	lado1 = Double.parseDouble(primerLado);
	
	String segundoLado = JOptionPane.showInputDialog("Introduce el siguinte lado del cuadrado");
	
	lado2 = Double.parseDouble(segundoLado);
	
	area= lado1 * lado2;
	JOptionPane.showMessageDialog(null,  "La área del cuadrado es: " +String.format(java.util.Locale.US,"%.2f", area));

	return area;
	}
}
