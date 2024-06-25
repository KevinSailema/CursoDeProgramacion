import java.util.Scanner;
/*
 * Libreria: Una libreria es un conjunto de funciones precargadas dentro del IDE
 * de programacion. Las cuales se corresponden con un lenguaje de programacion.
 */


public class IngresoDatos {

	public static void main(String[] args) {
		/*
		 * Ingreso de datos: Es el proceso con el cual el usuario puede interactuar 
		 * con el programa. Para ingresar datos o contestar preguntas
		 * dentro del programa
		 * 1) Ingreso de datos por consola: Es la interaccion mas basica que puede
		 * tener un usario o programador para introducir datos
		 * 1.1) Datos por consola puros: Este tipo de ingreso de datos
		 * esta dado por el uso de la consola o ventana de depuracion de un programa.
		 * Adicionalmente, mediante este tipo de ingreso se lo realiza a traves de
		 * un cursor
		 * 1.2) Datos por consola en cuadros de dialogo: Este tipo de ingreso de datos
		 * es un tipo de ingreso mas dinamico, dado que nos presenta una interface
		 * basica en donde se pueden ingresar datos.
		 * 
		 * 2) Ingreso de datos por archivo(BDD*): Es cargar un conjunto de datos mediante
		 * un archivo, por ejemplo se pueden tener archivos txt, csv...
		 * 3) Ingreso de datos por interfaces: Es tipo de ingreso de datos es aquel
		 * que necesita una ventana (Front End) para que el usuario interactue o ingrese
		 * los datos requeridos.
		 */
		
		/*
		 *  Ingreso datos por consola: Se utulizarda la ventana de presentacion de resultados
		 *  ademas de que se necesitara del uso un cursor para el ingreso
		 */
		
		// Creacion del scanner
		Scanner cursorIngreso = new Scanner(System.in);
		// Creacion de la pregunta
		System.out.println("Ingrese su nombre");
		// Creacion y asignacion de la variable que va a guardar lo ingresado en el scanner
		String nombreConsola= cursorIngreso.nextLine();
		
		System.out.println("Nombre ingresado por la consola " + nombreConsola);
		
		System.out.println("Ingrese su apellido");
		String apellidoConsola = cursorIngreso.nextLine();
		System.out.println("La longitud es " + apellidoConsola.length());
		
		// Ingreso de numeros
		System.out.println("Ingrese el numero de miembros de su familia");
		String miembrosFamilia = cursorIngreso.nextLine();
		
		// Conversion de un string a un entero
		// Bloques try y catch (investigar)
		int numeroMiembrosFamilia = Integer.parseInt(miembrosFamilia);
		int bono = 100 * Integer.parseInt(miembrosFamilia);
		System.out.println("El bono de su familia es: "+ bono);
		
		// Uso for Miembros Familia
		for(int i=0; i <numeroMiembrosFamilia; i++) {
			System.out.println("Ingrese el nombre ");
			String nombre = cursorIngreso.nextLine();
			System.out.println("El nombre familiar es " + nombre);
		}
		
		// Conversion de un String a un doble
		System.out.println("Ingrese su sueldo");
		String sueldoConsola = cursorIngreso.nextLine();
		double numerosSueldo = Double.parseDouble(sueldoConsola);
		System.out.println("El sueldo es: " + numerosSueldo);
		
		// Conversion de un String a un caracter
		String caracter= "0";
		char caracterConvertido = caracter.charAt(0);
		// Conversion de un String a un flotante
		String flotante = "12";
		float flotanteConvertido = Float.parseFloat(flotante);
		
		
		/*
		 * Menu para un restaurante: Entradas, Platos fuertes, Postres.
		 * 2 Entradas, platos fuertes, postres Ingresados por consola.
		 * 6 variables, entrada1, entrada2, pf1, pf,...
		 * Escoger una opcion. Entradas => Imprimir entradas 
		 */
	}

}
