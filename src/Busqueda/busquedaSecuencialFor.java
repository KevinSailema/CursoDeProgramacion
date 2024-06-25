package Busqueda;

public class busquedaSecuencialFor {

	public static void main(String[] args) {
		int[] arregloABuscar = new int [100];
		int elementoABuscar = 5;
		
		arregloABuscar = llenarElementos(arregloABuscar.length);
		busquedaSecuencial(arregloABuscar, elementoABuscar);
	}

	public static void busquedaSecuencial(int[] arregloABuscar, int elementoABuscar) {
		for(int i=0; i<arregloABuscar.length; i++) {
			if(arregloABuscar[i]== elementoABuscar) {
				System.out.println("Elemento Encontrado en la posicion " + i);
				break; // Si encuentra termina el ciclo
			} else {
				System.out.println("Elemento no encontrado");
			}
		}
		
	}

	public static int[] llenarElementos(int tamano) {
		int [] arregloALlenar = new int [tamano];
		
		for (int i=0; i<tamano; i++) {
			arregloALlenar[i] = (int)(Math.random()*50);
		}
		return arregloALlenar;
	}



}
	