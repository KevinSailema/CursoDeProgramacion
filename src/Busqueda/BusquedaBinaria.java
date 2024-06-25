package Busqueda;

public class BusquedaBinaria {

	public static void main(String[] args) {
		int[] arregloABuscar = {1,2,3,4,5,6,7,8,9,10,11,12,15,16,20};
		int elementoABuscar = 5;
		
		busquedaSecuencial(arregloABuscar, elementoABuscar);
	}

	private static void busquedaSecuencial(int[] arregloABuscar, int elementoABuscar) {
		// Encontrar elemento de la mitad
		int mitad = (int) (arregloABuscar.length/2); 
		System.out.println("La mitad es " + mitad + " y su valor es " + arregloABuscar[mitad]);
		if(elementoABuscar<arregloABuscar[mitad]) {
			for(int i=0; i<mitad; i++) {
				if(elementoABuscar == arregloABuscar[i]) {
					System.out.println("Elemento Encontrado en la mitad izquierda");
				}
			}
		} else {
			for(int i = mitad; i<arregloABuscar.length; i++) {
				if(elementoABuscar == arregloABuscar[i]) {
					System.out.println("Elemento Encontrado en la mitad derecha");
				}
			}
		}
		System.out.println("Elemento no encontrado");
	}
	
	

}
