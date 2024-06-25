import java.util.Scanner;

public class IntroduccionSubProgramas {
	
	/*
	 * Subfuncion o subprograma: Es un conjunto de sentencias de codigo (Bloque), las cuales
	 * estan creadas para realizar una actividad repetitiva en especifico 
	 * Cada una de estas funciones, deben ser especificas y en lo posible realizar
	 * UNA y SOLO UNA actividad.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su sueldo ");
		double sueldo1 = Double.parseDouble(sc.nextLine());
		double aporteIESS1 = sueldo1 * 0.012;
		System.out.println("Su aporte al IESS es " + aporteIESS1);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese su sueldo");
			double sueldoFuncion= Double.parseDouble(sc.nextLine());
			calcularAporteIESS(sueldoFuncion);
		}
		
	}
	
	public static void calcularAporteIESS(double sueldo) {
		double aporteIESS = sueldo * 0.012;
		System.out.println("El aporte al IESS es " + aporteIESS);
	}
}
