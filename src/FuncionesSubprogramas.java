import java.util.Scanner;

public class FuncionesSubprogramas {

	/*
	 * Divide y venceras
	 * Partes de un subprograma:
	 * 1) Tipo de acceso: Es la capacidad que tienen las clases para poder
	 * acceder a los subprogramas, estos pueden ser
	 * Publico, privado o protegido.
	 * 1.1 Publico public: Que el metodo se puede ver a lo largo de toda la clase
	 * o en clases que se encuentren dentro del mismo proyecto
	 * 1.2 Privado private: Que elmetodo SOLO se puede ver dentreo de la clase
	 * que lo creo.
	 * 1.3 Protegido protected: que el metodo se puede ver en todas las clases de un
	 * mismo proyecto, sin embargo este no se puede modificar.
	 * 2) Pertenencia o Static: La pertenencia de un metodo, esta representado en una clase
	 * si el metodo se va a utilizar dentro de la misma clase.
	 * 3) Valores de retorno: Un metodo puede retornar o no valores, es decir
	 * un metodo puede realizar la operacion para la cual fue creado, y devolver un valor
	 * el cual puede ser utilizado en la clase principal, o simplemente
	 * realizar una operacion para mostrar un resultado
	 * 3.1- No retorno de valores void: Significa que toda la operacion
	 * va a ser realizada en el metodo, NORMALMENTE con los metodos void
	 * el programador solo imprime mensajes
	 * 3.2 Retorno de valores: Esta indicado para tipos de datos primitivos
	 * PARA NUESTRO CURSO, es decir, el programador puede retornar
	 * enteros, dobles, flotantes, texto, caracteres, booleanos.
	 * 4) Nombre de un metodo: Es como el programador lo va a poder llamar dentro
	 * de la clase principal.
	 * 5) Firma. Es la identificacion de un metodo, esta firma puede componer 
	 * de 0 o varios parametros (Parametro es ub valor que interactua con el metodo).
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * Se desea crear una calculadora con las cuatro operaciones basicas
		 * para esto se va a ingresar por consola dos numeros y la opcion
		 * que me pertmia realizar la operacion.
		 * Adicionalmente para la suma y la multiplicacion se desea realizar
		 * el calculo del 10& de su resultado.
		 */
		
		
		// Definicion de variables
		double numero1 = 0;
		double numero2 = 0;
		double resultado = 0;
		String operacion = "";
		boolean bandera = true;
		String continuarOpe = "";
		
		// Operaciones
		while(bandera == true) {
			Scanner ingresoDatos= new Scanner(System.in);
			System.out.println("Ingrese el primer numero");
			numero1 = Double.parseDouble(ingresoDatos.nextLine());
			System.out.println("Ingrese el segundo numero");
			numero2 = Double.parseDouble(ingresoDatos.nextLine());
			System.out.println("Ingrese la operacion");
			operacion = ingresoDatos.nextLine().toLowerCase();
			
			switch (operacion) {
			case "suma":
				calcularPorcentaje(calculadoraSuma(numero1, numero2));
				break;
			case "resta":
				calculadoraResta(numero1, numero2);
				break;
			case "multiplicacion":
				calcularPorcentaje(calculadoraMulti(numero1, numero2));
				break;
			case "division":
				calculadoraDivision(numero1, numero2);
				break;
			default:
				System.out.println("No ha escogido una operacion correcta");
				break;
			}
			System.out.println("Desea relizar otra operacion SI/NO");
			continuarOpe = ingresoDatos.nextLine().toUpperCase();
			if(continuarOpe.equals("NO")) {
				bandera = false;
			}
		}

	}
	
	// Creacion de metodos
	// Metodo Suma
	public static double calculadoraSuma(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1+numero2;
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;	
	}
	// Metodo Resta
	public static void calculadoraResta(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1-numero2;
		System.out.println("El resultado de la resta es: " + resultado);	
	}
	// Metodo Multiplicacion
	public static double calculadoraMulti(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1*numero2;
		System.out.println("El resultado de la multiplicacion es: " + resultado);	
		return resultado;
	}
	// Metodo Division
	public static void calculadoraDivision(double numero1, double numero2) {
		double resultado = 0;
		resultado = numero1/numero2;
		System.out.println("El resultado de la division es: " + resultado);
		
	}
	// Metodo Calculo de Procentaje
	public static void calcularPorcentaje(double resultado) {
		double porcentaje= 0;
		porcentaje = resultado*0.1;
		System.out.println("El porcentaje del resultado es: "+porcentaje);
	}


}
