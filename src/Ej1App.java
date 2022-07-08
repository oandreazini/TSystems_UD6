import java.util.Scanner;
import java.lang.Math;

public class Ej1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0, b=0, c=0;
		String circulo= "circulo";
		String triangulo= "triangulo";
		String cuadrado ="cuadrado";
		
		System.out.println("Elige la figura para calcular el área circulo, triangulo, cuadrado");
		
		Scanner sc = new Scanner(System.in);
		String figura = sc.nextLine();
		
		if(figura.equals(circulo)) {
		areaCirculo(a,b);
		}else {
			if(figura.equals(triangulo)) {
				areaTriangulo(a,b,c);
			} else {
				if(figura.equals(cuadrado)) {
					areaCuadrado(a,b,c);
			}
		}
	}
}
	
	public static double areaCirculo (double area, double numRadio) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el radio del circulo:");
	
	String radio = sc.nextLine();
	sc.close();
	
	numRadio = Double.parseDouble(radio);
	System.out.println("El radio introducido es: " +numRadio);
	
	area= Math.PI*(Math.pow(numRadio, 2));
	System.out.printf("El área del circulo es: %.2f", area);
	
	return area;
	}
	
	public static double areaTriangulo (double area, double base, double altura) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce la base del triangulo:");
	
	String numBase = sc.nextLine();
	
	base = Double.parseDouble(numBase);
	System.out.println("La base introducida es: " +base);
	
	System.out.println("Introduce la altura del triangulo:");
	
	String numAltura = sc.nextLine();
	sc.close();
	
	altura = Double.parseDouble(numAltura);
	System.out.println("La altura introducida es: " +altura);
	
	area= (base * altura)/2;
	System.out.printf("El área del triangulo es: %.2f", area);
	
	return area;
	}
	
	public static double areaCuadrado (double area, double lado1, double lado2) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce un lado del cuadrado:");
	
	String primerLado = sc.nextLine();
	
	lado1 = Double.parseDouble(primerLado);
	System.out.println("El lado introducido es: " +lado1);
	
	System.out.println("Introduce el siguinte lado del cuadrado:");
	
	String segundoLado = sc.nextLine();
	sc.close();
	
	lado2 = Double.parseDouble(segundoLado);
	System.out.println("El lado introducido es: " +lado2);
	
	area= lado1 * lado2;
	System.out.printf("El área del cuadrado es: %.2f", area);
	
	return area;
	}
}
