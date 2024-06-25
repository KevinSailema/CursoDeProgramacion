import java.util.Scanner;

public class RefuerzoArreglos {

	public static void main(String[] args) {
		char [] arregloCaracter = new char [100];
		int [] arregloEntero = new int [5];
		int dimension = 0;
		String operacion = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite la opcion correcta");
		operacion = sc.nextLine();
		switch (operacion) {
		case "caracter":
			// Uso el metodo para respetar la dimension definida anteriormente
			arregloCaracter = llenarArregloChar(arregloCaracter.length);
			calcularMaximo(arregloCaracter);
			imprimirArregloChar(arregloCaracter);
			break;
		case "entero":
			
			break;
		case "texto":
			System.out.println("Digite la dimension del arreglo");
			dimension = Integer.parseInt(sc.nextLine());
			String [] arregloString= new String [dimension];
			break;
		default:
			break;
		}
		

	}

	public static void imprimirArregloChar(char[] arregloCaracter) {
		System.out.print("[");
		for(int i = 0 ; i< arregloCaracter.length;i++) {
			System.out.print(arregloCaracter[i]+"; ");

		}
		System.out.print("]");
	}
	
	public static void calcularMaximo(char[] arregloCaracter) {
		int valInicialMax = arregloCaracter[0];
		for(int i=0 ; i <  arregloCaracter.length ; i++) {
			if(valInicialMax > arregloCaracter[i]) {
				valInicialMax = valInicialMax;
		} else {
			valInicialMax = arregloCaracter[i];
			}
		}
		System.out.println("El valor maximo dentro del arreglo es " + valInicialMax);

	}
	
	public static char[] llenarArregloChar(int dimension) {
		char [] arregloRetorno = new char [dimension];
		for (int i =0 ; i < arregloRetorno.length; i++) {
			 // Caracteres que se encuentren entre 50 y 100
			 // Math.random devuelve valores entre 0 y 1 pero no se incluyen a si mismas
			arregloRetorno[i] = (char)((Math.random()*51)+50);
			}
			return arregloRetorno;
	}

}
