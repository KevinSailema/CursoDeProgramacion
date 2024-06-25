package arreglos;

import java.util.Iterator;
import java.util.Scanner;

public class arreglosIntroduccion {

	public static void main(String[] args) {
		/*
		 * Estructura de datos: Es una coleccion de datos HOMOGENEOS, que tiene
		 * un orden en especificos. Es decir es un conjunto de datos del mismo tipo.
		 * Utilidad de las estructuras de datos: Es para organizar y acceder a un 
		 * conjunto de datos de una manera ordenada, es decir cada una de las estructuras
		 * de datos van a permitirnos obtener datos en base de una posicino
		 * Tipos de estructuras de datos:
		 * Vectores o Arreglos: Es una estructura unidimensional, la cual
		 * me permite acceder a los datos a traves de su indice que representa
		 * su posicion. Son FINITOS.
		 * Matrices: Es una estructura bidimensional, la cual nos permite acceder a los
		 * datos a traves de una par de coordenadas que representan su posicion
		 * Pilas: Son una coleccion en la cual se mantiene un orden a traves de un indice
		 * y cuyo comportamiento se define mediante la forma LIFO, que significa
		 * el ultimo en entrar es el primero en salir. No se necesitan un tamano predeterminado
		 * Colas: Son una coleccion en la cual se mantiene un orden a traves de un indice
		 * y cuyo comportamiento se define mediante la forma FIFO, que significa
		 * el primero en entrar es el primero en salir.
		 * Colas de Prioridad:
		 * Colas circulaes:
		 * Arboles:
		 */
		
		/* Arreglos
		 * Un arreglo se va a definir de la siguiente forma.
		 * Tipo de dato "[]" nombre del arreglo = new Tipo de dato "[dimension]"
		 * Dimension: Tamano o numero de elementos que va a tener un arreglo
		 * Es decir en este caso se inicia la cuenta desde 1
		 * Posicion: La ubicacion que tiene el elemento dentro del arreglo.
		 * Es decir el indice que representa su ubicacion, este indice
		 * SIEMPRE inicia desde 0
		 */
		
		//Definicion de arreglos
		int[] arregloEntero = new int[5];
		int[] arregloEnteroLleno = {1,2,3,4,5,6};
		String [] arregloString = new String [5];
		String [] arregloStringLleno = {"T1","T2","T3","T4"};
		//llenado de datos
		arregloEntero[0] =1;
		arregloEntero[1] =2;
		arregloEntero[2] =3;
		arregloEntero[3] =4;
		arregloEntero[4] =5;
		// Impresion de datos
		System.out.println(arregloEntero[0]);
		System.out.println(arregloEntero[1]);
		System.out.println(arregloEntero[2]);
		System.out.println(arregloEntero[3]);
		System.out.println(arregloEntero[4]);
		
		// En este caso es mejor utilizar la estructura for dado es un numero
		// conocido y limitado de pasos
		int sumaValoresArreglo = 0;
		for(int i=0; i<5;i++) {
			sumaValoresArreglo = sumaValoresArreglo + arregloEntero[i];
			if(arregloEntero[i]>3) {
				System.out.println("El valor es mayor que 3");
			}
			
		}
		System.out.println("La suma es " + sumaValoresArreglo);
		// El metodo lenght devuelve la DIMENSION del arreglo.
		for(int i=0; i<arregloEnteroLleno.length; i++) {
			System.out.println(arregloEnteroLleno[i]);
		}
		/*
		 * Llenar el primer arreglo de strings mediante consola
		 * Imprimir los dos arreglos de strings.
		 * Concatenar los datos de cada uno de los arreglos
		 */
		
		// FORMA1
		// Definicion de variables
		String datoArreglo = "";
		// Scanner
		Scanner punteroArreglo = new Scanner(System.in);
		//Definicion de arreglos
		String [] arregloStrings = new String [3];
		//Llenado de datos
		System.out.println("Ingrese el primer dato ");
		datoArreglo= punteroArreglo.nextLine();
		arregloStrings[0] =datoArreglo;
		System.out.println("Ingrese el segundo dato");
		datoArreglo= punteroArreglo.nextLine();
		arregloStrings[1] =datoArreglo;
		System.out.println("Ingrese el tercer dato ");
		datoArreglo= punteroArreglo.nextLine();
		arregloStrings[2] =datoArreglo;
		//Impresion de datos
		System.out.println(arregloStrings[0]);
		System.out.println(arregloStrings[1]);
		System.out.println(arregloStrings[2]);
		
		// FORMA2
		String datoArreglo2= "";
		// Definicion de variables
		// Creacion de la dimension
		System.out.println("¿Cuantas coordenadas desea en el arreglo?");
		int cantidadCoordenadas= Integer.parseInt(punteroArreglo.nextLine());
		// Definicion de arreglos)
		String [] arregloString1= new String [cantidadCoordenadas];
		// Llenado de datos
		for(int i=0; i<cantidadCoordenadas;i++ ) {
			System.out.println("Ingrese el dato numero "+(i+1));
			datoArreglo2= punteroArreglo.nextLine();
			arregloString1[i] =datoArreglo2;
	    }
		String textoConcatenado = "";
		for(int i=0; i<cantidadCoordenadas;i++ ) {
			textoConcatenado= textoConcatenado+","+arregloString1[i];
	    }
		
		// Generar un numero randomico
		System.out.println(textoConcatenado);
		double numeroRandom= Math.random()*100;
		System.out.println((int)numeroRandom);
	}
}
